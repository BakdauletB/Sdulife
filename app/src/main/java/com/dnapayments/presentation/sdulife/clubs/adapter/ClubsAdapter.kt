package com.dnapayments.presentation.sdulife.clubs.adapter


import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.Clubs
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class ClubsAdapter(private val myCallback: (result:Int) -> Unit) :
        BaseAdapter<Clubs>(R.layout.item_clubs){
         override fun bindViewHolder(holder: ViewHolder,data: Clubs){
             holder.itemView.apply {
                 findViewById<TextView>(R.id.title).text = data.title
                 findViewById<TextView>(R.id.overview).text = data.overview
                 findViewById<TextView>(R.id.count).text = data.count
                 Glide.with(holder.itemView.context)
                     .load(data.img)
                     .apply(
                         RequestOptions.placeholderOf(R.drawable.ic_document_placeholder)
                             .dontAnimate().error(R.drawable.ic_document_placeholder)
                     )
                     .into(findViewById(R.id.iv_clubs))

                 setOnClickListener {
                     myCallback.invoke(data.char_id)
                 }
             }
         }
}