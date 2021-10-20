package com.dnapayments.presentation.sdulife.clubs.detail

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.data.model.ClubDetail
import com.dnapayments.databinding.FragmentClubDetailBinding

import com.dnapayments.presentation.sdulife.clubs.detail.adapter.ClubDetailAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class ClubDetailFragment :
            BaseBindingFragment<FragmentClubDetailBinding>(R.layout.fragment_club_detail){
    private var clubDetailAdapter: ClubDetailAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            arguments?.getInt("char_id")?.let {

            }
            clubDetailAdapter = ClubDetailAdapter {

            }
            rvClubDetail.adapter = clubDetailAdapter
            toolbar.setOnClickListener {
                onBackPressed()
            }
            clubDetailAdapter?.setData(
                arrayListOf(
                    ClubDetail(
                        club_id = 1,
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        overview = "jgfidsjgpdfj",
                        date = "4h ago"
                    ),
                    ClubDetail(
                        club_id = 1,
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        overview = "jgfidsjgpdfj",
                        date = "4h ago"
                    ),
                    ClubDetail(
                        club_id = 1,
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        overview = "jgfidsjgpdfj",
                        date = "4h ago"
                    )
                )
            )

            btnFollow.setOnClickListener {
                btnFollowRequest.visibility = View.VISIBLE
                btnJoin.visibility = View.GONE
                btnFollow.visibility = View.GONE
                btnFollowRequest.setOnClickListener {
                    findNavController().navigate(R.id.action_navigation_club_detail_to_navigation_club_follow_request)
                }
            }

        }
    }
}