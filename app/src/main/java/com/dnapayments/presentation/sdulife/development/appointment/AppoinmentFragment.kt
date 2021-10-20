package com.dnapayments.presentation.sdulife.development.appointment

import android.os.Bundle
import com.dnapayments.R
import com.dnapayments.data.model.Appointment
import com.dnapayments.databinding.FragmentAppointmentBinding
import com.dnapayments.presentation.sdulife.development.appointment.adapter.AppoinmentAdapter
import com.dnapayments.utils.base.BaseBindingFragment

class AppoinmentFragment :
        BaseBindingFragment<FragmentAppointmentBinding>(R.layout.fragment_appointment){
    private var appointmentAdapter : AppoinmentAdapter? = null
    override fun initViews(savedInstanceState: Bundle?) {
        binding?.apply {
            toolbar.setOnClickListener {
                onBackPressed()
            }
            appointmentAdapter = AppoinmentAdapter()
            appointmentAdapter?.setData(
                arrayListOf(
                    Appointment(
                        sex = "Men",
                        fullName = "Bakdaulet Batyrkhan",
                        position = "Phd",
                        img = "https://images.pexels.com/photos/6224311/pexels-photo-6224311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                    ),
                    Appointment(
                        sex = "Men",
                        fullName = "Bakdaulet Batyrkhan",
                        position = "Phd",
                        img = "https://images.pexels.com/photos/6224311/pexels-photo-6224311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                    ),
                    Appointment(
                        sex = "Men",
                        fullName = "Bakdaulet Batyrkhan",
                        position = "Phd",
                        img = "https://images.pexels.com/photos/6224311/pexels-photo-6224311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                    ),
                    Appointment(
                        sex = "Men",
                        fullName = "Bakdaulet Batyrkhan",
                        position = "Phd",
                        img = "https://images.pexels.com/photos/6224311/pexels-photo-6224311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                    ),
                    Appointment(
                        sex = "Men",
                        fullName = "Bakdaulet Batyrkhan",
                        position = "Phd",
                        img = "https://images.pexels.com/photos/6224311/pexels-photo-6224311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                    ),
                )
            )
            rvAppointment.adapter = appointmentAdapter
        }
    }
}