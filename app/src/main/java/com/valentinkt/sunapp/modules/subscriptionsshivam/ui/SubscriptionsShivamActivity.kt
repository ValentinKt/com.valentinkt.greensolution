package com.valentinkt.sunapp.modules.subscriptionsshivam.ui

import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivitySubscriptionsShivamBinding
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import com.valentinkt.sunapp.modules.subscriptiondetailsshivam.ui.SubscriptionDetailsShivamActivity
import com.valentinkt.sunapp.modules.subscriptionsshivam.`data`.viewmodel.SubscriptionsShivamVM
import kotlin.String
import kotlin.Unit

class SubscriptionsShivamActivity :
    BaseActivity<ActivitySubscriptionsShivamBinding>(R.layout.activity_subscriptions_shivam) {
  private val viewModel: SubscriptionsShivamVM by viewModels<SubscriptionsShivamVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.subscriptionsShivamVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = SubscriptionDetailsShivamActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUBSCRIPTIONS_SHIVAM_ACTIVITY"

  }
}
