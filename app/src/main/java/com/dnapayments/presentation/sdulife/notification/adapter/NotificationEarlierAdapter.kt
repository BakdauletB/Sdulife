package com.dnapayments.presentation.sdulife.notification.adapter

import android.widget.TextView
import com.dnapayments.R
import com.dnapayments.data.model.NotificationEarlier
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class NotificationEarlierAdapter :
        BaseAdapter<NotificationEarlier>(R.layout.item_notification_earlier){

    override fun bindViewHolder(holder: ViewHolder, data: NotificationEarlier) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_title).text  = data.title
            findViewById<TextView>(R.id.tv_date).text = data.date
            findViewById<TextView>(R.id.tv_hour).text = data.hour
            findViewById<TextView>(R.id.tv_ago).text = data.ago
        }
    }
}