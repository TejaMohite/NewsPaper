package com.tejamohite.newspaper.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class NewspaperItem(
    @SerializedName("title") val title: String,
    @SerializedName("state") val state: String,
    @SerializedName("lccn") val lccn: String,
    @SerializedName("url") val url: String
) : Parcelable