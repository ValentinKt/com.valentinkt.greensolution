package com.valentinkt.sunapp.modules.myaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityMyAccountBinding
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListglobeRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListsevenRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListticketRowModel
import com.valentinkt.sunapp.modules.myaccount.`data`.viewmodel.MyAccountVM
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyAccountActivity : BaseActivity<ActivityMyAccountBinding>(R.layout.activity_my_account) {
  private val viewModel: MyAccountVM by viewModels<MyAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listticketAdapter = ListticketAdapter(viewModel.listticketList.value?:mutableListOf())
    binding.recyclerListticket.adapter = listticketAdapter
    listticketAdapter.setOnItemClickListener(
    object : ListticketAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListticketRowModel) {
        onClickRecyclerListticket(view, position, item)
      }
    }
    )
    viewModel.listticketList.observe(this) {
      listticketAdapter.updateData(it)
    }
    val listglobeAdapter = ListglobeAdapter(viewModel.listglobeList.value?:mutableListOf())
    binding.recyclerListglobe.adapter = listglobeAdapter
    listglobeAdapter.setOnItemClickListener(
    object : ListglobeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListglobeRowModel) {
        onClickRecyclerListglobe(view, position, item)
      }
    }
    )
    viewModel.listglobeList.observe(this) {
      listglobeAdapter.updateData(it)
    }
    val listsevenAdapter = ListsevenAdapter(viewModel.listsevenList.value?:mutableListOf())
    binding.recyclerListseven.adapter = listsevenAdapter
    listsevenAdapter.setOnItemClickListener(
    object : ListsevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsevenRowModel) {
        onClickRecyclerListseven(view, position, item)
      }
    }
    )
    viewModel.listsevenList.observe(this) {
      listsevenAdapter.updateData(it)
    }
    binding.myAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListticket(
    view: View,
    position: Int,
    item: ListticketRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListglobe(
    view: View,
    position: Int,
    item: ListglobeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListseven(
    view: View,
    position: Int,
    item: ListsevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
