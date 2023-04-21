package com.valentinkt.sunapp.modules.subscriptiondetailsshivam.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivitySubscriptionDetailsShivamBinding
import com.valentinkt.sunapp.modules.cartfinal.ui.CartFinalActivity
import com.valentinkt.sunapp.modules.subscriptiondetailsshivam.`data`.viewmodel.SubscriptionDetailsShivamVM
import kotlin.String
import kotlin.Unit

class SubscriptionDetailsShivamActivity :
    BaseActivity<ActivitySubscriptionDetailsShivamBinding>(R.layout.activity_subscription_details_shivam)
    {
  private val viewModel: SubscriptionDetailsShivamVM by viewModels<SubscriptionDetailsShivamVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.subscriptionDetailsShivamVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageBag.setOnClickListener {
      val destIntent = CartFinalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStacktrash.setOnClickListener {
      val destIntent = CartFinalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUBSCRIPTION_DETAILS_SHIVAM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SubscriptionDetailsShivamActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
