package com.example.poc_android.core.data.remote.dataSources

import com.example.poc_android.core.data.models.Article
import com.example.poc_android.core.data.repositories.ArticleRepository
import kotlinx.coroutines.flow.Flow

class RemoteArticleDataSource : ArticleRepository {
    override suspend fun getByCode(code: String): Flow<Article> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }

    override suspend fun getById(id: String): Flow<Article> {
        TODO("Not yet implemented")
    }

    override suspend fun add(obj: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun save(obj: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun saveBulk(list: List<Article>) {
        TODO("Not yet implemented")
    }
}
