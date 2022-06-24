package com.tolulonge.cleanarchitectureerrorhandling.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tolulonge.cleanarchitectureerrorhandling.domain.SubmitEmailUseCase
import com.tolulonge.cleanarchitectureerrorhandling.util.Resource
import com.tolulonge.cleanarchitectureerrorhandling.util.UiText
import kotlinx.coroutines.launch


class MyViewModel(
    private val submitEmailUseCase: SubmitEmailUseCase = SubmitEmailUseCase()
) : ViewModel(){
    var email by mutableStateOf("")
    private set

    var error by mutableStateOf<UiText?>(null)
    private set

    fun onEmailChanged(email : String) {
        this.email = email
    }

    fun submitEmail(){
        viewModelScope.launch {
            val result = submitEmailUseCase.execute(email)
            when(result){
                is Resource.Success -> {

                }
                is Resource.Error -> {
                    error = result.message
                }
            }
        }
    }


}