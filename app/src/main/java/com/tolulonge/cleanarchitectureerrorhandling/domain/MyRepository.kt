package com.tolulonge.cleanarchitectureerrorhandling.domain

import com.tolulonge.cleanarchitectureerrorhandling.util.Resource

interface MyRepository {
    suspend fun submitEmail(email: String): Resource<Unit>
}