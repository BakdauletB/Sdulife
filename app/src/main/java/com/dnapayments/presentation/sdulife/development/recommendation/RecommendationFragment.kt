package com.dnapayments.presentation.sdulife.development.recommendation

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.data.model.Recommendation
import com.dnapayments.data.model.RecommendationVideo
import com.dnapayments.databinding.FragmentRecommendationBinding
import com.dnapayments.presentation.sdulife.development.recommendation.adapter.RecommendationAdapter
import com.dnapayments.presentation.sdulife.development.recommendation.adapter.RecommendationVideoAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class RecommendationFragment :
        BaseBindingFragment<FragmentRecommendationBinding>(R.layout.fragment_recommendation){

        private var recommendationAdapter: RecommendationAdapter? = null
        private var recommendationVideoAdapter: RecommendationVideoAdapter? = null
        override fun initViews(savedInstanceState: Bundle?) {
                binding?.apply {
                        toolbar.setOnClickListener {
                                onBackPressed()
                        }
                        recommendationAdapter = RecommendationAdapter()
                        recommendationAdapter?.setData(
                                arrayListOf(
                                        Recommendation(
                                                img = "https://images.pexels.com/photos/447329/pexels-photo-447329.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                text = "Baha is the best"
                                        ),
                                        Recommendation(
                                                img = "https://images.pexels.com/photos/447329/pexels-photo-447329.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                text = "Baha is the best"
                                        ),
                                        Recommendation(
                                                img = "https://images.pexels.com/photos/447329/pexels-photo-447329.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                text = "Baha is the best"
                                        ),
                                )
                        )
                        rvRecommended.adapter = recommendationAdapter

                        recommendationVideoAdapter = RecommendationVideoAdapter()
                        recommendationVideoAdapter?.setData(
                                arrayListOf(
                                        RecommendationVideo(
                                                img = "https://images.pexels.com/photos/598917/pexels-photo-598917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                title = "Baha is the best deim",
                                                date = "27 Jan 2016"
                                        ),
                                        RecommendationVideo(
                                                img = "https://images.pexels.com/photos/598917/pexels-photo-598917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                title = "Baha is the best deim",
                                                date = "27 Jan 2016"
                                        ),
                                        RecommendationVideo(
                                                img = "https://images.pexels.com/photos/598917/pexels-photo-598917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                title = "Baha is the best deim",
                                                date = "27 Jan 2016"
                                        ),
                                        RecommendationVideo(
                                                img = "https://images.pexels.com/photos/598917/pexels-photo-598917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                                                title = "Baha is the best deim",
                                                date = "27 Jan 2016"
                                        ),
                                )
                        )
                        rvRecommendationVideo.adapter = recommendationVideoAdapter
                }
        }
}