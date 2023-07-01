package com.valentinkt.sunapp.modules.orderplaced.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class OrderPlacedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderPlaced: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_placed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder5542: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_5542)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_72_60)
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
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFruitBundleThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fruit_bundle_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomizedseed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_customized_seed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_c)

)
