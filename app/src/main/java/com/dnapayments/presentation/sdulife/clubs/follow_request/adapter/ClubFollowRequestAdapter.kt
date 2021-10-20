package com.dnapayments.presentation.sdulife.clubs.follow_request.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.FollowRequest
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class ClubFollowRequestAdapter :
        BaseAdapter<FollowRequest>(R.layout.item_followrequest){

    override fun bindViewHolder(holder: ViewHolder, data: FollowRequest) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_number).text = data.number
            findViewById<TextView>(R.id.tv_fullname).text = data.full_name
            findViewById<TextView>(R.id.tv_id).text = data.id.toString()
            Glide.with(holder.itemView.context)
                .load(data.img)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                        .dontAnimate().error(R.drawable.ic_document_placeholder)
                )
                .into(findViewById(R.id.iv_person))

        }
    }
}