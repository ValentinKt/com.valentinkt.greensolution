package com.valentinkt.sunapp.modules.cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.cart.`data`.model.CartModel
import org.koin.core.KoinComponent

class CartVM : ViewModel(), KoinComponent {
  val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  var navArguments: Bundle? = null
}
