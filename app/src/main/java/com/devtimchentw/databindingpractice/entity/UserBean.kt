package com.devtimchentw.databindingpractice.entity

import com.google.gson.Gson

/**
 *  @author Tim Chen
 *  @date   on 2020-10-12
 *  @desc
 */
data class UserBean(
    var userName: String = "預設名稱",
    var userPhone: String = "預設電話號碼"
) {
    companion object {
        override fun toString(): String {
            return Gson().toJson(this)
        }
    }
}