package com.training.facebookapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ConvertNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_convert_number)

        val editTextCm: EditText = findViewById(R.id.editTextCm)
        val buttonConvert: Button = findViewById(R.id.buttonConvert)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonConvert.setOnClickListener {
            val cmValue = editTextCm.text.toString()
            if (cmValue.isNotEmpty()) {
                val cm = cmValue.toDouble()
                val inches = cm / 2.54
                String.format(getString(R.string._2f_inches), inches).also { textViewResult.text = it }
            } else {
                "Please enter a value".also { textViewResult.text = it }
            }
        }
    }

}