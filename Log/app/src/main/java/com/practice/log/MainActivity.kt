/**
    Log
    - Pada saat membuat kode program Kotlin atau Java, kita sering melakukan println atau menulis
      tulisan ke console.
    - Pada Android kita juga dapat melakukan hal tersebut dengan menggunakan class Log
    - Lebih tepatnya Log ini digunakan untuk melakukan logging pada Android.
    - Untuk lebih jelasnya silahkan kunjungi halaman web :
      'https://developer.android.com/reference/android/util/Log'.

    Log Level
    - Berbeda dengan println biasanya, pada Log, terdapat yang namanya Level, yaitu level informasi
      yang ingin kita tampilkan.
    - Android mendukung beeberapa jenis Log Level.
        Log Level               Function
        - VERBOSE               Log.v(tag.message?, throwable?)
        - DEBUG                 Log.d(tag.message?, throwable?)
        - INFO                  Log.i(tag.message?, throwable?)
        - WARN                  Log.w(tag.message?, throwable?)
        - ERROR                 Log.e(tag.message?, throwable?)
        ket : paling atas paling rendah, paling bawah paling tinggi prioritasnya.

 */
package com.practice.log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        // Memanggil function initComponents
        initComponents()

        // Membuat Logging/ menampilkan informasi (dapat juga ditambahkan exception pada parameter
        // Log.i("")
        sayHelloButton.setOnClickListener(){
            Log.d("Information", "This is Debug Log")
            Log.i("Information", "This is Info Log")
            Log.w("Information", "This is Warn Log")
            Log.e("Information", "This is Error Log")
            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi, $name"

        }


    }
}