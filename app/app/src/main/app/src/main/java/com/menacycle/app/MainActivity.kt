package com.menacycle.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(18, 18, 18))

        val title = TextView(this)
        title.text = "🌸 MenaCycle"
        title.textSize = 34f
        title.setTextColor(Color.rgb(255, 80, 160))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Araho ny tsingerim-bolanao"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
