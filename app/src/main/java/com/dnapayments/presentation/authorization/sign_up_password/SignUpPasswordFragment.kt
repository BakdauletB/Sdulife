package com.dnapayments.presentation.authorization.sign_up_password

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentSignUpPasswordBinding
import com.dnapayments.utils.base.BaseBindingFragment

class SignUpPasswordFragment :
            BaseBindingFragment<FragmentSignUpPasswordBinding>(R.layout.fragment_sign_up_password){

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
         btnNext.setOnClickListener {
             findNavController().navigate(R.id.navigation_news)
         }
        }
    }
}