package com.dnapayments.presentation.activity

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.dnapayments.R
import com.dnapayments.databinding.ActivityAuthorizationBinding
import com.dnapayments.databinding.ActivityMainBinding
import com.dnapayments.utils.base.BaseBindingActivity

class AuthorizationActivity : BaseBindingActivity<ActivityAuthorizationBinding>(R.layout.activity_authorization) {
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            findNavController(R.id.fragment_authorization)
        }
    }
}