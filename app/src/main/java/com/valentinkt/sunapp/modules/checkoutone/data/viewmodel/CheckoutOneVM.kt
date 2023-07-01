package com.valentinkt.sunapp.modules.checkoutone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.checkoutone.`data`.model.CheckoutOneModel
import org.koin.core.KoinComponent

class CheckoutOneVM : ViewModel(), KoinComponent {
  val checkoutOneModel: MutableLiveData<CheckoutOneModel> = MutableLiveData(CheckoutOneModel())

  var navArguments: Bundle? = null
}
