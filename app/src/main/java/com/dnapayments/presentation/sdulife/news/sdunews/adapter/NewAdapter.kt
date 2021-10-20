package com.dnapayments.presentation.sdulife.news.sdunews.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.News
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class NewAdapter(private val myCallBack : (result: Int) -> Unit) :
            BaseAdapter<News>(R.layout.item_news){
    override fun bindViewHolder(holder: ViewHolder, data: News) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_title).text = data.title
            findViewById<TextView>(R.id.tv_date).text = data.date
            Glide.with(holder.itemView.context)
                .load(data.img)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                        .dontAnimate().error(R.drawable.ic_document_placeholder)
                )
                .into(findViewById(R.id.iv_photo))

            setOnClickListener {
                myCallBack.invoke(data.news_id)
            }
        }
    }
}