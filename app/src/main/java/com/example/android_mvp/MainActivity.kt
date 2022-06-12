package com.example.android_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    private lateinit var etSisi: EditText
    private lateinit var btnHitungLuasPersegi: Button
    private lateinit var btnHitungKelilingPersegi: Button
    private lateinit var tvHasilPersegi: TextView

    private lateinit var  mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        etSisi = findViewById(R.id.et_sisi)
        btnHitungLuasPersegi = findViewById(R.id.btn_hitung_luas_persegi)
        btnHitungKelilingPersegi = findViewById(R.id.btn_hitung_keliling_persegi)
        tvHasilPersegi = findViewById(R.id.tv_hasil_persegi)

        btnHitungLuas.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPanjang(panjang, lebar)
        }

        btnHitungKeliling.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPanjang(panjang, lebar)
        }

        btnHitungLuasPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }

        btnHitungKelilingPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }

    override fun updateLuas(luas: Float) {
        tvHasil.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }

    override fun updateLuasPersegi(luaspersegi: Float) {
        tvHasilPersegi.text = luaspersegi.toString()
    }

    override fun updateKelilingPersegi(kelilingpersegi: Float) {
        tvHasilPersegi.text = kelilingpersegi.toString()
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }

}
