/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
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
 * . Neither the name "jOOQ" nor the names of its contributors may be
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
package org.jooq.examples;


import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.Department;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.Employee;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.EmployeeAddress;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.EmployeeDepartmentHistory;
import static org.jooq.examples.sqlserver.adventureworks.person.Tables.Contact;
import static org.jooq.impl.Factory.val;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.impl.Factory;
import org.jooq.util.sqlserver.SQLServerFactory;

public class AdventureWorks {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;integratedSecurity=true");

        Factory create = new SQLServerFactory(connection);

        System.out.println(create
              .select(Employee.getFields())
              .select(val("###"))
              .select(Department.getFields())
              .select(val("###"))
              .select(Contact.getFields())
              .from(Employee)
              .join(EmployeeAddress).using(Employee.EmployeeID)
              .join(EmployeeDepartmentHistory).using(Employee.EmployeeID)
              .join(Department).using(Department.DepartmentID)
              .join(Contact).using(Contact.ContactID)
              .fetch());
    }
}
