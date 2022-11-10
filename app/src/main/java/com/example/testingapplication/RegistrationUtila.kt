package com.example.testingapplication

object RegistrationUtila {


    fun validation(
        userName: String,
        password: String,
        confirmationPassword: String

    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (password != confirmationPassword) {
            return false
        }
        if (password.count(){it.isDigit()} <2){
            return false
        }
        return true
    }

//return true if input is valid
}