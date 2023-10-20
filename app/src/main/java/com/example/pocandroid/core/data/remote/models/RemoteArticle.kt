package com.example.poc_android.core.data.remote.models

import androidx.room.Ignore
import com.example.poc_android.core.data.local.entities.ArticleEntity
import kotlinx.serialization.Serializable

@Serializable
data class RemoteArticle(val id: String, val libelle: String) {

    fun asExternalModel(): ArticleEntity = ArticleEntity(this.id, this.libelle, "");
}
