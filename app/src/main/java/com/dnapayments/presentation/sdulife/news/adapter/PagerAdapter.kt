package com.dnapayments.presentation.sdulife.news.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.dnapayments.presentation.sdulife.news.announcement.AnnouncementFragment
import com.dnapayments.presentation.sdulife.news.founds.view.FoundsFragment
import com.dnapayments.presentation.sdulife.news.sdunews.NewFragment

class PagerAdapter(fm: FragmentManager, private var totalTabs: Int) : FragmentStatePagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NewFragment()
            1 -> AnnouncementFragment()
            2 -> FoundsFragment()
            else -> getItem(position)
        }
    }


}