package com.gzeinnumer.nullinkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string: String? = "Hello"
        if(string!=null){
            println(string.length)
        }

        val mess: String? = null
        println(mess!!)


        val a: List<Int?> = listOf(1,2,3, null)
        val b: List<Int> = a.filterNotNull()

        val value: String = string?.first().toString() ?: "Help Me!!"


        var c:String? = "Null String Value"
        val d: Int = if(c!=null) c.length else -1
        val e = c?.length ?: -1
    }
}

