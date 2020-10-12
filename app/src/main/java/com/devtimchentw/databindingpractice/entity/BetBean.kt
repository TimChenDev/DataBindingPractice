package com.devtimchentw.databindingpractice.entity

import com.google.gson.Gson

/**
 *  @author Tim Chen
 *  @date   on 2020-10-08
 *  @desc
 */
data class BetBean(

    // 投注 id
    var betId: Int = 0,
    // 投注時間
    var betTime: String = "2020-10-08 13:00:00",
    // 下注金額
    var betAmount: Double = 0.0,
    // 下注內容
    var betContent: List<String> = arrayListOf("01", "05", "07"),
    // 開獎內容
    var drawContent: List<String> = arrayListOf("01", "02", "03"),
    // 投注輸贏
    var betWin: Double = 0.0

) {
    companion object {
        /**
         * 假資料
         */
        fun dummyItem(betId: Int, amount: Double) =
            BetBean(
                betId = betId,
                betAmount = amount
            )
    }

    override fun toString(): String {
        return Gson().toJson(this)
    }
}