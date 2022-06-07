package com.example.mvpsimple

interface MainView {
    fun updateLuas(luas: Float)
    fun updateKeliling(keliling: Float)
    fun showError(errorMsg: String)
}