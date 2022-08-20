/**
    - Application adalah base class untuk maintain global application state.
    - Secara default Android akan membuat object Application sendiri, namun kita juga dapat membuat
      class Application sendiri, asal harus turunan dari class Application.
    - Dan untuk mendaftarkan class Application yang kita buat, kita harus daftarkan pada
      Manifest File dengan tag "android:name".
    - Untuk lebih jelasnya mengenai class Application dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/app/Application'
    - Untuk mendapatkan object Application, kita dapat menggunakan function getApplication() atau
      application pada Kotlin di Activity.
 */
package com.practice.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        application
    }
}