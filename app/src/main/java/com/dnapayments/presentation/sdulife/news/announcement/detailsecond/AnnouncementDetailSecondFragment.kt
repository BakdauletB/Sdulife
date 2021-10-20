package com.dnapayments.presentation.sdulife.news.announcement.detailsecond

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.databinding.FragmentAnnoucementDetailSecondBinding
import com.dnapayments.utils.base.BaseBindingFragment

class AnnouncementDetailSecondFragment :
        BaseBindingFragment<FragmentAnnoucementDetailSecondBinding>(R.layout.fragment_annoucement_detail_second){

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            toolbar.setOnClickListener {
                onBackPressed()
            }
        }
    }
}