package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Notification(
    val title : String?,
    val date : String?,
    val hour : String?,
    val ago : String?
) :Parcelable