package com.tolulonge.cleanarchitectureerrorhandling.domain

import com.tolulonge.cleanarchitectureerrorhandling.R
import com.tolulonge.cleanarchitectureerrorhandling.data.MyRepositoryImpl
import com.tolulonge.cleanarchitectureerrorhandling.util.Resource
import com.tolulonge.cleanarchitectureerrorhandling.util.UiText

class SubmitEmailUseCase(
    private val repository: MyRepository = MyRepositoryImpl()
) {

    suspend fun execute(email: String) : Resource<Unit> {
        if(!email.contains("@")){
            return Resource.Error(UiText.StringResource(R.string.error_invalid_email))
        }
        return repository.submitEmail(email)
    }
}