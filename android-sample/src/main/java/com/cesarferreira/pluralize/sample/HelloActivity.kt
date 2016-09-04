package com.cesarferreira.pluralize.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.cesarferreira.pluralize.pluralize
import com.cesarferreira.pluralize.singularize
import kotlinx.android.synthetic.main.content_hello.*

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val singulars = arrayOf("person", "banana", "woman")

        for (item in singulars) {
            concat("$item -> pluralize -> ${item.pluralize()}")
        }

        concat("")
        concat("")

        val plurals = arrayOf("words", "octopi", "sheep")

        for (item in plurals) {
            concat("$item -> singularize -> ${item.singularize()}")
        }
    }

    fun concat(str: String) {
        centerTextView.append(str + "\n")
    }

}
