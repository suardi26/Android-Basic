/**
    Lateinit
    - Pada saat kita menggunakan function findViewById(), maka aplikasi kita secara otomatis mencari
      View berdasarkan id kita.
    - Saat komponen dan layout kita masih sedikit, maka menggunakan findViewById() secara terus
      menerus tidak akan bermasalah, namun saat nanti komponen dan layout semakin banyak, maka
      akan membuat kode program kita semakin lambat.
    - Oleh karena itu tidak disarankan selalu memenggil function ini setiap kita butuh komponen.
    - Ada best practice yang dapat dilakukan, yaitu Lateinit.
    - Salah satu rekomendasinya adalah kita simpan object komponen-nya sebagai variable pada class-nya.
    - Namun karena pada Kotlin jika kita ingin membuat variable yang dapat nullable harus menggunakan
      tanda ?, namun agar lebih mudah, kita dapat menggunakan lateinit, agar variable yang kita buat
      tidak perlu menjadi nullable.
 */
package com.practice.lateinit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener(){
            val name: String = nameEditText.text.toString()
            sayHelloTextView.text = "Hy $name"
        }
    }
}