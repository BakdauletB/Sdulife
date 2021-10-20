package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecommendationVideo(
    val img : String?,
    val title : String?,
    val date: String?,

) : Parcelable