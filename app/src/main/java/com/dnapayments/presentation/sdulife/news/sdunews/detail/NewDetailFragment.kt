package com.dnapayments.presentation.sdulife.news.sdunews.detail

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.databinding.FragmentNewdetailBinding
import com.dnapayments.utils.base.BaseBindingFragment

class NewDetailFragment :
            BaseBindingFragment<FragmentNewdetailBinding>(R.layout.fragment_newdetail){
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            toolbar.setOnClickListener {
                onBackPressed()
            }
            arguments?.getInt("news_id")?.let {

            }
        }
    }
}