package com.valentinkt.sunapp.modules.healthmonitor.ui

import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityHealthMonitorBinding
import com.valentinkt.sunapp.modules.healthmonitor.`data`.viewmodel.HealthMonitorVM
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class HealthMonitorActivity :
    BaseActivity<ActivityHealthMonitorBinding>(R.layout.activity_health_monitor) {
  private val viewModel: HealthMonitorVM by viewModels<HealthMonitorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.healthMonitorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HEALTH_MONITOR_ACTIVITY"

  }
}
