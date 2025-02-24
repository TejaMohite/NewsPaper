package com.tejamohite.newspaper.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tejamohite.newspaper.model.NewspaperItem
import com.tejamohite.newspaper.repository.NewspaperRepository

import kotlinx.coroutines.launch


class NewspaperViewModel(private val repository: NewspaperRepository) : ViewModel() {
    private val _newspapers = MutableLiveData<List<NewspaperItem>>()
    val newspapers: LiveData<List<NewspaperItem>> get() = _newspapers

    init {
        fetchNewspapers()
    }

    private fun fetchNewspapers() {
        viewModelScope.launch {
            _newspapers.value = repository.getNewspapers()
        }
    }
}