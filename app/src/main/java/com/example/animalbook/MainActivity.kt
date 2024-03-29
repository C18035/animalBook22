package com.example.animalbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub.titleFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment=titleFragment as? Title_Fragment
        fragment?.setTitle("フラグメント動物図鑑")
        nextButton.setOnClickListener {
            var intent= Intent(this,subActivity::class.java)
            startActivity(intent)
        }
    }
}
