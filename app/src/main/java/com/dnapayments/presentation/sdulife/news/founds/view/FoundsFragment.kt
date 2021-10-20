package com.dnapayments.presentation.sdulife.news.founds.view

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.dnapayments.R
import com.dnapayments.R.id.*
import com.dnapayments.data.model.Founds
import com.dnapayments.databinding.FragmentFoundsBinding
import com.dnapayments.presentation.sdulife.news.founds.view.adapter.FoundsAdapter
import com.dnapayments.utils.Constants
import com.dnapayments.utils.base.BaseBindingFragment

class FoundsFragment :
    BaseBindingFragment<FragmentFoundsBinding>(R.layout.fragment_founds) {
    private var foundsAdapter: FoundsAdapter? = null

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            foundsAdapter = FoundsAdapter {
                findNavController().navigate(action_navigation_news_to_navigation_founds_details)

            }
            foundsAdapter?.setData(
                arrayListOf(
                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",

                        ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),
                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),
                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",

                        ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),

                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),
                    Founds(
                        found_id = 1,
                        title = "Baha is the best",
                        img = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                        hour = "22:10",
                        date = "20/20/2021",
                    ),
                )
            )
            rvFounds.adapter = foundsAdapter
            rvFounds.layoutManager = GridLayoutManager(
                requireContext(),
                Constants.TWO,
                GridLayoutManager.VERTICAL,
                false
            )
        }
    }
}

