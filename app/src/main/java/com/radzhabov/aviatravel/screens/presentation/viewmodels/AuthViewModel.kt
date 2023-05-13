package com.radzhabov.aviatravel.screens.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.radzhabov.aviatravel.screens.data.model.User
import com.radzhabov.aviatravel.screens.data.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val user = MutableLiveData(User.defaultUser())

    fun login(): LiveData<Boolean?> {
        val resultOfSign = MutableLiveData<Boolean?>(null)
        
        viewModelScope.launch {
            user.value?.let {
                val user = userRepository.login(it.email, it.password)
                resultOfSign.postValue(user != null)
            }
        }
        return resultOfSign
    }

    fun register() {
        viewModelScope.launch {
            user.value?.let { userRepository.register(it) }
        }
    }

}