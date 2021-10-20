package com.dnapayments.presentation.sdulife.news.announcement.success

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentAnnouncementsuccessBinding
import com.dnapayments.utils.base.BaseBindingFragment

class AnnouncementSuccessFragment :
        BaseBindingFragment<FragmentAnnouncementsuccessBinding>(R.layout.fragment_announcementsuccess){
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            btnBackToMenu.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_announcement_success_to_navigation_announcement_detail_second)
            }
        }
    }
}