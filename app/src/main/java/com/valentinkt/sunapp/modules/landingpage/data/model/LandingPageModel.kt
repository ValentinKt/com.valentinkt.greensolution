package com.valentinkt.sunapp.modules.landingpage.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class LandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFarmatyourfi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_farm_at_your_fi)

)
