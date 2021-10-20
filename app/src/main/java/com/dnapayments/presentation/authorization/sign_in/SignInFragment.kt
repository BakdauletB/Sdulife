package com.dnapayments.presentation.authorization.sign_in

import android.content.Intent
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.dnapayments.R
import com.dnapayments.databinding.FragmentSignInBinding
import com.dnapayments.presentation.activity.MainActivity
import com.dnapayments.utils.base.BaseBindingFragment
import org.jetbrains.anko.support.v4.intentFor

class SignInFragment :
    BaseBindingFragment<FragmentSignInBinding>(R.layout.fragment_sign_in) {

    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            btnLogIn.setOnClickListener {
                requireActivity().finish()
                startActivity(intentFor<MainActivity>())
            }
            ivForgotPassword.setOnClickListener {
                findNavController().navigate(R.id.action_navigation_sign_in_to_navigation_sign_up)
            }
        }
    }
}
