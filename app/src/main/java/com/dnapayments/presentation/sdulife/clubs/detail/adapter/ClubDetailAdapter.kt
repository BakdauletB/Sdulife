package com.dnapayments.presentation.sdulife.clubs.detail.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.ClubDetail
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class ClubDetailAdapter(private val myCallback: (result:Int) -> Unit) :
        BaseAdapter<ClubDetail>(R.layout.item_club_detail){
    override fun bindViewHolder(holder: ViewHolder, data: ClubDetail) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_club_overview).text = data.overview
            findViewById<TextView>(R.id.tv_club_date).text = data.date
            Glide.with(holder.itemView.context)
                .load(data.img)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                        .dontAnimate().error(R.drawable.ic_document_placeholder)
                )
                .into(findViewById(R.id.iv_club_detail))
            setOnClickListener {
                myCallback.invoke(data.club_id)
            }
        }
    }
}