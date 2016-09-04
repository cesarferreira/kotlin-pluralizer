package com.cesarferreira.pluralize.sample

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import com.cesarferreira.pluralize.pluralize
import com.cesarferreira.pluralize.singularize

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener({
            view ->
            Log.d("TAG", "person".pluralize())
            Log.d("TAG", "banana".pluralize())
            Log.d("TAG", "woman".pluralize())

            Log.d("TAG", "women".singularize())

        })
    }

}
