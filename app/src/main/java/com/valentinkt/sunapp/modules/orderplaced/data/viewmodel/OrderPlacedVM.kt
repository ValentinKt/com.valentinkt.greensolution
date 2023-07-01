package com.valentinkt.sunapp.modules.orderplaced.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.orderplaced.`data`.model.OrderPlacedModel
import org.koin.core.KoinComponent

class OrderPlacedVM : ViewModel(), KoinComponent {
  val orderPlacedModel: MutableLiveData<OrderPlacedModel> = MutableLiveData(OrderPlacedModel())

  var navArguments: Bundle? = null
}
