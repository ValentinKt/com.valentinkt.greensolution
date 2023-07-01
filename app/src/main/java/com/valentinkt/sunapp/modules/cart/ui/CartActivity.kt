package com.valentinkt.sunapp.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityCartBinding
import com.valentinkt.sunapp.modules.cart.`data`.viewmodel.CartVM
import com.valentinkt.sunapp.modules.checkoutone.ui.CheckoutOneActivity
import com.valentinkt.sunapp.modules.ecommercehome.ui.ECommerceHomeActivity
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStacktrashOne.setOnClickListener {
      val destIntent = CheckoutOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEcommerce.setOnClickListener {
      val destIntent = ECommerceHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
