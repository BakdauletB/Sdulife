package com.dnapayments.presentation.authorization.sign_up

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentSignUpEmailBinding
import com.dnapayments.utils.base.BaseBindingFragment

class SignUpFragment :
            BaseBindingFragment<FragmentSignUpEmailBinding>(R.layout.fragment_sign_up_email){
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_sign_up_to_navigation_sign_up_password)
            }
        }
    }
}