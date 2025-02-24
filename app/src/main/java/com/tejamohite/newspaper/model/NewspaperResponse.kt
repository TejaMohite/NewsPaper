package com.tejamohite.newspaper.model

import com.google.gson.annotations.SerializedName

data class NewspaperResponse(
    @SerializedName("newspapers") val newspapers: List<NewspaperItem>
)