package com.bogleo.datasourcelibrary.data

import androidx.core.net.toUri
import java.util.*

object DataProvider {

    fun createData(
        domain: String,
        deep: String,
        data: MutableMap<String, Any>?,
        uId: String,
        gadId: String
    ): String {
        return domain.toUri().buildUpon()
            .apply {
                appendQueryParameter("Q1FToSjRqR", "U4dYMJiuWd")
                appendQueryParameter(
                    "vtYilUC9l6",
                    TimeZone.getDefault().id
                )
                appendQueryParameter("WmBR8KVYU1", gadId)
                appendQueryParameter("Si6chIFCvg", deep)
                appendQueryParameter(
                    "XgJIhQwfKe",
                    if (deep != "null") "deeplink"
                    else data?.get("media_source").toString()
                )
                appendQueryParameter("OoDYyIyTjd", uId)
                appendQueryParameter(
                    "ckaY3EBYXq",
                    data?.get("adset_id").toString()
                )
                appendQueryParameter(
                    "y0XPGzGtEC",
                    data?.get("campaign_id").toString()
                )
                appendQueryParameter(
                    "ge3AROWalQ",
                    data?.get("campaign").toString()
                )
                appendQueryParameter(
                    "2EGq9UqSvi",
                    data?.get("adset").toString()
                )
                appendQueryParameter(
                    "TsHpXdJyqP",
                    data?.get("adgroup").toString()
                )
                appendQueryParameter(
                    "9PaHRX1SUp",
                    data?.get("orig_cost").toString()
                )
                appendQueryParameter(
                    "OSzSHHhmSP",
                    data?.get("af_siteid").toString()
                )
            }
            .build()
            .toString()
    }
}