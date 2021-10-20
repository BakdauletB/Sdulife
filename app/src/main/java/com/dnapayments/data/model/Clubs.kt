package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Clubs(
    val char_id: Int,
    val img: String?,
    val title: String?,
    val overview : String?,
    val count : String?,
) : Parcelable