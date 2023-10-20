package com.example.poc_android.core.data.models

import com.example.poc_android.core.data.local.entities.ArticleEntity
import com.example.poc_android.core.data.remote.models.RemoteArticle

data class Article (override val id: String, override val shapeType: String) : DomainObject(shapeType, id) {
    var designation: String = ""
    var code: String = ""
    var uniteGestionProposeeId: String = ""
    var familleArticleId: String = ""
    var note: String = ""
    var imagePath: String = ""
    var refFabricant: String = ""
    var vendu: Boolean = false
    var achete: Boolean = false
    var suiviParLot: Boolean = false
    var sitesUtilisateurs: String = ""
    var stocke: Boolean = false
    var fabriquantId: String = ""
    var typeArticleId: String = ""

    fun asArticleEntity() = ArticleEntity(id = id, libelle = libelle, designation = designation)

    fun asRemoteArticle() = RemoteArticle(id = id, libelle = libelle)
}
