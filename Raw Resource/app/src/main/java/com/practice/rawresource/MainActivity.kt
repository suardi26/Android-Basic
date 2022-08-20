/**
    Raw Resource
    - Salah satu permasalahan ketika menggunakan Asset Manager adalah, kita harus mengetikkan lokasi
      resource-nya menggunakan string. hal ini akan rentan kesalahan, terutama jika lokasi file tidak
      ada, maka otomatis aplikasi kita akan error. Dan error ini tidak dapat dideteksi ketika kompilasi.
    - Android juga sebenarnya mendukung Raw Resource, memang tidak se-flexible AssetManager,
      namun pada kasus yang tidak terlalu banyak Asset-nya, dapat menggunakan Raw resource.
    - Raw Resource akan secara otomatis men-generate id pada class R, sehingga kesalahan tidak akan
      mungkin terjadi ketika apolikasinya sudah berjalan.
    - Karena Raw Resource merupakan bagian dari resource maka dapat mendukung Localization.

 */
package com.practice.rawresource

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
            // mengambil data pada file JSON dari Raw Resource
            val sample: String = resources.openRawResource(R.raw.sample)
                .bufferedReader()
                .use { value -> value.readText() }
            Log.i("RAW RESOURCE", sample)
        }
    }
}