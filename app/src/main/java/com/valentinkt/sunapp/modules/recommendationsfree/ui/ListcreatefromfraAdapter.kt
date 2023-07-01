package com.valentinkt.sunapp.modules.recommendationsfree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.databinding.RowListcreatefromfraBinding
import com.valentinkt.sunapp.modules.recommendationsfree.`data`.model.ListcreatefromfraRowModel
import kotlin.Int
import kotlin.collections.List

class ListcreatefromfraAdapter(
  var list: List<ListcreatefromfraRowModel>
) : RecyclerView.Adapter<ListcreatefromfraAdapter.RowListcreatefromfraVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcreatefromfraVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcreatefromfra,parent,false)
    return RowListcreatefromfraVH(view)
  }

  override fun onBindViewHolder(holder: RowListcreatefromfraVH, position: Int) {
    val listcreatefromfraRowModel = ListcreatefromfraRowModel()
    // TODO uncomment following line after integration with data source
    // val listcreatefromfraRowModel = list[position]
    holder.binding.listcreatefromfraRowModel = listcreatefromfraRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcreatefromfraRowModel>) {
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
      item: ListcreatefromfraRowModel
    ) {
    }
  }

  inner class RowListcreatefromfraVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcreatefromfraBinding = RowListcreatefromfraBinding.bind(itemView)
  }
}
