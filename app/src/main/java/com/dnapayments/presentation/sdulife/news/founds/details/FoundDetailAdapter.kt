package com.dnapayments.presentation.sdulife.news.founds.details

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.FoundImage
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class FoundDetailAdapter(private val myCallBack: (result: Int) -> Unit) :
    BaseAdapter<FoundImage>(R.layout.item_founds_image) {
    override fun bindViewHolder(holder: ViewHolder, data: FoundImage) {
        holder.itemView.apply {
            Glide.with(holder.itemView.context)
                .load(data.img)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                    .dontAnimate().error(R.drawable.ic_document_placeholder))
                .into(findViewById(R.id.images))

        }
    }
}