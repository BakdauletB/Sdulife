package com.dnapayments.presentation.characters.details

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dnapayments.data.Resource
import com.dnapayments.data.model.Character
import com.dnapayments.data.repository.CharacterDetailedRepository
import com.dnapayments.utils.base.BaseViewModel
import kotlinx.coroutines.launch

class DetailsViewModel(private val repository: CharacterDetailedRepository) : BaseViewModel() {
    var characterDetail = ObservableField<Character>()
    val success = MutableLiveData<Boolean>()

    fun fetchCharacterById(id: Int) {
        viewModelScope.launch {
            val response = repository.fetchCharacterById(id)
            when (response.status) {
                Resource.Status.SUCCESS -> {
                    response.data?.let {
                        characterDetail.set(it[0])
                        success.value = true
                    }
                }
                Resource.Status.ERROR -> {
                    response.errorMessage.let {
                        error.value = it
                    }
                }
                else -> {
                }
            }
        }
    }
}
