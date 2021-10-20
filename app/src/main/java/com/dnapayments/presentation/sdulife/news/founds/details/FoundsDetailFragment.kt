package com.dnapayments.presentation.sdulife.news.founds.details

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dnapayments.R
import com.dnapayments.data.model.FoundImage
import com.dnapayments.databinding.FragmentFoundsDetailBinding
import com.dnapayments.utils.base.BaseBindingFragment


class FoundsDetailFragment :
            BaseBindingFragment<FragmentFoundsDetailBinding>(R.layout.fragment_founds_detail){

    private var foundsDetailAdapter: FoundDetailAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {

            arguments?.getInt("found_id")?.let {

            }
            foundsDetailAdapter = FoundDetailAdapter {

            }
            foundsDetailAdapter?.setData(
                arrayListOf(
                    FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),
                    FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),
                    FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),
                    FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),
                    FoundImage(
                        char_id = 1,
                        img = "https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                    ),
                )
            )
            rvImages.adapter = foundsDetailAdapter


        }
    }
}