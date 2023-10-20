package com.example.poc_android.core.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.poc_android.core.data.models.Article
import com.example.poc_android.core.data.local.entities.Entity as BaseEntity
import com.example.poc_android.core.data.models.DomainObject

@Entity(tableName = "Article")
data class ArticleEntity (
    @PrimaryKey val id: String,
    val libelle: String,
    val designation: String
) : BaseEntity()
{
    var code: String = ""

    fun asExternalModel(): Article {
        var article = Article(this.id, this.libelle);
        article.designation = designation;

        return article;
    }
}

