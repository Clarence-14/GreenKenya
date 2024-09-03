package com.example.greenkenya.models

class Account {

    var name:String = ""
    var location:String = ""
    var estate:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, location: String, estate: String,imageUrl: String, id: String) {
        this.name = name
        this.location = location
        this.estate= estate
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()

}