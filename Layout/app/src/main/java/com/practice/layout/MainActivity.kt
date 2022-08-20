/**
    - Activity bukanlah tampilan UI, tapi biasanya Activity itu akan menampilkan tampilan UI.
    - Android memisahkan antara kode program dan tampilan UI, namanya adalah Layout.
    - Layout merupakan kode yang berisikan tampilan UI.
    - Layout pada Android menggunakan XML, sehingga yang terbiasa menggunakan HTML, akan mudah beradaptasi.

    R Class
    - Pada saat kita membuat Layout baru, secara otomatis Android akan melakukan auto generate sebuah
      variable berisikan id layout yang sesuai dengan nama Layout-nya.
    - Dan untuk menentukan Layout mana yang akan ditampilkan pada Activity, kita dapat menggunakan
      function setContentView(layout_id).
 */
package com.practice.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)
    }
}