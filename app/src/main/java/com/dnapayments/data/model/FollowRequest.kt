package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class FollowRequest(
    val profile_id: Int,
    val number: String?,
    val img: String?,
    val full_name : String?,
    val id : String?,
) : Parcelable