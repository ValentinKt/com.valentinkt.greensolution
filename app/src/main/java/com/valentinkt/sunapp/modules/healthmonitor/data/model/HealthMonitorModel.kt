package com.valentinkt.sunapp.modules.healthmonitor.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class HealthMonitorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHumidity: String? = MyApp.getInstance().resources.getString(R.string.lbl_humidity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWATER: String? = MyApp.getInstance().resources.getString(R.string.lbl_water)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_250ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_monstera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndoor: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOverview: String? = MyApp.getInstance().resources.getString(R.string.lbl_overview)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTEMPERATURE: String? = MyApp.getInstance().resources.getString(R.string.lbl_temperature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7075: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_75)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourplantish: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_plant_is_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLIGHT: String? = MyApp.getInstance().resources.getString(R.string.lbl_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3540: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHumidityOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_humidity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_502)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWATEROne: String? = MyApp.getInstance().resources.getString(R.string.lbl_water)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurementOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_50ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_janda_bolong2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOutdoor: String? = MyApp.getInstance().resources.getString(R.string.lbl_outdoor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOverviewOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_overview)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTEMPERATUREOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_temperature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7075One: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_75)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLIGHTOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3540One: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourplantist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_plant_is_t)

)
