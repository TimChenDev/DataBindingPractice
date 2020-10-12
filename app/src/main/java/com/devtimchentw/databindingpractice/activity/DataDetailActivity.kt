package com.devtimchentw.databindingpractice.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.devtimchentw.databindingpractice.R
import com.devtimchentw.databindingpractice.databinding.ActivityDataDetailBinding
import com.devtimchentw.databindingpractice.entity.BetBean
import com.google.gson.Gson

/**
 * show data detail with data binding
 */
class DataDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDataDetailBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_data_detail
            )
        setContentView(binding.root)


        val beanData = intent.getStringExtra("data")
        val tmpBean = Gson().fromJson(beanData, BetBean::class.java)
        binding.betBean = tmpBean

    }

}
