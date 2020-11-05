package com.gebeya.exercise.zenae

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.gebeya.exercise.zenae.Adapters.NewsAdapter
import com.gebeya.exercise.zenae.Base.BaseActivity
import com.gebeya.exercise.zenae.data.model.News
import kotlinx.android.synthetic.main.content_home.*

class HomeActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        var user =intent.getStringArrayListExtra("user")
        var news = News("","COVID-19: Vaccines","EBC","We don’t yet know exactly when a safe and effective COVID-19 vaccine will be ready for distribution, but we estimate that it could be in early to mid-2021. Before COVID-19 vaccines can be delivered, several important challenges must be overcome",
        "28 October 2020 ")
        var newsList = ArrayList<News>()
        for(i in 1..5){
          newsList.add(news)
        }
        val layoutManager = LinearLayoutManager(applicationContext)
                news_RV.layoutManager = layoutManager
        news_RV.adapter = NewsAdapter(newsList)
        }
    }