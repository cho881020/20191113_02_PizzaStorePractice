package com.tjoeun.a20191113_02_pizzastorepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.tjoeun.a20191113_02_pizzastorepractice.datas.PizzaStoreData
import kotlinx.android.synthetic.main.activity_store_detail.*

class StoreDetailActivity : BaseActivity() {

    var storeData:PizzaStoreData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        storeData = intent.getSerializableExtra("store") as PizzaStoreData

        Glide.with(mContext).load(storeData?.logoUrl).into(logoImg)
        storeNameTxt.text = storeData?.name
        storePhoneTxt.text = storeData?.phoneNum


    }

}
