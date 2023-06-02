package com.practice.test_mobile

import android.app.Application
import com.practice.test_mobile.Data.Model.employees
import com.practice.test_mobile.Repository.repository

class EmployeeReviewerApplication: Application() {

    val employeeRepository: repository by lazy {
        repository(employees)
    }
}