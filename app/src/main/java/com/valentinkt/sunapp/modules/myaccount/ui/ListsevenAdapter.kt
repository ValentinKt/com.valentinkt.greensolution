package com.valentinkt.sunapp.modules.myaccount.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valentinkt.sunapp.R
import com.valentinkt.sunapp.databinding.RowListsevenBinding
import com.valentinkt.sunapp.modules.myaccount.`data`.model.ListsevenRowModel
import kotlin.Int
import kotlin.collections.List

class ListsevenAdapter(
  var list: List<ListsevenRowModel>
) : RecyclerView.Adapter<ListsevenAdapter.RowListsevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listseven,parent,false)
    return RowListsevenVH(view)
  }

  override fun onBindViewHolder(holder: RowListsevenVH, position: Int) {
    val listsevenRowModel = ListsevenRowModel()
    // TODO uncomment following line after integration with data source
    // val listsevenRowModel = list[position]
    holder.binding.listsevenRowModel = listsevenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsevenRowModel>) {
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
      item: ListsevenRowModel
    ) {
    }
  }

  inner class RowListsevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsevenBinding = RowListsevenBinding.bind(itemView)
  }
}
