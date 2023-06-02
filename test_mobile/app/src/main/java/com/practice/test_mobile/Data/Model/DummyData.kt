package com.practice.test_mobile.Data.Model

//employee 01
const val name  ="Henry"
const val lastName  ="Escobar"
const val email  ="henry.escobar@citala.edu.sv"
const val description  ="Hola soy un trabajador"

//employee 02
const val name2  ="Eduardo"
const val lastName2  ="Lima"
const val email2  ="eduardohen@gmail.com"
const val description2  ="Hola soy un scrum master"

var employees = mutableListOf(
    EmployeeModel(name, lastName, email, description),
    EmployeeModel( name2, lastName2, email2, description2),
    EmployeeModel( name2, lastName, email2, description)
)

