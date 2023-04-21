package com.valentinkt.sunapp.modules.ecommercehome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.ecommercehome.`data`.model.ECommerceHomeModel
import org.koin.core.KoinComponent

class ECommerceHomeVM : ViewModel(), KoinComponent {
  val eCommerceHomeModel: MutableLiveData<ECommerceHomeModel> =
      MutableLiveData(ECommerceHomeModel())

  var navArguments: Bundle? = null
}
