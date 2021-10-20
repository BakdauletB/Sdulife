package com.dnapayments.presentation.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.dnapayments.R
import com.dnapayments.databinding.ActivitySplashBinding
import com.dnapayments.presentation.activity.AuthorizationActivity
import com.dnapayments.presentation.activity.MainActivity
import com.dnapayments.utils.base.BaseBindingActivity
import kz.litro.utils.PrefsAuth
import org.koin.android.ext.android.inject

class SplashActivity : BaseBindingActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    private val prefsAuth: PrefsAuth by inject()
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.run {
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(
                    Intent(
                        this@SplashActivity,
                        if (prefsAuth.isAuthorized()) MainActivity::class.java else AuthorizationActivity::class.java
                    )
                )
                finish()
            }, 1000)
        }
    }
}