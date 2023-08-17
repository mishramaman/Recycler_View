package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val empList: List<String>,val empDes:List<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.item_view,null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return empList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.empTitle.text=empList[position]
        holder.empDes.text=empDes[position]
    }


    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val empTitle=itemView.findViewById<TextView>(R.id.empName)
        val empDes=itemView.findViewById<TextView>(R.id.empdes)

    }
}

