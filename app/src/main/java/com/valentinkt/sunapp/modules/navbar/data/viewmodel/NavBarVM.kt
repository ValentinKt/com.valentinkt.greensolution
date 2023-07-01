package com.valentinkt.sunapp.modules.navbar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.navbar.`data`.model.NavBarModel
import com.valentinkt.sunapp.modules.navbar.`data`.model.NavBarRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NavBarVM : ViewModel(), KoinComponent {
  val navBarModel: MutableLiveData<NavBarModel> = MutableLiveData(NavBarModel())

  var navArguments: Bundle? = null

  val navBarList: MutableLiveData<MutableList<NavBarRowModel>> = MutableLiveData(mutableListOf())
}
