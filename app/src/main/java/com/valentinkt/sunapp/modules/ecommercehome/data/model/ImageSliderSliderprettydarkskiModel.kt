package com.valentinkt.sunapp.modules.ecommercehome.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderprettydarkskiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExclusiveOffer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_exclusive_offe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_get_your_1st_pl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imagePrettydarkski: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageVectorSeventy: String? = ""

)
