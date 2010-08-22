/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import org.jooq.Field;
import org.jooq.InCondition;

/**
 * @author Lukas Eder
 */
class InConditionImpl<T> extends AbstractQueryPart implements InCondition<T> {

	private static final long serialVersionUID = -1653924248576930761L;
	private final Field<T> field;
	private final Set<T> values;

	InConditionImpl(Field<T> field, Set<T> values) {
		this.field = field;
		this.values = values;
	}

	@Override
	public int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
		int result = initialIndex;

		for (T value : values) {
			bind(stmt, result++, field, value);
		}
		
		return result;
	}

	@Override
	public Set<T> getValues() {
		return values;
	}

	@Override
	public Field<T> getField() {
		return field;
	}

	@Override
	public String toSQLReference(boolean inlineParameters) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getField().toSQLReference(inlineParameters));
		sb.append(" in (");
		
		String separator = "";
		for (T value : getValues()) {
			sb.append(separator);
			sb.append(FieldTypeHelper.toSQL(value, inlineParameters, getField()));
			separator = ", ";
		}
		
		sb.append(")");
		
		return sb.toString();
	}
}