package com.valentinkt.sunapp.modules.checkoutone.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class CheckoutOneModel(
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
  var txtCreditcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
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
  var txtExpirydate: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVVCVC: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv_cvc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFieldPlaceholdOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_3_4_digits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldPlaceholdValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null
)
