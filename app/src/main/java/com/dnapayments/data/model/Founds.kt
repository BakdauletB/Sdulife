package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Founds(
    val found_id: Int,
    val title: String?,
    val img: String?,
    val date: String?,
    val hour: String?,
) : Parcelable