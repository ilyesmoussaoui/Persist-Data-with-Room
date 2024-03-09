package com.ilyes.busroom.data

import kotlinx.coroutines.flow.Flow

interface BusScheduleRepository {
    fun getFullSchedule(): Flow<List<BusSchedule>>
    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>>
}
