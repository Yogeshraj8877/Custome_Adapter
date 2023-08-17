package com.example.customadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data= arrayListOf<DataModel>(
            DataModel("Aimit","college",R.drawable.sidepark),
            DataModel("Aimit","Patna",),
            DataModel("Aimit","Patna",),
            DataModel("Aimit","Patna",),
            DataModel("Aimit","Patna",),
            DataModel("Aimit","Patna",),
            DataModel("Aimit","Patna",),


            )
        val listView=findViewById<ListView>(R.id.listview)
        val adpater=CustomAdapter(this,data)
        listView.adapter=adpater
    }
}