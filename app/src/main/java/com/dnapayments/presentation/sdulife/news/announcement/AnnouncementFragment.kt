package com.dnapayments.presentation.sdulife.news.announcement

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.dnapayments.R
import com.dnapayments.data.model.AnnouncementData
import com.dnapayments.databinding.FragmentAnnouncementBinding
import com.dnapayments.presentation.sdulife.news.announcement.adapter.AnnouncementAdapter
import com.dnapayments.utils.base.BaseBindingFragment


class AnnouncementFragment :
    BaseBindingFragment<FragmentAnnouncementBinding>(R.layout.fragment_announcement) {
    private var adapter: AnnouncementAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            adapter = AnnouncementAdapter {
                findNavController().navigate(R.id.action_navigation_news_to_navigation_announcement_detail)
            }
            recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
            recyclerView.adapter = adapter
            adapter?.setData(
                arrayListOf(
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                    AnnouncementData(1,"VISION CLUB", "BETA-CAREER","25/10/2020"),
                )
            )

        }
    }

}