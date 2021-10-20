package com.dnapayments.presentation.sdulife.development.test.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.Test
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class TestAdapter :
    BaseAdapter<Test>(R.layout.item_test){
    override fun bindViewHolder(holder: ViewHolder, data: Test) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_week)
            findViewById<TextView>(R.id.tv_date)
            findViewById<TextView>(R.id.tv_overview)
            Glide.with(holder.itemView.context)
                .load(data.img)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                        .dontAnimate().error(R.drawable.ic_document_placeholder)
                )
                .into(findViewById(R.id.iv_list))
        }
    }
}