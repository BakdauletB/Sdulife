package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Test(
    val img: String?,
    val week: String?,
    val date: String?,
    val overview: String?,
): Parcelable