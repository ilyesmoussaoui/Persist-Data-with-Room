
package com.ilyes.busroom

import android.app.Application
import com.ilyes.busroom.data.AppContainer
import com.ilyes.busroom.data.AppDataContainer


class BusScheduleApplication : Application() {


    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
