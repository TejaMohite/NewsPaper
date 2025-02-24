package com.tejamohite.newspaper.repository

import com.tejamohite.newspaper.api.NewspaperApi
import com.tejamohite.newspaper.model.NewspaperItem

class NewspaperRepository(private val api: NewspaperApi) {
    suspend fun getNewspapers(): List<NewspaperItem> {
        return api.getNewspapers().newspapers
    }
}