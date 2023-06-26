package com.neppplus.loginuikotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.loginuikotlintest.databinding.ActivityMainBinding // 추가

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {

            // 아이디 입력 값, 비번 입력값을 각각의 변수에 저장
            val inputId = binding.idEdt.text.toString()
            val inputPw = binding.passwordEdt.text.toString()
            
            // 두개의 변수에 들어있는 값 검사. (맞는 아이디/비번)
            // 맞을 때 => 틀릴 때 분기 처리. (if 활용)
            if (inputId == "admin@test.com" && inputPw == "qwer"){
                //둘 다 맞다면 => 관리자 입니다. 토스트
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                //아이디, 비번 둘 중 하나라도 틀리면 로그인 실패 토스트
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
            

        }

    }
}