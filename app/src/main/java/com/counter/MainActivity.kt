package com.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rahul.counter.Counter
import com.rahul.counter.`interface`.ValueChangeListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var counter=findViewById<Counter>(R.id.counter)

        counter.setValueChangeListener(object:ValueChangeListener{
            override fun onValueIncremented(value: String) {
                Toast.makeText(applicationContext, "${value}", Toast.LENGTH_SHORT).show()
            }

            override fun onValueDecremented(value: String) {
                Toast.makeText(applicationContext, "${value}", Toast.LENGTH_SHORT).show()
            }

            override fun onValueChanged(value: String) {

            }

        })
    }
}