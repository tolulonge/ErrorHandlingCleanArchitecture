package com.tolulonge.cleanarchitectureerrorhandling.domain

import com.tolulonge.cleanarchitectureerrorhandling.data.MyRepositoryImpl
import com.tolulonge.cleanarchitectureerrorhandling.util.Resource

class SubmitEmailUseCase(
    private val repository: MyRepository = MyRepositoryImpl()
) {

    suspend fun execute(email: String) : Resource<Unit> {
        if(!email.contains("@")){
            return Resource.Error("That is not a valid email")
        }
        return repository.submitEmail(email)
    }
}