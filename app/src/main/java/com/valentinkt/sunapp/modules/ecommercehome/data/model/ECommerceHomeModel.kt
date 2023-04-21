package com.valentinkt.sunapp.modules.ecommercehome.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ECommerceHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndoor: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCrops: String? = MyApp.getInstance().resources.getString(R.string.lbl_crops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_green)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonsteraAdanso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_monstera_adanso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonsterafamily: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_monstera_family)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJandaBolong: String? = MyApp.getInstance().resources.getString(R.string.lbl_janda_bolong)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_agung_suka_fam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_202)

)
