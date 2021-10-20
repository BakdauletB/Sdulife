package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Appointment(
    val sex: String?,
    val fullName: String?,
    val position: String?,
    val img: String?,
) : Parcelable