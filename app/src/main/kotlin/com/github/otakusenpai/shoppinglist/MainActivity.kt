package com.github.otakusenpai.shoppinglist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.github.otakusenpai.shoppinglist.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var addAList: Button
    private lateinit var showList: Button
    private lateinit var removeList: Button
    private var TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addAList = findViewById<Button>(R.id.addAList)
        addAList.setOnClickListener(this)
        showList = findViewById(R.id.showList)
        showList.setOnClickListener(this)
        removeList = findViewById(R.id.removeList)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.addAList -> {
                Log.d(TAG, "Added a list")
            }
            R.id.showList -> {
                Log.d(TAG, "Showed List")
            }
            R.id.removeList -> {
                Log.d(TAG, "Removed List")
            }
        }
    }

}
