package com.ilyes.busroom.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository(private val busDao: BusScheduleDao): BusScheduleRepository {
    override fun getFullSchedule(): Flow<List<BusSchedule>> = busDao.getAll()

    override fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> = busDao.getByStopName(stopName)


}