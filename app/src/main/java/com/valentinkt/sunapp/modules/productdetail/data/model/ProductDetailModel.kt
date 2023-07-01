package com.valentinkt.sunapp.modules.productdetail.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class ProductDetailModel(
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
  var txtMonsteraAdanso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_monstera_adans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPRICE: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSIZE: String? = MyApp.getInstance().resources.getString(R.string.lbl_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5h: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOverview: String? = MyApp.getInstance().resources.getString(R.string.lbl_overview)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLIGHT: String? = MyApp.getInstance().resources.getString(R.string.lbl_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTEMPERATURE: String? = MyApp.getInstance().resources.getString(R.string.lbl_temperature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWATER: String? = MyApp.getInstance().resources.getString(R.string.lbl_water)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3540: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7075: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_75)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_250ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_monstera_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)

)
