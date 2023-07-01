package com.valentinkt.sunapp.modules.subscriptiondetailsshivam.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.subscriptiondetailsshivam.`data`.model.SubscriptionDetailsShivamModel
import org.koin.core.KoinComponent

class SubscriptionDetailsShivamVM : ViewModel(), KoinComponent {
  val subscriptionDetailsShivamModel: MutableLiveData<SubscriptionDetailsShivamModel> =
      MutableLiveData(SubscriptionDetailsShivamModel())

  var navArguments: Bundle? = null
}
