package com.valentinkt.sunapp.modules.cartfinal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityCartFinalBinding
import com.valentinkt.sunapp.modules.cartfinal.`data`.viewmodel.CartFinalVM
import com.valentinkt.sunapp.modules.checkoutone.ui.CheckoutOneActivity
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class CartFinalActivity : BaseActivity<ActivityCartFinalBinding>(R.layout.activity_cart_final) {
  private val viewModel: CartFinalVM by viewModels<CartFinalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cartFinalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStacktrashTwo.setOnClickListener {
      val destIntent = CheckoutOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CART_FINAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartFinalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
