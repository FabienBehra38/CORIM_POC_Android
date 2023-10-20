package com.example.poc_android.core.data

import android.content.Context
import com.example.poc_android.core.data.local.AppDatabase
import com.example.poc_android.core.data.local.dataSources.LocalArticleDataSource
import com.example.poc_android.core.data.repositories.ArticleRepository

interface IAppContainer {
    val articleRepository: ArticleRepository
}

class AppContainer(private val context: Context) : IAppContainer {

    override val articleRepository: ArticleRepository by lazy {
        LocalArticleDataSource(AppDatabase.getDatabase(context).articleDao())
    }
}