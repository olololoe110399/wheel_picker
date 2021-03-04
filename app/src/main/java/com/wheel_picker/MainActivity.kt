package com.wheel_picker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val view: LoopView = findViewById(R.id.loopView)
		val arrayList = ArrayList<String>()
		for (i in 0..29) {
			arrayList.add("" + i)
		}
		view.arrayList = arrayList
	}
}
