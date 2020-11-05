package com.gebeya.exercise.zenae.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gebeya.exercise.zenae.R
import com.gebeya.exercise.zenae.data.model.News
import kotlinx.android.synthetic.main.news_item_layout.view.*

class NewsAdapter(var news:ArrayList<News>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.NewsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item_layout,parent,false)
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.NewsViewHolder, position: Int) {
      holder.date.text = news[position].date
        holder.newsPublisher.text = news[position].publisher
        holder.newsTitle.text = news[position].title
       // holder.newsImage.setImageDrawable
        holder.card.setOnClickListener(View.OnClickListener {

        })
    }
     class NewsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
       var newsImage = itemView.news_image
         var newsTitle = itemView.news_title
         var newsPublisher = itemView.news_publisher
         var date = itemView.date
         var card = itemView.news_card

    }
}

