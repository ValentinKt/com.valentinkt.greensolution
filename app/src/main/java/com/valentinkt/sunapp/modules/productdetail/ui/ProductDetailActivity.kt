package com.valentinkt.sunapp.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityProductDetailBinding
import com.valentinkt.sunapp.modules.cart.ui.CartActivity
import com.valentinkt.sunapp.modules.ecommercehome.ui.ECommerceHomeActivity
import com.valentinkt.sunapp.modules.productdetail.`data`.viewmodel.ProductDetailVM
import kotlin.String
import kotlin.Unit

class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.productDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStacktrash.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBag.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEcommerce.setOnClickListener {
      val destIntent = ECommerceHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
