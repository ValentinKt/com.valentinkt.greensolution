package com.valentinkt.sunapp.modules.navbar.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class NavBarRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNutritionalSum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nutritional_sum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl3)

)
