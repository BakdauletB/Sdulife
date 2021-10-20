package com.dnapayments.presentation.sdulife.clubs

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.data.model.Clubs
import com.dnapayments.databinding.FragmentClubsBinding
import com.dnapayments.presentation.sdulife.clubs.adapter.ClubsAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class ClubsFragment :
                BaseBindingFragment<FragmentClubsBinding>(R.layout.fragment_clubs){

    companion object {
        private  val TAG = ClubsFragment::class.java
    }

    private var clubsAdapter: ClubsAdapter? = null

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {

            clubsAdapter = ClubsAdapter {
             findNavController().navigate(R.id.action_navigation_clubs_to_navigation_club_detail)
            }
            clubsAdapter?.setData(
                arrayListOf(
                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),

                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),

                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),

                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),

                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),

                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),


                    Clubs(
                        char_id = 1,
                        title = "Music club",
                        overview = "music",
                        img = "https://images.pexels.com/photos/159515/football-american-football-runner-player-159515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                        count = "1"
                    ),
                )
            )
            rvClubs.adapter = clubsAdapter

        }
    }
}