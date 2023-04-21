package com.valentinkt.sunapp.modules.subscriptionsshivam.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.subscriptionsshivam.`data`.model.SubscriptionsShivamModel
import org.koin.core.KoinComponent

class SubscriptionsShivamVM : ViewModel(), KoinComponent {
  val subscriptionsShivamModel: MutableLiveData<SubscriptionsShivamModel> =
      MutableLiveData(SubscriptionsShivamModel())

  var navArguments: Bundle? = null
}
