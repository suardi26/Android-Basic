/**
    Testing
    - Testing adalah salah satu tahapan dalam pembuatan aplikasi, termasuk di Android.
    - Android sudah mendukung testing dengan baik, baik itu unit test sampai end to end test.

    jenis Testing pada Android
    - Instrumented Test, yaitu test yang dijalankan di perangkat android, baik tiu physical atau
      emulator. Aplikasi akan di Install di perangkat Android, lalu test akan melakukan pengetesan
      pada aplikasi yang berjalan dengan mengirim perintah-perintah. Instrumented Test bisa dibilang
      juga integration test atau End to End Test.
    - Local Test, yaitu test yang dieksekusi di development machine kita, misal di laptop atau
      di server. Biasanya lobal test itu kecil dan cepat, dan biasanya di dalam local test  tidak
      membutuhkan device Android untuk berjalan. Kita dapat bilang juga dengan nama Unit Test.

    Kenapa Automation testing penting?
    - Dengan menjalankan test terhadap aplikasi kita secara konsisten, kita dapat memverifikasi
      kebenaran aplikasi kita, fungsionalitas aplikasi, sebelum kita merilis aplikasi ke public.
    - Sebenarnya  kita bisa saja melakukan test secara manual, dengan cara menjalankan aplikasi di
      Device, lalu mencoba semua fitur.
    - Namun, manual test sulit untuk dikerjakan secara konsisten, rentang kesalahan dan jika butuh
      cepat, tidak bisa dilakukan secara otomatis juga.
    - Oleh karena itu automation test sangat penting dalam pengembangan aplikasi, terutama aplikasi
      Android.

    Local Test
    - Android menggunakan JUnit untuk melakukan Unit Test atau Local Test.

    Instrumentation Test
    - Unit test hanya dapat digunakan untuk melakukan pengetesan kode program kita.
    - Saat kita membuat aplikasi Android, kadang banyak sekali ketergantungan dengan OS Android itu
      sendiri, oleh karena itu kadang agak sulit untuk membuat unit test ketika kita butuh melakukan
      pengetesan interaksi dengan UI aplikasi kita.
    - Android mendukung Instrumentation Test, atau sederhananya adalah UI Test Automation.
    - Dengan menggunakan Instrumentation Test, kita bisa membuat automation test mirip robot, yang
      mensimulasikan pengguna aplikasi kita.

    Espresso
    - JUnit hanya digunakan untuk library Unit Test, untuk melakukan UI Test, Android menggunakan
      library bernama Espresso
    - Dengan Espresso, kita dapat membuat UI Test dengan mudah.
    - Ada banyak sekali fitur Espresso.
    - Untuk lebih jelasnya mengenai Espresso dapat mengunjungi halaman web :
      'https://developer.android.com/training/testing/espresso'

    Activity Scenario
    - Saat kita melakukan instrumentation test, biasanya kita akan melakukan UI Test, dan untuk
      menampilkan  UI, kita biasanya butuh Activity.
    - Dalam Instrumentation Test, Kita dapat menggunakan ActivityScenario untuk menjalankan sebuah
      Activity
    - Untuk lebih jelasnya mengenai ActivityScenario dapat mengunjungi halaman web :
      'https://developer.android.com/reference/androidx/test/core/app/ActivityScenario'

    Activity Scenario Rule
    - Menjalankan Activity secara manual menggunakan Activity Scenario tidak direkomendasikan
      ketika kita membuat Instrumentation Test.
    - Kita bisa memanfaatkan ActivityScenarioRule yang bisa di integrasikan dengan JUnit Rule, yang
      secara otomatis bisa menjalankan Activity ketika unit test mulai dan menghentikan Activity
      ketika unit test selesai.
    - Untuk lebih jelasnya mengenai ActivityScenarioRule dapat mengunjungi halaman web :
      'https://developer.android.com/reference/androidx/test/ext/junit/rules/ActivityScenarioRule'

    Espresso Package
    - Espresso berisikan banyak class yang dapat digunakan untuk mempermudah kita melakukan
      Instrumentation Test.
    - Package Espresso ada di androidx.test.espresso
    - Untuk lebih jelasnya mengenai package Espresso dapat mengunjungi halaman web :
      'https://developer.android.com/reference/androidx/test/espresso/package-summary?hl=en'
 */
package com.practice.testing

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

        initComponents()
        sayHelloButton.setOnClickListener(){
            val name: String = nameEditText.text.toString()
            val halo = "!"
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name, halo)
        }
    }
}