package com.dnapayments.presentation.sdulife.development.test

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.data.model.Test
import com.dnapayments.databinding.FragmentTestBinding
import com.dnapayments.presentation.sdulife.development.test.adapter.TestAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class TestFragment :
        BaseBindingFragment<FragmentTestBinding>(R.layout.fragment_test){
    private lateinit var testAdapter: TestAdapter
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.run {
            btnSchedule.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_test_to_navigation_schedule)
            }
            toolbar.setOnClickListener {
                onBackPressed()
            }
            testAdapter = TestAdapter()
            testAdapter.setData(
                arrayListOf(
                    Test(
                        img = "",
                        week = "Tuesday",
                        date = "18 December",
                        overview = "Scheduled to play tennis with Vice\n President my Grandma."
                    ),
                    Test(
                        img = "",
                        week = "Tuesday",
                        date = "18 December",
                        overview = "Scheduled to play tennis with Vice\n President my Grandma."
                    ),
                    Test(
                        img = "",
                        week = "Tuesday",
                        date = "18 December",
                        overview = "Scheduled to play tennis with Vice\n President my Grandma."
                    ),
                    Test(
                        img = "",
                        week = "Tuesday",
                        date = "18 December",
                        overview = "Scheduled to play tennis with Vice\n President my Grandma."
                    ),
                    Test(
                        img = "",
                        week = "Tuesday",
                        date = "18 December",
                        overview = "Scheduled to play tennis with Vice\n President my Grandma."
                    ),
                )
            )
            rvList.adapter = testAdapter
        }
    }
}