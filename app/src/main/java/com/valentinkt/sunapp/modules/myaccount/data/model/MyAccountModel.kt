package com.valentinkt.sunapp.modules.myaccount.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class MyAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDWeber: String? = MyApp.getInstance().resources.getString(R.string.lbl_dweber)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDavidWeber: String? = MyApp.getInstance().resources.getString(R.string.lbl_david_weber)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_january_1984)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl3)

)
