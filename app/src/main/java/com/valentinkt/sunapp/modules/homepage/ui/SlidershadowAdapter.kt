package com.valentinkt.sunapp.modules.homepage.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.valentinkt.sunapp.databinding.SlideritemHomePage1Binding
import com.valentinkt.sunapp.modules.homepage.`data`.model.ImageSliderSlidershadowModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidershadowAdapter(
  val dataList: ArrayList<ImageSliderSlidershadowModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidershadowModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomePage1Binding) {
      binding.imageSliderSlidershadowModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomePage1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
