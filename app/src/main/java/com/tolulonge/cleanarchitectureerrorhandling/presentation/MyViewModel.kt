package com.tolulonge.cleanarchitectureerrorhandling.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class MyViewModel {
    var email by mutableStateOf("")
    private set

    var error by mutableStateOf(null)
    private set

    fun onEmailChanged(email : String) {
        this.email = email
    }


}