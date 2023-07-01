package com.valentinkt.sunapp.modules.recommendationsfreecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.recommendationsfreecontainer.`data`.model.RecommendationsFreeContainerModel
import org.koin.core.KoinComponent

class RecommendationsFreeContainerVM : ViewModel(), KoinComponent {
  val recommendationsFreeContainerModel: MutableLiveData<RecommendationsFreeContainerModel> =
      MutableLiveData(RecommendationsFreeContainerModel())

  var navArguments: Bundle? = null
}
