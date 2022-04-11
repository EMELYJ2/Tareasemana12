package com.example.tareasemana12programacion

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Glide.with(applicationContext).load(R.drawable.fondi).into(fondito)
        startTimer()
    }
    fun startTimer(){
        object: CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intento = Intent(applicationContext, MainActivity2::class.java)
                startActivity(intento)
                finish()
            }
        }.start()
    }
}