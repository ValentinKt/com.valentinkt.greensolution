package com.valentinkt.sunapp.modules.checkout.ui

import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityCheckoutBinding
import com.valentinkt.sunapp.modules.checkout.`data`.viewmodel.CheckoutVM
import com.valentinkt.sunapp.modules.ecommercehome.ui.ECommerceHomeActivity
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import com.valentinkt.sunapp.modules.orderplaced.ui.OrderPlacedActivity
import kotlin.String
import kotlin.Unit

class CheckoutActivity : BaseActivity<ActivityCheckoutBinding>(R.layout.activity_checkout) {
  private val viewModel: CheckoutVM by viewModels<CheckoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.checkoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etButton.setOnClickListener {
      val destIntent = OrderPlacedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEcommerce.setOnClickListener {
      val destIntent = ECommerceHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHECKOUT_ACTIVITY"

  }
}
