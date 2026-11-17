
package com.menacycle.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)

        text.text = "🌸 MenaCycle\n\nAraho ny tsingerim-bolanao"
        text.textSize = 24f
        text.setTextColor(Color.WHITE)
        text.gravity = Gravity.CENTER
        text.setBackgroundColor(Color.rgb(18, 18, 18))

        setContentView(text)
    }
}
