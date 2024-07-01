package com.example.inclassproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.inclassproject.databinding.ActivityGameBinding
import com.example.inclassproject.databinding.ActivityMainBinding

class Game : AppCompatActivity() {

    lateinit var binding: ActivityGameBinding
    private var player = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_game)
        player = true
        binding.textView3.setText("Player 1")

        binding.iv1.tag = 11
        binding.iv2.tag = 12
        binding.iv3.tag = 13
        binding.iv4.tag = 14
        binding.iv5.tag = 15
        binding.iv6.tag = 16
        binding.iv7.tag = 17
        binding.iv8.tag = 18
        binding.iv9.tag = 19

        binding.iv1.setOnClickListener{
            if(binding.iv1.tag != 1 && binding.iv1.tag != 2){
                if (player){
                    binding.iv1.setImageResource(R.drawable.player1)
                    binding.iv1.tag = 1

                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv1.setImageResource(R.drawable.player2)
                    binding.iv1.tag = 2

                    player = true
                    binding.textView3.setText("Player 1")
                }
            }
            win()
        }

        binding.iv2.setOnClickListener{
            if(binding.iv2.tag != 1 && binding.iv2.tag != 2){
                if (player){
                    binding.iv2.setImageResource(R.drawable.player1)
                    binding.iv2.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv2.setImageResource(R.drawable.player2)
                    binding.iv2.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }

            win()
        }

        binding.iv3.setOnClickListener{
            if(binding.iv3.tag != 1 && binding.iv3.tag != 2){
                if (player){
                    binding.iv3.setImageResource(R.drawable.player1)
                    binding.iv3.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv3.setImageResource(R.drawable.player2)
                    binding.iv3.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }

            win()
        }

        binding.iv4.setOnClickListener{
            if(binding.iv4.tag != 1 && binding.iv4.tag != 2){
                if (player){
                    binding.iv4.setImageResource(R.drawable.player1)
                    binding.iv4.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv4.setImageResource(R.drawable.player2)
                    binding.iv4.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }

            win()
        }
        binding.iv5.setOnClickListener{
            if(binding.iv5.tag != 1 && binding.iv5.tag != 2){
                if (player){
                    binding.iv5.setImageResource(R.drawable.player1)
                    binding.iv5.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv5.setImageResource(R.drawable.player2)
                    binding.iv5.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }

            win()
        }
        binding.iv6.setOnClickListener{
            if(binding.iv6.tag != 1 && binding.iv6.tag != 2){
                if (player){
                    binding.iv6.setImageResource(R.drawable.player1)
                    binding.iv6.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv6.setImageResource(R.drawable.player2)
                    binding.iv6.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }


            win()
        }
        binding.iv7.setOnClickListener{
            if(binding.iv7.tag != 1 && binding.iv7.tag != 2){
                if (player){
                    binding.iv7.setImageResource(R.drawable.player1)
                    binding.iv7.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv7.setImageResource(R.drawable.player2)
                    binding.iv7.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }


            win()
        }
        binding.iv8.setOnClickListener{
            if(binding.iv8.tag != 1 && binding.iv8.tag != 2){
                if (player){
                    binding.iv8.setImageResource(R.drawable.player1)
                    binding.iv8.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv8.setImageResource(R.drawable.player2)
                    binding.iv8.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }
            win()
        }
        binding.iv9.setOnClickListener{
            if(binding.iv9.tag != 1 && binding.iv9.tag != 2){
                if (player){
                    binding.iv9.setImageResource(R.drawable.player1)
                    binding.iv9.tag = 1
                    player = false
                    binding.textView3.setText("Player 2")

                }else{
                    binding.iv9.setImageResource(R.drawable.player2)
                    binding.iv9.tag = 2
                    player = true
                    binding.textView3.setText("Player 1")
                }
            }

            win()
        }




    }

    fun win(){
        if(binding.iv1.getTag()==binding.iv2.getTag() && binding.iv1.getTag()==binding.iv3.getTag() && binding.iv2.getTag() == binding.iv3.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv4.getTag()==binding.iv5.getTag() && binding.iv4.getTag()==binding.iv6.getTag() && binding.iv5.getTag() == binding.iv6.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv7.getTag()==binding.iv8.getTag() && binding.iv8.getTag()==binding.iv9.getTag() && binding.iv7.getTag() == binding.iv9.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv1.getTag()==binding.iv4.getTag() && binding.iv1.getTag()==binding.iv7.getTag() && binding.iv4.getTag() == binding.iv7.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv2.getTag()==binding.iv5.getTag() && binding.iv2.getTag()==binding.iv8.getTag() && binding.iv5.getTag() == binding.iv8.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv3.getTag()==binding.iv6.getTag() && binding.iv9.getTag()==binding.iv3.getTag() && binding.iv6.getTag() == binding.iv9.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv1.getTag()==binding.iv5.getTag() && binding.iv9.getTag()==binding.iv1.getTag() && binding.iv5.getTag() == binding.iv9.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
        if(binding.iv3.getTag()==binding.iv5.getTag() && binding.iv3.getTag()==binding.iv7.getTag() && binding.iv5.getTag() == binding.iv7.getTag()){
            val intent = Intent(this,Finish::class.java)
            if(player){
                intent.putExtra("winner", "player2")
            }else{
                intent.putExtra("winner", "player1")
            }
            startActivity(intent)
        }
    }

}