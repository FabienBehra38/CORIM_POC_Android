package com.example.poc_android.core.data.local.daos

import androidx.room.RawQuery
import androidx.sqlite.db.SimpleSQLiteQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.example.poc_android.core.data.local.entities.Entity
import kotlinx.coroutines.flow.Flow

abstract class BaseDao<T : Entity> (private val tableName: String) {

    @RawQuery
    protected abstract fun getById(query: SupportSQLiteQuery) : Flow<T>

    @RawQuery
    protected abstract fun getAll(query: SupportSQLiteQuery) : Flow<List<T>>

    fun getById(id: String) : Flow<T> {
        val query = SimpleSQLiteQuery("SELECT * FROM $tableName WHERE id = $id")
        return getById(query)
    }

    fun getAll() : Flow<List<T>> {
        val query = SimpleSQLiteQuery("SELECT * FROM $tableName")
        return getAll(query)
    }
}