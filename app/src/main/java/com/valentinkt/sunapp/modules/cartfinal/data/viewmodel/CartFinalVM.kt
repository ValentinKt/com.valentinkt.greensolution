package com.valentinkt.sunapp.modules.cartfinal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.cartfinal.`data`.model.CartFinalModel
import org.koin.core.KoinComponent

class CartFinalVM : ViewModel(), KoinComponent {
  val cartFinalModel: MutableLiveData<CartFinalModel> = MutableLiveData(CartFinalModel())

  var navArguments: Bundle? = null
}
