package com.valentinkt.sunapp.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.homepage.`data`.model.HomePageModel
import com.valentinkt.sunapp.modules.homepage.`data`.model.ListRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomePageVM : ViewModel(), KoinComponent {
  val homePageModel: MutableLiveData<HomePageModel> = MutableLiveData(HomePageModel())

  var navArguments: Bundle? = null

  val listList: MutableLiveData<MutableList<ListRowModel>> = MutableLiveData(mutableListOf())
}
