package com.valentinkt.sunapp.modules.notification.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder5542Pla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_5542_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1m_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder5541arr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_5541_arr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30m_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFiftyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder5540rec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_5540_rec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10hago: String? = MyApp.getInstance().resources.getString(R.string.lbl_10h_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonsteraAdanso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_monstera_adanso2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJandaBolongis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_janda_bolong_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)

)
