/**
    - Pada saat kita membuat aplikasi Android, kadang aplikasi yang kita buat akan diakses dari berbagai
      negara menggunakan berbegai bahasa.
    - Agar aplikasi kita dapat digunakan oleh banyak orang, ada baiknya kita membuat text, files, number,
      gambar, dll sesuai dengan lokasi pengguna.
    - Android mendukung fitur Localization, dimana kita membuat resource yang kita buat dapat
      menyesuaikan dengan bahasa yang digunakan oleh pengguna aplikasi kita.

    Default Resource
    - Pada saat membuat resource, maka Android akan mengakses default resource, contoh default
      values resource akan diambil dari res/values/namafile.xml
    - Jika tidak ada default resource, maka akan terjadi error yang menyebabkan aplikasi kita tidak
      dapat berjalan.

    Localization Resource
    - Setelah kita membuat default resource, selanjutnya kita dapat membuat resource alternatif untuk
      bahasa lain.
    - Caranya kita dapat membuat resource dengan nama 'res/{type}-{local}/namafile.xml'
    - Misal 'res/values-in/strings.xml' untuk values resource bahasa indonesia.
    - Misal 'res/drawable-in/gambar1.png' untuk drawable resource bahasa indonesia.
    - Pada saat kita membuat resource alternatif, jika ternyata resource dengan id yang dimaksud
      tidak tersedia, maka secara otomatis akan menggunakan default resource.
 */
package com.practice.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        // Memanggil function initComponents
        initComponents()

        sayHelloButton.setOnClickListener(){
            val name: String = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)
        }
    }
}