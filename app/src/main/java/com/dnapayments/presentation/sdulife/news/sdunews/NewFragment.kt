package com.dnapayments.presentation.sdulife.news.sdunews

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.data.model.News
import com.dnapayments.databinding.FragmentNewBinding
import com.dnapayments.presentation.sdulife.news.sdunews.adapter.NewAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class NewFragment :
            BaseBindingFragment<FragmentNewBinding>(R.layout.fragment_new){

    private var newsAdapter: NewAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            newsAdapter = NewAdapter{
                findNavController().navigate(R.id.action_navigation_news_to_navigation_news_detail)
            }
            newsAdapter?.setData(
                arrayListOf(
                    News(
                        news_id = 1,
                        title = "Hackathon for\n freshmans",
                        img = "https://images.pexels.com/photos/572897/pexels-photo-572897.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        date = "22/10/2020"
                    ),

                    News(
                        news_id = 1,
                        title = "Hackathon for\n freshmans",
                        img = "https://images.pexels.com/photos/572897/pexels-photo-572897.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        date = "22/10/2020"
                    ),

                    News(
                        news_id = 1,
                        title = "Hackathon for\n freshmans",
                        img = "https://images.pexels.com/photos/572897/pexels-photo-572897.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        date = "22/10/2020"
                    ),
                    News(
                        news_id = 1,
                        title = "Hackathon for\n freshmans",
                        img = "https://images.pexels.com/photos/572897/pexels-photo-572897.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        date = "22/10/2020"
                    ),
                    News(
                        news_id = 1,
                        title = "Hackathon for\n freshmans",
                        img = "https://images.pexels.com/photos/572897/pexels-photo-572897.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        date = "22/10/2020"
                    ),


                )
            )
            rvNews.adapter = newsAdapter
        }
    }
}