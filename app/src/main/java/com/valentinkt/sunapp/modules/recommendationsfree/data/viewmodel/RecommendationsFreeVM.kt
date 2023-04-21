package com.valentinkt.sunapp.modules.recommendationsfree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.ListcreatefromfraRowModel
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.RecommendationsFreeModel
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.SpinnerFrameFiftySevenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecommendationsFreeVM : ViewModel(), KoinComponent {
  val recommendationsFreeModel: MutableLiveData<RecommendationsFreeModel> =
      MutableLiveData(RecommendationsFreeModel())

  var navArguments: Bundle? = null

  val spinnerFrameFiftySevenList: MutableLiveData<MutableList<SpinnerFrameFiftySevenModel>> =
      MutableLiveData()

  val listcreatefromfraList: MutableLiveData<MutableList<ListcreatefromfraRowModel>> =
      MutableLiveData(mutableListOf())
}
