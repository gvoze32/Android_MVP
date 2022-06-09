package com.example.android_mvp

interface MainView {
    fun updateLuas(luas: Float)
    fun updateKeliling(keliling: Float)
    fun showError(errorMsg: String)
}