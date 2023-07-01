package com.valentinkt.sunapp.modules.checkout.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class CheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckoutdetail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_checkout_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForpayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_72_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIncludingVAT: String? = MyApp.getInstance().resources.getString(R.string.msg_including_vat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApplePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_5261_4141_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholdername: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cardholder_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDavidWeber: String? = MyApp.getInstance().resources.getString(R.string.lbl_david_weber)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirydate: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVVCVC: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv_cvc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineHundredFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_915)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etActivetabValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null
)
