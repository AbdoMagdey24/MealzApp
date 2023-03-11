package com.example.mealzapp.di

import com.example.data.remote.ApiServices
import com.example.data.repo.MealsRepoImp
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideMealsRepo(apiServices: ApiServices) : MealsRepo{
        return MealsRepoImp(apiServices)
    }
}