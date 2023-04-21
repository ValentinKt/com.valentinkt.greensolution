package com.valentinkt.sunapp.modules.homepage.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ListRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_dose_media)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleanorPena: String? = MyApp.getInstance().resources.getString(R.string.lbl_eleanor_pena)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_23)

)
