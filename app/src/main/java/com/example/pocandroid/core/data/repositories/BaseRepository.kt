package com.example.poc_android.core.data.repositories

import com.example.poc_android.core.data.models.DomainObject
import kotlinx.coroutines.flow.Flow

interface BaseRepository<T : DomainObject> {

    suspend fun getAll(): Flow<List<T>>

    suspend fun getById(id: String) : Flow<T>

    suspend fun add(obj: T)

    suspend fun delete(obj: T)

    suspend fun save(obj: T)

    suspend fun saveBulk(list: List<T>)
}