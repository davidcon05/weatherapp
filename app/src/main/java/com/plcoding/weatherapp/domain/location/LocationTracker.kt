package com.plcoding.weatherapp.domain.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentUserLocation(): Location?
}