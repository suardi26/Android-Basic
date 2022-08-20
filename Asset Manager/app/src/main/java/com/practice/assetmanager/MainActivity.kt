/**
    Asset Manager
    - Kadang kita ingin menambahkan resource pada aplikasi Android, tapi bukan resource yang di manage
      oleh Android, misal kita ingin menambahkan file JSON atau TXT misalnya.
    - Untuk kasus seperti ini, kita dapat menggunakan AssetManager.
    - AssetManager adalah class yang dapat kita gunakan untuk mengakses resource secara manual.
    - Untuk lebih jelasnya mengenai class AssetManager dapat mengunjungi halaman web :
        'https://developer.android.com/reference/android/content/res/AssetManager'
    - AssetManager akan mengambil resource pada directory assets, sehingga kita perlu membuatnya
      terlebih dahulu.
    - Dan untuk mendapatkan AssetManager, kita dapat menggunakan function getAssets() atau pada Kotlin
      assets, pada Context/Activity.
 */
package com.practice.assetmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        // Memanggil function initComponents()
        initComponents()

        sayHelloButton.setOnClickListener(){

            // mengambil data pada file JSON dari package assets.
            val json: String = assets.open("sample.json")
                .bufferedReader()
                .use {it.readText()}
            Log.i("ASSET", json)
        }
    }


}