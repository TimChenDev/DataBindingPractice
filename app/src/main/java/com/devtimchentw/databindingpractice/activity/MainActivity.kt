package com.devtimchentw.databindingpractice.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.devtimchentw.databindingpractice.R
import com.devtimchentw.databindingpractice.entity.BetBean

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_data1 -> {
                goToNextActivity(BetBean.dummyItem(1, 222.22).toString())
            }
            R.id.btn_data2 -> {
                goToNextActivity(BetBean.dummyItem(2, 3293.22).toString())
            }
            R.id.btn_test_edit_text -> {
                val intent = Intent(this@MainActivity, BindEditTextActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun goToNextActivity(extraData: String) {
        val intent = Intent(this@MainActivity, DataDetailActivity::class.java)
        intent.putExtra("data", extraData)
        startActivity(intent)
    }
}
