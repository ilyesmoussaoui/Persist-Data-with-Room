package com.ilyes.busroom.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(BusSchedule::class), version = 1)
abstract class BusDataBase: RoomDatabase() {
    abstract fun busDao(): BusScheduleDao

    companion object {
        @Volatile
        private var INSTANCE: BusDataBase? = null

        fun getDatabase(context: Context): BusDataBase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    BusDataBase::class.java,
                    "app_database"
                )
                    .createFromAsset("database/bus_schedule.db")

                    .fallbackToDestructiveMigration()
                    .build()
                    .also {
                        INSTANCE = it
                    }
            }
        }
    }
}
