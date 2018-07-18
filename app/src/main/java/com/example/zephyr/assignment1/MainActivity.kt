package com.example.zephyr.assignment1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var listView: ListView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        listView = findViewById(R.id.listView)
        button = findViewById(R.id.button)

        var listData = arrayListOf<String>()

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData)
        listView.adapter = adapter

        button.setOnClickListener{
            var str = editText.text.toString()
            listData.add(str)
            adapter.notifyDataSetChanged()
        }

    }
}
