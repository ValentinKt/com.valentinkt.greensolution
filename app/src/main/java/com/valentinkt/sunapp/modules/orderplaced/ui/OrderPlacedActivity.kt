package com.valentinkt.sunapp.modules.orderplaced.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityOrderPlacedBinding
import com.valentinkt.sunapp.modules.ecommercehome.ui.ECommerceHomeActivity
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import com.valentinkt.sunapp.modules.orderplaced.`data`.viewmodel.OrderPlacedVM
import kotlin.String
import kotlin.Unit

class OrderPlacedActivity : BaseActivity<ActivityOrderPlacedBinding>(R.layout.activity_order_placed)
    {
  private val viewModel: OrderPlacedVM by viewModels<OrderPlacedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.orderPlacedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEcommerce.setOnClickListener {
      val destIntent = ECommerceHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ORDER_PLACED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderPlacedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
