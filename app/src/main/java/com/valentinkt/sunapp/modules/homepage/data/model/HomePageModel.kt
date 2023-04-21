package com.valentinkt.sunapp.modules.homepage.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustDropped: String? = MyApp.getInstance().resources.getString(R.string.lbl_just_dropped)

)
