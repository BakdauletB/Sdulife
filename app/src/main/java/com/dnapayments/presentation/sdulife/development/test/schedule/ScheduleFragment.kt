package com.dnapayments.presentation.sdulife.development.test.schedule

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.databinding.FragmentSheduleBinding
import com.dnapayments.utils.base.BaseBindingFragment

class ScheduleFragment :
  BaseBindingFragment<FragmentSheduleBinding>(R.layout.fragment_shedule){

    override fun initViews(savedInstanceState: Bundle?) {
      binding?.apply {
        toolbar.setOnClickListener {
          onBackPressed()
        }
      }
    }
}