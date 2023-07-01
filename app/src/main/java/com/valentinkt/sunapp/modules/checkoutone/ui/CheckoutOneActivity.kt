package com.valentinkt.sunapp.modules.checkoutone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityCheckoutOneBinding
import com.valentinkt.sunapp.modules.checkoutone.`data`.viewmodel.CheckoutOneVM
import com.valentinkt.sunapp.modules.ecommercehome.ui.ECommerceHomeActivity
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class CheckoutOneActivity : BaseActivity<ActivityCheckoutOneBinding>(R.layout.activity_checkout_one)
    {
  private val viewModel: CheckoutOneVM by viewModels<CheckoutOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.checkoutOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageEcommerce.setOnClickListener {
      val destIntent = ECommerceHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHECKOUT_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckoutOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
