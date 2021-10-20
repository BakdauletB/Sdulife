package com.dnapayments.presentation.sdulife.notification

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.data.model.Notification
import com.dnapayments.data.model.NotificationEarlier
import com.dnapayments.databinding.FragmentNotificationBinding
import com.dnapayments.presentation.sdulife.notification.adapter.NotificationAdapter
import com.dnapayments.presentation.sdulife.notification.adapter.NotificationEarlierAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class NotificationFragment :
        BaseBindingFragment<FragmentNotificationBinding>(R.layout.fragment_notification){
    companion object{
        private val TAG = NotificationFragment::class.java
    }

    private var notificationAdapter: NotificationAdapter? = null
    private var notificationEarlierAdapter: NotificationEarlierAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            notificationAdapter = NotificationAdapter()
            notificationAdapter?.setData(
                arrayListOf(
                    Notification(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    Notification(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    Notification(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    Notification(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                )
            )
            rvToday.adapter = notificationAdapter

            notificationEarlierAdapter = NotificationEarlierAdapter()
            notificationEarlierAdapter?.setData(
                arrayListOf(
                    NotificationEarlier(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    NotificationEarlier(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    NotificationEarlier(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                    NotificationEarlier(
                        title = "Hackathon",
                        date = "10.01.2021",
                        hour = "17:00 - 19:00",
                        ago = "2 minutes ago"
                    ),
                )
            )
            rvEarlier.adapter = notificationEarlierAdapter
        }
    }
}