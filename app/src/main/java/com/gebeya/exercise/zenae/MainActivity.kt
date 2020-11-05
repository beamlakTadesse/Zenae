package com.gebeya.exercise.zenae

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.gebeya.exercise.zenae.Base.BaseActivity
import com.gebeya.exercise.zenae.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont.setOnClickListener(View.OnClickListener {
            intent = Intent(this, LoginActivity::class.java.simpleName)

        })
    }
}