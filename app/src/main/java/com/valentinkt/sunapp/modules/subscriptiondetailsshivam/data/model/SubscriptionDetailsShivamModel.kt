package com.valentinkt.sunapp.modules.subscriptiondetailsshivam.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class SubscriptionDetailsShivamModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestedSeed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_suggested_seed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_option_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptionTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_option_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptionThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_option_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptionFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_option_4)
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
  var txtBundleoffruit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bundle_of_fruit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)

)
