package com.dnapayments.presentation.sdulife.development.recommendation.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.Recommendation
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class RecommendationAdapter :
        BaseAdapter<Recommendation>(R.layout.item_recommendation_you){
        override fun bindViewHolder(holder: ViewHolder, data: Recommendation) {
                holder.itemView.apply {
                        findViewById<TextView>(R.id.tv_text)
                        Glide.with(holder.itemView.context)
                                .load(data.img)
                                .apply(
                                        RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                                                .dontAnimate().error(R.drawable.ic_document_placeholder)
                                )
                                .into(findViewById(R.id.img_image))
                }
        }
}