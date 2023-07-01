package com.valentinkt.sunapp.modules.recommendationsfree.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ListcreatefromfraRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEcheveria: String? = MyApp.getInstance().resources.getString(R.string.lbl_echeveria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrom3Inch: String? = MyApp.getInstance().resources.getString(R.string.lbl_from_3_inch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)

)
