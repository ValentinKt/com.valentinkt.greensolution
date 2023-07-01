package com.valentinkt.sunapp.modules.ecommercehome.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.valentinkt.sunapp.databinding.SlideritemECommerceHome1Binding
import com.valentinkt.sunapp.modules.ecommercehome.`data`.model.ImageSliderSliderprettydarkskiModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderprettydarkskiAdapter(
  val dataList: ArrayList<ImageSliderSliderprettydarkskiModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderprettydarkskiModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemECommerceHome1Binding) {
      binding.imageSliderSliderprettydarkskiModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemECommerceHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
