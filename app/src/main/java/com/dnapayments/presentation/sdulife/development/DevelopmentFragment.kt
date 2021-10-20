package com.dnapayments.presentation.sdulife.development

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentDevelopmentBinding
import com.dnapayments.utils.base.BaseBindingFragment

class DevelopmentFragment :
            BaseBindingFragment<FragmentDevelopmentBinding>(R.layout.fragment_development){
    companion object{
        private val TAG = DevelopmentFragment::class.java
    }
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            llRecommendation.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_development_to_navigation_recommendation)
            }
            llAppointment.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_development_to_navigation_appointment)
            }
            llTest.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_development_to_navigation_test)
            }

        }
    }
}