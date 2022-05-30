package com.example.test.advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.R
import com.example.test.databinding.ActivityLambdaBinding

class LambdaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLambdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLambdaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLambda.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // to do ...
            }
        })
        //1-5. 익명 내부 함수
        //1) Kotlin interface가 아닌 Java interface여야 한다.
        //2) 그 인터페이스는 딱 하나의 메소드만 가져야 한다.
        binding.btnLambda.setOnClickListener {
            // to do ..
        }
    }
}