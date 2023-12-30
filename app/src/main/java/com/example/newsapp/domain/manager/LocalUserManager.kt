package com.example.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

/**
 * This interface saves the app entry when the user clicks on get started in onboarding
 * screen
 */
interface LocalUserManager {
    suspend fun saveAppEntry()
    fun readAppEntry(): Flow<Boolean>
}