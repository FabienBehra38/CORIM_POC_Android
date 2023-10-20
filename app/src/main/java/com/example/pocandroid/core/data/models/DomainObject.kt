package com.example.poc_android.core.data.models

import java.util.Date

open class DomainObject(open val shapeType: String, open val id: String) {
    var libelle: String = "";
    var dateModif: Date = Date("0001-01-01");
    var dateCreation: Date = Date("0001-01-01");
    var dateDerniereSynchro: Date = Date("0001-01-01");
    var userModif: String = ""
    var userCreation: String = ""
    var actif: Boolean = true
}