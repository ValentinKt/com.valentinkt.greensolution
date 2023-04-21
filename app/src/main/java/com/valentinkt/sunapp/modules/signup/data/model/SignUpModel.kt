package com.valentinkt.sunapp.modules.signup.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterEmailTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterEmailThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterEmailFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsignupwith: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_or_sign_up_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyhaveyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameNineValue: String? = null
)
