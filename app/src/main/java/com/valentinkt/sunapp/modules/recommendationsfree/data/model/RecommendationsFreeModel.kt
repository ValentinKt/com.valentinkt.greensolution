package com.valentinkt.sunapp.modules.recommendationsfree.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class RecommendationsFreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommendationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommendations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_cacti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_in_pots)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_dried_flowers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_in_pots)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeshipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhenordering: String? = MyApp.getInstance().resources.getString(R.string.lbl_when_ordering)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_from_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSansevieria: String? = MyApp.getInstance().resources.getString(R.string.lbl_sansevieria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrom8Inch: String? = MyApp.getInstance().resources.getString(R.string.lbl_from_8_inch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)

)
