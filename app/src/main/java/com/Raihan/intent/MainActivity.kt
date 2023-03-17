package com.Raihan.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah = findViewById(R.id.btnPindah)

        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObject = findViewById<Button>(R.id.btn_pindah_object)

        btnPindah.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObject.setOnClickListener(this)


    }

    override fun onClick(p0: View) {
      when(p0.id){
          R.id.btnPindah -> run {
              val pindahIntent = Intent(this@MainActivity, MainActivity2::class.java)
              startActivity(pindahIntent)
          }

          R.id.btn_pindah_data -> run {
              val intentData = Intent(this@MainActivity, PindahDataActivity::class.java)
              intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "Bentar Lagi Puasa")
              startActivity(intentData)

          }
          R.id.btn_pindah_object -> run {
              val cars = Cars(
                  "Toyota Yaris",
                  2020,
                  "BM 2020 SAR"

              )
              val intentObjek = Intent(this@MainActivity, PindahObjectActivity::class.java)
              intentObjek.putExtra(PindahObjectActivity.EXTRA_CARS, cars)
              startActivity(intentObjek)

          }
        }
    }
}