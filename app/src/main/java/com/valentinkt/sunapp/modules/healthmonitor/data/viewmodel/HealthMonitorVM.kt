package com.valentinkt.sunapp.modules.healthmonitor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.healthmonitor.`data`.model.HealthMonitorModel
import org.koin.core.KoinComponent

class HealthMonitorVM : ViewModel(), KoinComponent {
  val healthMonitorModel: MutableLiveData<HealthMonitorModel> =
      MutableLiveData(HealthMonitorModel())

  var navArguments: Bundle? = null
}
