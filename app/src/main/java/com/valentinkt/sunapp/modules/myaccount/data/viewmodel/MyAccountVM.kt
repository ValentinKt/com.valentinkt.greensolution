package com.valentinkt.sunapp.modules.myaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListglobeRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListsevenRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListticketRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.MyAccountModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyAccountVM : ViewModel(), KoinComponent {
  val myAccountModel: MutableLiveData<MyAccountModel> = MutableLiveData(MyAccountModel())

  var navArguments: Bundle? = null

  val listticketList: MutableLiveData<MutableList<ListticketRowModel>> =
      MutableLiveData(mutableListOf())

  val listglobeList: MutableLiveData<MutableList<ListglobeRowModel>> =
      MutableLiveData(mutableListOf())

  val listsevenList: MutableLiveData<MutableList<ListsevenRowModel>> =
      MutableLiveData(mutableListOf())
}
