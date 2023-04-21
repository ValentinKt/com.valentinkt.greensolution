package com.valentinkt.sunapp.modules.myaccount.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.databinding.RowListglobeBinding
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListglobeRowModel
import kotlin.Int
import kotlin.collections.List

class ListglobeAdapter(
  var list: List<ListglobeRowModel>
) : RecyclerView.Adapter<ListglobeAdapter.RowListglobeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListglobeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listglobe,parent,false)
    return RowListglobeVH(view)
  }

  override fun onBindViewHolder(holder: RowListglobeVH, position: Int) {
    val listglobeRowModel = ListglobeRowModel()
    // TODO uncomment following line after integration with data source
    // val listglobeRowModel = list[position]
    holder.binding.listglobeRowModel = listglobeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListglobeRowModel>) {
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
      item: ListglobeRowModel
    ) {
    }
  }

  inner class RowListglobeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListglobeBinding = RowListglobeBinding.bind(itemView)
  }
}
