package com.dnapayments.presentation.sdulife.news

import android.os.Bundle
import android.widget.LinearLayout
import com.dnapayments.R
import com.dnapayments.databinding.FragmentNewsBinding
import com.dnapayments.presentation.sdulife.news.adapter.PagerAdapter
import com.dnapayments.utils.Constants
import com.dnapayments.utils.base.BaseBindingFragment
import com.google.android.material.tabs.TabLayout

class NewsFragment :
    BaseBindingFragment<FragmentNewsBinding>(R.layout.fragment_news) {
    companion object {
        private val TAG = NewsFragment::class.java
    }

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {

            tabLayout.addTab(tabLayout.newTab().setText(Constants.NEWS_TAB))
            tabLayout.addTab(tabLayout.newTab().setText(Constants.ANNOUNCEMENT_TAB))
            tabLayout.addTab(tabLayout.newTab().setText(Constants.FOUNDS_TAB))

            tabLayout.setTabWidthAsWrapContents(Constants.ZERO)
            tabLayout.setTabWidthAsWrapContents(Constants.ONE)

            val adapter = PagerAdapter(childFragmentManager, tabLayout.tabCount)

            vpNews.adapter = adapter
            vpNews.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    vpNews.currentItem = tab.position

                }

                override fun onTabReselected(tab: TabLayout.Tab) {}
                override fun onTabUnselected(tab: TabLayout.Tab) {}
            })

        }

    }

    private fun TabLayout.setTabWidthAsWrapContents(tabPosition: Int) {
        val layout =
            (this.getChildAt(Constants.ZERO) as LinearLayout).getChildAt(tabPosition) as LinearLayout
        val layoutParams = layout.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = Constants.POINT_FLOAT
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        layout.layoutParams = layoutParams

    }
}