package com.Raihan.intent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahObjectActivity : AppCompatActivity() {

    private lateinit var tvPenerimaObject : TextView

    companion object{
        const val EXTRA_CARS ="extra_cars"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_object)

        tvPenerimaObject = findViewById(R.id.tv_penerima_object)

        val cars: Cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "Merk : ${cars.merk.toString()} \nTahun: ${cars.tahun.toString()} \nPlat: ${cars.plat.toString()}"
        tvPenerimaObject.text = text
    }
}