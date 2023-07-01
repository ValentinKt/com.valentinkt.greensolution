package com.valentinkt.sunapp.modules.homepage.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlidershadowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewin: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeSBJanoski: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_sb_janoski)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_89_95_usd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageShadow: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageImg: String? = ""

)
