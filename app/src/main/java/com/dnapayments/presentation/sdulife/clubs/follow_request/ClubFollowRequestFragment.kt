package com.dnapayments.presentation.sdulife.clubs.follow_request

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.data.model.FollowRequest
import com.dnapayments.databinding.FragmentClubFollowrequestBinding
import com.dnapayments.presentation.sdulife.clubs.follow_request.adapter.ClubFollowRequestAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class ClubFollowRequestFragment :
            BaseBindingFragment<FragmentClubFollowrequestBinding>(R.layout.fragment_club_followrequest){
    private var followRequestAdapter: ClubFollowRequestAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            toolbar.setOnClickListener {
                onBackPressed()
            }
            followRequestAdapter = ClubFollowRequestAdapter()
            rvFollowRequest.adapter = followRequestAdapter
            followRequestAdapter?.setData(
                arrayListOf(
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "100",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    ),
                    FollowRequest(
                        profile_id = 1,
                        full_name = "Bakdaulet Batyrkhan",
                        id = "190103440",
                        number = "1.",
                        img = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"
                    )

                )
            )
        }
    }
}