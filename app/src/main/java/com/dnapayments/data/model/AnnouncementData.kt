package com.dnapayments.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnnouncementData(
    var announcement_id: Int,
    var club: String?,
    var title: String?,
    var date: String?)
    : Parcelable