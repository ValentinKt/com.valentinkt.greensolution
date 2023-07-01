package com.valentinkt.sunapp.modules.navbar.ui

import android.view.View
import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityNavBarBinding
import com.valentinkt.sunapp.modules.homepage.ui.HomePageActivity
import com.valentinkt.sunapp.modules.myaccount.ui.MyAccountActivity
import com.valentinkt.sunapp.modules.navbar.`data`.model.NavBarRowModel
import com.valentinkt.sunapp.modules.navbar.`data`.viewmodel.NavBarVM
import com.valentinkt.sunapp.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NavBarActivity : BaseActivity<ActivityNavBarBinding>(R.layout.activity_nav_bar) {
  private val viewModel: NavBarVM by viewModels<NavBarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val navBarAdapter = NavBarAdapter(viewModel.navBarList.value?:mutableListOf())
    binding.recyclerNavBar.adapter = navBarAdapter
    navBarAdapter.setOnItemClickListener(
    object : NavBarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NavBarRowModel) {
        onClickRecyclerNavBar(view, position, item)
      }
    }
    )
    viewModel.navBarList.observe(this) {
      navBarAdapter.updateData(it)
    }
    binding.navBarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeventeen.setOnClickListener {
      val destIntent = MyAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFourteen.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerNavBar(
    view: View,
    position: Int,
    item: NavBarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NAV_BAR_ACTIVITY"

  }
}
