/**
    Profiling
    - Debugging, Unit Test dan Instrumentation Test adalah salah satu cara untuk meminimalisir
      kesalahan ketika membuat aplikasi.
    - Namun kadang-kadang ada masalah yang mungkin tidak terdeteksi oleh debugging, unit test atau
      bahkan instrumentation test.
    - Contoh yang sering terjadi adalah masalah memory leak.
    - Pada kasus ini, fitur Profiling sangatlah berguna.
    - Android mendukung fitur Profiling, dimana kita bisa memonitor aplikasi kita yang berjalan
    - Kita dapat memonitor penggunaan memory, CPU, dll.
    - Untuk masuk ke menu profiling maka dapat menekan tombol disamping kiri tombol stop yang mirip
      seperti spedometer.

 */
package com.practice.profilng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}