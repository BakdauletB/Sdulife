package com.dnapayments.presentation.sdulife.news.announcement.adapter

import android.widget.TextView
import com.dnapayments.R
import com.dnapayments.data.model.AnnouncementData
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder


class AnnouncementAdapter(private val myCallback: (result:Int) -> Unit) : BaseAdapter<AnnouncementData>(R.layout.item_announcement) {
    override fun bindViewHolder(holder: ViewHolder, data: AnnouncementData) {
        holder.itemView.run {
            findViewById<TextView>(R.id.club).text = data.club
            findViewById<TextView>(R.id.title).text = data.title
            findViewById<TextView>(R.id.date).text = data.date

            setOnClickListener {
                myCallback.invoke(data.announcement_id)
            }
        }
    }
}