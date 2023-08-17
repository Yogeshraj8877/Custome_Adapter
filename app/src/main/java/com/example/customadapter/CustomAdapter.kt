package com.example.customadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context:Context,val datalist:ArrayList<DataModel>):BaseAdapter() {
    override fun getCount(): Int {
return datalist.size
    }

    override fun getItem(position: Int): Any {
return datalist[position]
    }

    override fun getItemId(position: Int): Long {
return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView=LayoutInflater.from(context).inflate(R.layout.customlistview,parent,false)
        val image=rowView.findViewById<ImageView>(R.id.image)
        val title=rowView.findViewById<TextView>(androidx.core.R.id.title)
        val description = rowView.findViewById<TextView>(R.id.description)
        val data=datalist[position]
        image.setImageResource(R.drawable.sidepark)
        title.setText(data.title)
        description.setText(data.description)
        return rowView
    }
}