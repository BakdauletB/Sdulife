package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ClubDetail(
    val club_id: Int,
    val img: String?,
    val overview : String?,
    val date : String?,
) : Parcelable