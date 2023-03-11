package com.example.mealzapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.CategoryResponse
import com.example.domain.usecase.MealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(private val mealsUseCase: MealsUseCase) : ViewModel() {

    private val _state = MutableStateFlow<CategoryResponse?>(null)
    val state = _state.asStateFlow()


    fun getMeals() {
        viewModelScope.launch {
                _state.value = mealsUseCase()
        }

    }
}