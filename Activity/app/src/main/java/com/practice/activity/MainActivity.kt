/**
    Activity
    - Pada saat kita membuat aplikasi seperti pada Java atau Kotlin, biasanya ketika akan membuat
      main function sebagai function yang akan diluncurkan ketika aplikasi berjalan.
    - Pada Android tidak seperti itu, Android memiliki fitur yang bernama Activity, dimana nanti
      object Activity tersebut akan secara otomatis dijalankan oleh Android.

    Class Activity
    - Untuk membuat Activity, kita perlu membuat class turunan dari Activity.
    - Saat kita membuat project Android, secara otomatis akan ada sebuah MainActivity yang merupakan
      class turunan dari AppCompatActivity.
    - AppCompatActivity merupakan turunan dari class Activity yang memungkinkan kita menggunakan fitur
      baru Android di versi Android lama, oleh karena itu direkomendasikan menggunakan
      class AppCompatActivity.
    - Untuk lebih detail-nya dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/app/Activity'

    Mendaftarkan Activity
    - Untuk memberitahu kepada Android, bahwa kita membuat Activity, kita harus mendaftarkannya pada
      Manifest File.
    - Selain itu, kita perlu menambahkan intent untuk menambahkan informasi seperti misalnya,
      menandai sebuah Activity bahwa ini adalah Main Activity, dan menandai bahwa Activity ini harus
      dijalankan ketika aplikasi Android diluncurkan/dibuka (Launch).

    Activity Callback
    - Activity itu memiliki banyak sekali function, salah satu function yang dipanggil ketika
      Activity dibuat adalah onCreate().
 */
package com.practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}