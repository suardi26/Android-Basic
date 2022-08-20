/**
    - Semua komponen UI pada Android adalah turunan class View.
    - Ada banyak sekali komponen yang terdapat pada Android, seperti Layout, Button, TextView,
      ImageView dan masih banyak lagi, semua itu adalah turunan dari class View.
    - Bahkan Layout sendiri adalah turunan dari class View.
    - Untuk detailnya silahkan kunjungi halaman web 'https://developer.android.com/reference/android/view/View'

    Menambahkan View
    - Untuk menambahkan View, kita dapat menyebutkan View yang ingin kita gunakan pada Layout yang
      sudah kita buat.
    - Setiap komponen View memiliki banyak atribut yang dapat diubah, misal Button, Label dan Text memiliki
      atribut text yang dapat kita ubah untuk mengubah tulisan text-nya.

    Find View by Id
    - Pada saat kita menambahkan komponen ke Layout, kadang kita ingin mendapatkan object dari komponen
      tersebut
    - Caranya adalah kita dapat menggunakan function findViewById()
    - Namun sebelum kita dapat menggunakan function tersebut, kita perlu menambahkan id terhadap
      komponen yang ingin kita ambil object-nya.

    View ID
    - Untuk menambahkan View ID, kita dapat menambahkan atribut id pada komponen-nya.
    - Namun caranya kita perlu menggunakan nelai @+id/namaId.
    - Android Build System akan secara otomatis membuatkan id tersebut sebagai id component pada class
      R, mirip seperti pada Layout.
    - Best practice penamaan view ID adalah nama diikuti dengan jenis komponen, misal: nameEditText,
      sayHelloButton, firstNameEditText, lastNameEditText, registerButton, dll.

    Action Listener
    - Beberapa jenis component memiliki Action Listener.
    - Yaitu object yang dapat kita tambahkan ke komponen ketika sebuah aksi dilakukan ke komponen tersebut.
    - Contoh sederhana, pada Button, terdapat Clik Listener yang dapat digunakan untuk menambahkan object
      Listener ketika tombol di Click menggunakan function setOnClickListener(listener).


 */
package com.practice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val sayHelloButton: Button = findViewById(R.id.sayHelloButton)
        val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener(){
            val name: String = nameEditText.text.toString()
            sayHelloTextView.text = "Hy $name"
        }
    }
}