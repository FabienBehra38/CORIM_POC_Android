package com.example.poc_android.core.data.local.dataSources

import com.example.poc_android.core.data.local.daos.IArticleDao
import com.example.poc_android.core.data.local.entities.ArticleEntity
import com.example.poc_android.core.data.models.Article
import com.example.poc_android.core.data.repositories.ArticleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalArticleDataSource(private val articleDao: IArticleDao) : ArticleRepository {

    override suspend fun getByCode(code: String): Flow<Article> = articleDao.getByCode(code).map { it.asExternalModel() }

    override suspend fun getAll(): Flow<List<Article>> = articleDao.getAll().map { it.map(ArticleEntity::asExternalModel) }

    override suspend fun getById(id: String): Flow<Article> = articleDao.getById(id).map { it.asExternalModel() }

    override suspend fun add(obj: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(article: Article) = articleDao.delete(article.asArticleEntity())

    override suspend fun save(article: Article) = articleDao.upsert(article.asArticleEntity())

    override suspend fun saveBulk(list: List<Article>) {
        TODO("Not yet implemented")
    }
}