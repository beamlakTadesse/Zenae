package com.gebeya.exercise.zenae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.gebeya.exercise.zenae.Base.BaseActivity
import com.gebeya.exercise.zenae.data.model.LogedInUser
import com.gebeya.exercise.zenae.data.model.User
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {
    var userArray = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val username = username.text.toString()
        val fullname = fullname.text.toString()
        val email = email.text.toString()
        val password = password_rgister.text.toString()
        val confirmPass =confirm_password_rgister.text.toString()
        if(password=== confirmPass){
            var user= User(username,email,fullname,password)
            LogedInUser(user)
        }
        else {
            Toast.makeText(this,"Password missmach",Toast.LENGTH_LONG)
        }
        register.setOnClickListener(View.OnClickListener {
            intent = Intent(this, HomeActivity::class.java)
            // intent.putExtra("user",user)
            startActivity(intent)
        })
        }

    }

