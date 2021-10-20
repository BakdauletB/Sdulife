package com.dnapayments.presentation.sdulife.news.announcement.detail

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentAnnouncementDetailBinding
import com.dnapayments.utils.base.BaseBindingFragment

class AnnouncementDetailFragment :
        BaseBindingFragment<FragmentAnnouncementDetailBinding>(R.layout.fragment_announcement_detail){
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            arguments?.getInt("announcement_id").let {

            }
            btnAddNow.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_announcement_detail_to_navigation_announcement_success)
            }
            toolbar.setOnClickListener {
                onBackPressed()
            }


        }
    }
}