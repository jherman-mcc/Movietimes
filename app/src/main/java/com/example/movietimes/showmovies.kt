package com.example.movietimes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.widget.*

class showmovies : AppCompatActivity() {
    private var zipCode: String? = ""
    private var txtMovie: String? = ""


    private var ctv1: CheckedTextView? = null
    private var ctv2: CheckedTextView? = null
    private var ctv3: CheckedTextView? = null
    private var ctv4: CheckedTextView? = null
    private var ctv5: CheckedTextView? = null
    private var ctv6: CheckedTextView? = null
    private var ctv7: CheckedTextView? = null
    private var ctv8: CheckedTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showmovies)

        ctv1 = findViewById<CheckedTextView>(R.id.ctv1)
        ctv2 = findViewById<CheckedTextView>(R.id.ctv2)
        ctv3 = findViewById<CheckedTextView>(R.id.ctv3)
        ctv4 = findViewById<CheckedTextView>(R.id.ctv4)
        ctv5 = findViewById<CheckedTextView>(R.id.ctv5)
        ctv6 = findViewById<CheckedTextView>(R.id.ctv6)
        ctv7 = findViewById<CheckedTextView>(R.id.ctv7)
        ctv8 = findViewById<CheckedTextView>(R.id.ctv8)

        val btnNext = findViewById<Button>(R.id.btnNext)
        val extras = intent.extras
        if (extras != null) {
            zipCode = extras.getString("zipCode")
            txtMovie = extras.getString("MovieName")
        }
        btnNext.setOnClickListener {
            var radioButton: RadioButton
            var ctv1Text = ""
            var ctv2Text = ""
            var ctv3Text = ""
            var ctv4Text = ""
            var ctv5Text = ""
            var ctv6Text = ""
            var ctv7Text = ""
            var ctv8Text = ""

            var selectedTime1 = 0
            var selectedTime2 = 0
            var selectedTime3 = 0
            var selectedTime4 = 0
            var selectedTime5 = 0
            var selectedTime6 = 0
            var selectedTime7 = 0
            var selectedTime8 = 0

            if (ctv1!!.isChecked) {
                ctv1Text = ctv1!!.text.toString()
//                selectedTime1 = ctv1!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime1) // R.id.<whatever>
            }

            if (ctv2!!.isChecked) {
                ctv2Text = ctv2!!.text.toString()
//                selectedTime2 = ctv2!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime2) // R.id.<whatever>
            }

            if (ctv3!!.isChecked) {
                ctv3Text = ctv3!!.text.toString()
//                selectedTime3 = ctv3!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime3) // R.id.<whatever>
            }

            if (ctv4!!.isChecked) {
                ctv4Text = ctv4!!.text.toString()
//                selectedTime4 = ctv4!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime4) // R.id.<whatever>
            }

            if (ctv5!!.isChecked) {
                ctv5Text = ctv5!!.text.toString()
//                selectedTime5 = ctv5!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime5) // R.id.<whatever>
            }

            if (ctv6!!.isChecked) {
                ctv6Text = ctv6!!.text.toString()
//                selectedTime6 = ctv6!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime6) // R.id.<whatever>
            }

            if (ctv7!!.isChecked) {
                ctv1Text = ctv7!!.text.toString()
//                selectedTime7 = ctv7!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime7) // R.id.<whatever>
            }

            if (ctv8!!.isChecked) {
                ctv1Text = ctv8!!.text.toString()
//                selectedTime8 = ctv8!!.checkedRadioButtonId
                radioButton = findViewById<RadioButton>(selectedTime8) // R.id.<whatever>
            }



            if (radioCheck(
                    selectedTime1,
                    selectedTime2,
                    selectedTime3,
                    selectedTime4,
                    selectedTime5,
                    selectedTime6,
                    selectedTime7,
                    selectedTime8
                )) {
                // Intent to next screen.
                val nextScreen2 = Intent(this@showmovies, Summary::class.java).apply {
                    putExtra("zipCode", zipCode)
                    putExtra("MovieName", txtMovie)
                    putExtra("Theater1", ctv1Text)
                    putExtra("Theater2", ctv2Text)
                    putExtra("Theater3", ctv3Text)
                    putExtra("Theater4", ctv4Text)
                    putExtra("Theater5", ctv5Text)
                    putExtra("Theater6", ctv6Text)
                    putExtra("Theater7", ctv7Text)
                    putExtra("Theater8", ctv8Text)

                }
                // Start the activity
                startActivity(nextScreen2)

            } else {
                Toast.makeText(applicationContext, "Time Slot conflict.", Toast.LENGTH_LONG)
                    .show()
            }
        }


        ctv1!!.setOnClickListener {
            if (ctv1!!.isChecked)
                enableDisable(ctv1, Color.WHITE, false)
            else
                enableDisable(ctv1, Color.GRAY, true)
        }
        ctv2!!.setOnClickListener {
            if (ctv2!!.isChecked)
                enableDisable(ctv2, Color.WHITE, false)
            else
                enableDisable(ctv2, Color.GRAY, true)
        }

        ctv3!!.setOnClickListener {
            if (ctv3!!.isChecked)
                enableDisable(ctv3, Color.WHITE, false)
            else
                enableDisable(ctv3, Color.GRAY, true)
        }

        ctv4!!.setOnClickListener {
            if (ctv4!!.isChecked)
                enableDisable(ctv4, Color.WHITE, false)
            else
                enableDisable(ctv2, Color.GRAY, true)
        }

        ctv5!!.setOnClickListener {
            if (ctv5!!.isChecked)
                enableDisable(ctv5, Color.WHITE, false)
            else
                enableDisable(ctv5, Color.GRAY, true)
        }

        ctv6!!.setOnClickListener {
            if (ctv6!!.isChecked)
                enableDisable(ctv6, Color.WHITE, false)
            else
                enableDisable(ctv6, Color.GRAY, true)
        }

        ctv7!!.setOnClickListener {
            if (ctv7!!.isChecked)
                enableDisable(ctv7, Color.WHITE, false)
            else
                enableDisable(ctv7, Color.GRAY, true)
        }

        ctv8!!.setOnClickListener {
            if (ctv8!!.isChecked)
                enableDisable(ctv8, Color.WHITE, false)
            else
                enableDisable(ctv8, Color.GRAY, true)
        }

    }

   fun enableDisable(ctv: CheckedTextView?,bgColor: Int?,state: Boolean?) {
            ctv!!.isChecked = state!!
            ctv.setBackgroundColor(bgColor!!)
            }
        }

          fun radioCheck(selectedTime1: Int,selectedTime2: Int,selectedTime3: Int,selectedTime4: Int, selectedTime5: Int, selectedTime6: Int, selectedTime7: Int, selectedTime8: Int): Boolean {
//
////            if (selectedTime1 == R.id.ctv1 && selectedTime4 == R.id.rb7) {
////                rb2!!.error = "Time Slot Conflict"
////                rb7!!.error = "Time Slot Conflict"
////                return false
////            }
////            if (selectedTime1 == R.id.rb1 && selectedTime2 == R.id.rb3) {
////                rb1!!.error = "Time Slot Conflict"
////                rb3!!.error = "Time Slot Conflict"
////                return false
////            }
////
////            if (selectedTime3 == R.id.rb5 && selectedTime4 == R.id.rb8) {
////                rb5!!.error = "Time Slot Conflict"
////                rb8!!.error = "Time Slot Conflict"
////                return false
//            }
//
             return true

//
    }
//}