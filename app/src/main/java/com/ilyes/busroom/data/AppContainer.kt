package com.ilyes.busroom.data

import android.content.Context

interface AppContainer {
    val itemsRepository: BusScheduleRepository
}

class AppDataContainer(private val context: Context) : AppContainer {

    override val itemsRepository: BusScheduleRepository by lazy {
        OfflineBusScheduleRepository(BusDataBase.getDatabase(context).busDao())
    }
}
