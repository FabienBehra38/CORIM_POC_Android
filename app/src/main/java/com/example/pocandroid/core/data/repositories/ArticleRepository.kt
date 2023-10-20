package com.example.poc_android.core.data.repositories

import com.example.poc_android.core.data.models.Article
import kotlinx.coroutines.flow.Flow

interface ArticleRepository : BaseRepository<Article> {

    suspend fun getByCode(code: String) : Flow<Article>
}