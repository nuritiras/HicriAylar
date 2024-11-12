package tr.com.nuritiras.hicriaylar

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickOnayla(view: View) {
        val editText = findViewById<EditText>(R.id.editTextNumberAy)
        val textView = findViewById<TextView>(R.id.textViewGoster)
        val ay = editText.text.toString().toInt()
        when (ay) {
            1 -> textView.text = "Muharrem"
            2 -> textView.text = "Safer"
            3 -> textView.text = "Rebiülevvel"
            4 -> textView.text = "Rebiülahir"
            5 -> textView.text = "Cemaziyelevvel"
            6 -> textView.text = "Cemaziyelahir"
            7 -> textView.text = "Recep"
            8 -> textView.text = "Şaban"
            9 -> textView.text = "Ramazan"
            10 -> textView.text = "Şevval"
            11 -> textView.text = "Zilkade"
            12 -> textView.text = "Zilhicce"
            else -> textView.text = "Hatalı Giriş"
        }
    }
}