package com.example.inclassproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.inclassproject.databinding.ActivityFinishBinding

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityFinishBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_finish)
        var data = intent.getStringExtra("winner")
        binding.textView4.setText(data + " won")
    }
}