package com.tolulonge.cleanarchitectureerrorhandling.data

import com.tolulonge.cleanarchitectureerrorhandling.domain.MyRepository
import com.tolulonge.cleanarchitectureerrorhandling.util.Resource
import kotlinx.coroutines.delay
import kotlin.random.Random

class MyRepositoryImpl: MyRepository {
    override suspend fun submitEmail(email: String): Resource<Unit> {
        delay(500L)
       return if (Random.nextBoolean()){
             Resource.Success(Unit)
        }else{
            if (Random.nextBoolean()){
                Resource.Error("Server Error")
            }else {
                Resource.Error("Not Authenticated Error")
            }
        }
    }
}