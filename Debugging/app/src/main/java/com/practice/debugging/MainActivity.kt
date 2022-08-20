/**
    Debugging
    - Pada saat membuat aplikasi, kesalahan sering terjadi.
    - Dan kadang, agak sulit untuk mencari kesalahan tersebut, sehingga kita butuh menelusuri alur
      kode program kita satu per satu.
    - Untungnya, Android memiliki fitur debugging, dimana kita bisa menghentikan program yang sedang
      berjalan, dan melanjutkan jalannya program secara bertahap sesuai yang kita inginkan.
    - Fitur ini sangat tergantung dengan Android Studio.
    - Menjalankan Debug dapat menenkan tombol yang mirip kumbang.
 */

package com.practice.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    // Menyimpan object komponen-nya pada variable dengan menggunakan keyword lateinit
    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    // Membuat function untuk inisiasi object komponen pada variable
    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    private fun printHello(name: String) {
        Log.i("DEBUG", name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponents()

        sayHelloButton.setOnClickListener(){

            // Memanggi function printHello
            val name: String = "suardi"
            printHello(name)
        }
    }
}