package com.example.data.repo

import com.example.data.remote.ApiServices
import com.example.domain.repo.MealsRepo

class MealsRepoImp (private val apiService:ApiServices) : MealsRepo {

    override suspend fun getMealsFromRemote() = apiService.getMeals()
}