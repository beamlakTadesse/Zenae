package com.gebeya.exercise.zenae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gebeya.exercise.zenae.Base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,MainActivity::class.java.simpleName)
        })
    }
}