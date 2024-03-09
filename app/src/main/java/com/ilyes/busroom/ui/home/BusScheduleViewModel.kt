
package com.ilyes.busroom.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ilyes.busroom.data.BusSchedule
import com.ilyes.busroom.data.BusScheduleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class BusScheduleViewModel(private val busScheduleRepository: BusScheduleRepository) : ViewModel() {

    fun getFullSchedule(): Flow<List<BusSchedule>> = busScheduleRepository.getFullSchedule()

    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> =
        busScheduleRepository.getScheduleFor(stopName)

}