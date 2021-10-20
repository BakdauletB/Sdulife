package com.dnapayments.di

import com.dnapayments.presentation.characters.CharacterViewModel
import com.dnapayments.presentation.characters.details.DetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    //  Forgot password
    viewModel { CharacterViewModel(get()) }
    viewModel { DetailsViewModel(get()) }
//    viewModel { OrderServiceViewModel() }
//    viewModel { SMSForVerificationViewModel() }
}