package com.valentinkt.sunapp.modules.subscriptionsshivam.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class SubscriptionsShivamModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFor1portion: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_1_portion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGram: String? = MyApp.getInstance().resources.getString(R.string.lbl_gram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarbs: String? = MyApp.getInstance().resources.getString(R.string.lbl_carbs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGramOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_gram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFat: String? = MyApp.getInstance().resources.getString(R.string.lbl_fat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGramTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_gram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaloriesCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_104_6_calories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNutritionalSum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nutritional_sum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_54_kg)

)
