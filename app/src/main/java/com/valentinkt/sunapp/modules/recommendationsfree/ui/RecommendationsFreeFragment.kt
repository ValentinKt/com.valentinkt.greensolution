package com.valentinkt.sunapp.modules.recommendationsfree.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.appcomponents.base.BaseFragment
import com.valentinkt.sunapp.databinding.FragmentRecommendationsFreeBinding
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.ListcreatefromfraRowModel
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.SpinnerFrameFiftySevenModel
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.viewmodel.RecommendationsFreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecommendationsFreeFragment :
    BaseFragment<FragmentRecommendationsFreeBinding>(R.layout.fragment_recommendations_free) {
  private val viewModel: RecommendationsFreeVM by viewModels<RecommendationsFreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerFrameFiftySevenList.value = mutableListOf(
    SpinnerFrameFiftySevenModel("Item1"),
    SpinnerFrameFiftySevenModel("Item2"),
    SpinnerFrameFiftySevenModel("Item3"),
    SpinnerFrameFiftySevenModel("Item4"),
    SpinnerFrameFiftySevenModel("Item5")
    )
    val spinnerFrameFiftySevenAdapter =
    SpinnerFrameFiftySevenAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrameFiftySevenList.value?:
    mutableListOf())
    binding.spinnerFrameFiftySeven.adapter = spinnerFrameFiftySevenAdapter
    val listcreatefromfraAdapter =
    ListcreatefromfraAdapter(viewModel.listcreatefromfraList.value?:mutableListOf())
    binding.recyclerListcreatefromfra.adapter = listcreatefromfraAdapter
    listcreatefromfraAdapter.setOnItemClickListener(
    object : ListcreatefromfraAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcreatefromfraRowModel) {
        onClickRecyclerListcreatefromfra(view, position, item)
      }
    }
    )
    viewModel.listcreatefromfraList.observe(requireActivity()) {
      listcreatefromfraAdapter.updateData(it)
    }
    binding.recommendationsFreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListcreatefromfra(
    view: View,
    position: Int,
    item: ListcreatefromfraRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECOMMENDATIONS_FREE_FRAGMENT"


    fun getInstance(bundle: Bundle?): RecommendationsFreeFragment {
      val fragment = RecommendationsFreeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
