package com.tolulonge.cleanarchitectureerrorhandling.data

import com.tolulonge.cleanarchitectureerrorhandling.domain.MyRepository
import com.tolulonge.cleanarchitectureerrorhandling.util.Resource
import com.tolulonge.cleanarchitectureerrorhandling.util.UiText
import kotlinx.coroutines.delay
import kotlin.random.Random

class MyRepositoryImpl: MyRepository {
    override suspend fun submitEmail(email: String): Resource<Unit> {
        delay(500L)
       return if (Random.nextBoolean()){
             Resource.Success(Unit)
        }else{
            if (Random.nextBoolean()){
                Resource.Error(UiText.DynamicString("Server Error"))
            }else {
                Resource.Error(UiText.DynamicString("Not Authenticated Error"))
            }
        }
    }
}