package com.valentinkt.sunapp.modules.recommendationsfreecontainer.ui

import androidx.activity.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseActivity
import com.valentinkt.sunapp.databinding.ActivityRecommendationsFreeContainerBinding
import com.valentinkt.sunapp.extensions.loadFragment
import com.valentinkt.sunapp.modules.recommendationsfree.ui.RecommendationsFreeFragment
import com.valentinkt.sunapp.modules.recommendationsfreecontainer.`data`.viewmodel.RecommendationsFreeContainerVM
import kotlin.String
import kotlin.Unit

class RecommendationsFreeContainerActivity :
    BaseActivity<ActivityRecommendationsFreeContainerBinding>(R.layout.activity_recommendations_free_container)
    {
  private val viewModel: RecommendationsFreeContainerVM by
      viewModels<RecommendationsFreeContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recommendationsFreeContainerVM = viewModel
    val destFragment = RecommendationsFreeFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = RecommendationsFreeFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorThree.setOnClickListener {
      val destFragment = RecommendationsFreeFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = RecommendationsFreeFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "RECOMMENDATIONS_FREE_CONTAINER_ACTIVITY"

  }
}
