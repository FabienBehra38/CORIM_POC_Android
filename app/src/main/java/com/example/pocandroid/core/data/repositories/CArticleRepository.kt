package com.example.poc_android.core.data.repositories

import android.util.Log
import com.example.poc_android.core.data.local.dataSources.LocalArticleDataSource
import com.example.poc_android.core.data.models.Article
import com.example.poc_android.core.data.remote.dataSources.RemoteArticleDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import java.lang.Exception

class CArticleRepository (private val remoteArticleDataSource: RemoteArticleDataSource,
                          private val localArticleDataSource: LocalArticleDataSource) : ArticleRepository{

    override suspend fun getByCode(code: String): Flow<Article> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Flow<List<Article>> = flow {
        //Logique souhaitée :
        // - Lire la source de donnée locale et la retournée
        var localArticles = localArticleDataSource.getAll().flatMapConcat { it.asFlow() }.toList()
        emit(localArticles)

        try {
            var apiArticles = remoteArticleDataSource.getAll().flatMapConcat { it.asFlow() }.toList()
            localArticleDataSource.saveBulk(apiArticles)
            emit(apiArticles)
        }
        catch (ex: Exception) {
            Log.e(ex.message, ex.stackTraceToString());
        }
    }

    override suspend fun getById(id: String): Flow<Article> = flow {
        var localArticle = localArticleDataSource.getById(id)
        localArticle.collect { article -> emit(article)}

        try {
            TODO("Queue les synchros à faire.")
        }
        catch (ex: Exception){

        }
    }

    override suspend fun delete(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun add(obj: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun save(obj: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun saveBulk(list: List<Article>) {
        TODO("Not yet implemented")
    }
}
