package com.valentinkt.sunapp.modules.cart.`data`.model

import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGreenGenie: String? = MyApp.getInstance().resources.getString(R.string.lbl_greengenie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShoppingBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping_bag)
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
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApplyCoupon: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply_coupon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCouponcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_coupon_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_152)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_order_above_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_shop_for_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedforlater: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_saved_for_later)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLargeSnakeZyl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_large_snake_zyl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMovetocart: String? = MyApp.getInstance().resources.getString(R.string.lbl_move_to_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_602)

)
