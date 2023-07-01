package com.valentinkt.sunapp.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityHomePageBinding
import com.valentinkt.sunapp.modules.homepage.`data`.model.ImageSliderSlidershadowModel
import com.valentinkt.sunapp.modules.homepage.`data`.model.ListRowModel
import com.valentinkt.sunapp.modules.homepage.`data`.viewmodel.HomePageVM
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.valentinkt.sunapp/drawable/img_shadow")


  private val imageSliderSlidershadowItems: ArrayList<ImageSliderSlidershadowModel> =
      arrayListOf(ImageSliderSlidershadowModel(imageShadow =
  imageUri.toString()),ImageSliderSlidershadowModel(imageShadow = imageUri.toString()))


  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidershadowAdapter = SlidershadowAdapter(imageSliderSlidershadowItems,true)
    binding.imageSliderSlidershadow.adapter = slidershadowAdapter
    binding.imageSliderSlidershadow.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorUIindicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorUIindicator.updateIndicatorCounts(binding.imageSliderSlidershadow.indicatorCount)
    val listAdapter = ListAdapter(viewModel.listList.value?:mutableListOf())
    binding.recyclerList.adapter = listAdapter
    listAdapter.setOnItemClickListener(
    object : ListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListRowModel) {
        onClickRecyclerList(view, position, item)
      }
    }
    )
    viewModel.listList.observe(this) {
      listAdapter.updateData(it)
    }
    binding.homePageVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidershadow.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidershadow.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerList(
    view: View,
    position: Int,
    item: ListRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
