package com.tjoeun.a20191113_02_pizzastorepractice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    var mContext:Context = this

    abstract fun setupEvents()
    abstract fun setValues()

}