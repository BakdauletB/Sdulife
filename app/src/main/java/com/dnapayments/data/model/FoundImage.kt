package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class FoundImage(
    val char_id: Int,
    val img: String?,
) : Parcelable