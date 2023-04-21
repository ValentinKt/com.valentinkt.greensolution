package com.valentinkt.sunapp.modules.login.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoyour: String? = MyApp.getInstance().resources.getString(R.string.msg_log_in_to_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLable: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputText: String? = MyApp.getInstance().resources.getString(R.string.lbl_afnan_jarabaa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLableOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputTextOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)

)
