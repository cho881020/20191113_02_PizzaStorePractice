package com.tjoeun.a20191113_02_pizzastorepractice.datas

import java.io.Serializable

class PizzaStoreData(name:String, phoneNum:String, logoUrl:String) : Serializable {

    var name = name
    var phoneNum = phoneNum
    var logoUrl = logoUrl

}