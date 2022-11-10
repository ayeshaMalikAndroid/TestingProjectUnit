package com.example.testingapplication


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilaTest{

    @Test
    fun emptyUsernameReturnsFalse(){
        val result = RegistrationUtila.validation(

            userName = "",
            password = "",
            ""

        )
      //  Assert.assertFalse(result)
        assertThat(result).isFalse()
    }

    @Test
    fun validateUserName(){
        val result = RegistrationUtila.validation(

            userName = "ABC",
            password = "123",
            "123"

        )
        assertThat(result).isTrue()
     //   assertThat("Ayesha").isEqualTo("Ayesha")

    }


    @Test
    fun emptyPasswordReturnsFalse(){
        val result = RegistrationUtila.validation(

            userName = "ABC",
            password = "",
            ""

        )
        assertThat(result).isFalse()
    }

    @Test
    fun inCorrectConfirmedPasswordReturnsFalse(){
        val result = RegistrationUtila.validation(

            userName = "ABC",
            password = "123",
            "asdsadsa"

        )
        assertThat(result).isFalse()
    }
    @Test
    fun `less than 2 digit password returns false`(){
        val result = RegistrationUtila.validation(

            userName = "ABC",
            password = "ab",
            "ab"

        )
        assertThat(result).isFalse()
    }


}