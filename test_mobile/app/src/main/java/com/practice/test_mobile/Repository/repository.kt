package com.practice.test_mobile.Repository

import com.practice.test_mobile.Data.Model.EmployeeModel

class repository (private val employees: MutableList<EmployeeModel>) {
    fun getEmployees () = employees

    fun setEmployee (employee: EmployeeModel) = employees.add(employee)
}