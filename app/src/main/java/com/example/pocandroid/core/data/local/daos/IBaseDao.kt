package com.example.poc_android.core.data.local.daos

import androidx.room.Delete
import androidx.room.RawQuery
import androidx.room.Upsert
import com.example.poc_android.core.data.local.entities.Entity
import kotlinx.coroutines.flow.Flow

interface IBaseDao<T : Entity> {

    @Delete
    fun delete(obj: T)

    @Delete
    fun delete(objects: List<T>)

    @Upsert
    fun upsert(obj: T)

    @Upsert
    fun upsert(objects: List<T>)
}