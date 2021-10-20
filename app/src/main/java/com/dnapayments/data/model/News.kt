package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val news_id: Int,
    val title: String?,
    val img: String?,
    val date: String?,
) : Parcelable