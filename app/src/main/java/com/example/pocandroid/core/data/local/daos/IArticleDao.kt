package com.example.poc_android.core.data.local.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.poc_android.core.data.local.entities.ArticleEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class IArticleDao : BaseDao<ArticleEntity>("article"), IBaseDao<ArticleEntity>
{
    @Query("SELECT * FROM article WHERE code = :code")
    abstract fun getByCode(code: String) : Flow<ArticleEntity>
}