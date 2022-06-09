package com.example.android_mvp

class MainPresenter (private val mainView: MainView) {
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        val keliling = 2*(panjang+lebar)
        mainView
    }

    fun hitungLuasPersegi(panjang: Float, lebar: Float){
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val luas = panjang*lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegi(panjang: Float, lebar: Float){
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val keliling = 2*(panjang+lebar)
        mainView.updateKeliling(keliling)
    }
}