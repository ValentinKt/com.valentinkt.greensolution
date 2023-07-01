package com.valentinkt.sunapp.modules.navbar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.databinding.RowNavBarBinding
import com.valentinkt.sunapp.modules.navbar.`data`.model.NavBarRowModel
import kotlin.Int
import kotlin.collections.List

class NavBarAdapter(
  var list: List<NavBarRowModel>
) : RecyclerView.Adapter<NavBarAdapter.RowNavBarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNavBarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_nav_bar,parent,false)
    return RowNavBarVH(view)
  }

  override fun onBindViewHolder(holder: RowNavBarVH, position: Int) {
    val navBarRowModel = NavBarRowModel()
    // TODO uncomment following line after integration with data source
    // val navBarRowModel = list[position]
    holder.binding.navBarRowModel = navBarRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NavBarRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: NavBarRowModel
    ) {
    }
  }

  inner class RowNavBarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNavBarBinding = RowNavBarBinding.bind(itemView)
  }
}
