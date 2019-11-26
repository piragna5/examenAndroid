package com.anzen.android.examenandroid.utils

interface ResponseListener<T> {
    fun onSuccess(responseObject: T)
    fun onError(error: String)
}