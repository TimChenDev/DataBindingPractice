package com.devtimchentw.databindingpractice.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.devtimchentw.databindingpractice.R
import com.devtimchentw.databindingpractice.databinding.ActivityBindEditTextBinding
import com.devtimchentw.databindingpractice.entity.UserBean
import kotlinx.android.synthetic.main.activity_bind_edit_text.*

class BindEditTextActivity : AppCompatActivity() {

    private val mUserBean =
        UserBean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding =
            DataBindingUtil.setContentView<ActivityBindEditTextBinding>(
                this,
                R.layout.activity_bind_edit_text
            )

        dataBinding.userBean = mUserBean

        btn_print_data.setOnClickListener {
            Toast.makeText(this, mUserBean.toString(), Toast.LENGTH_SHORT).show()
        }

        setContentView(dataBinding.root)
    }
}
