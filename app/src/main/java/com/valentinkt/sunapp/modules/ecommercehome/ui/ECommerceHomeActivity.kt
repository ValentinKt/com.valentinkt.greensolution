package com.valentinkt.sunapp.modules.ecommercehome.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityECommerceHomeBinding
import com.valentinkt.sunapp.modules.ecommercehome.`data`.model.ImageSliderSliderprettydarkskiModel
import com.valentinkt.sunapp.modules.ecommercehome.`data`.viewmodel.ECommerceHomeVM
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import com.valentinkt.sunapp.modules.productdetail.ui.ProductDetailActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ECommerceHomeActivity :
    BaseActivity<ActivityECommerceHomeBinding>(R.layout.activity_e_commerce_home) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.valentinkt.sunapp/drawable/img_prettydarkski")


  private val imageSliderSliderprettydarkskiItems: ArrayList<ImageSliderSliderprettydarkskiModel> =
      arrayListOf(ImageSliderSliderprettydarkskiModel(imagePrettydarkski =
  imageUri.toString()),ImageSliderSliderprettydarkskiModel(imagePrettydarkski =
  imageUri.toString()))


  private val viewModel: ECommerceHomeVM by viewModels<ECommerceHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderprettydarkskiAdapter =
    SliderprettydarkskiAdapter(imageSliderSliderprettydarkskiItems,true)
    binding.imageSliderSliderprettydarkski.adapter = sliderprettydarkskiAdapter
    binding.imageSliderSliderprettydarkski.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroupSixtyTwo.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupSixtyTwo.updateIndicatorCounts(binding.imageSliderSliderprettydarkski.indicatorCount)
    binding.eCommerceHomeVM = viewModel
    setUpSearchViewGroupSeventySevenListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderprettydarkski.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderprettydarkski.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearHeader.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackmonsteraadanso.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroupSeventySevenListener(): Unit {
    binding.searchViewGroupSeventySeven.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "E_COMMERCE_HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ECommerceHomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
