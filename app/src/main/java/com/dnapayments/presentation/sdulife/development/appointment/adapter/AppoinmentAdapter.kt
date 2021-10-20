package com.dnapayments.presentation.sdulife.development.appointment.adapter

import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dnapayments.R
import com.dnapayments.data.model.Appointment
import com.dnapayments.utils.base.BaseAdapter
import com.dnapayments.utils.base.ViewHolder

class AppoinmentAdapter :
        BaseAdapter<Appointment>(R.layout.item_appointment){
        override fun bindViewHolder(holder: ViewHolder, data: Appointment) {
                holder.itemView.apply {
                        findViewById<TextView>(R.id.tv_sex).text = data.sex
                        findViewById<TextView>(R.id.tv_full_name).text = data.fullName
                        findViewById<TextView>(R.id.position).text = data.position
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