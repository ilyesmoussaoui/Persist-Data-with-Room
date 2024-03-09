package com.ilyes.busroom.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ilyes.busroom.BusScheduleApplication
import com.ilyes.busroom.ui.home.BusScheduleViewModel

object AppViewModelProvider {
    val factory : ViewModelProvider.Factory = viewModelFactory {
        initializer {
            BusScheduleViewModel(busScheduleApplication().container.itemsRepository)
        }
    }
}
fun CreationExtras.busScheduleApplication(): BusScheduleApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BusScheduleApplication)