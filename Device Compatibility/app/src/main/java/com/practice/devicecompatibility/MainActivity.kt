/**
    Device Compatibility
    - Android di-desain untuk dapat berjalan pada berbagai perangkat, dari smartphone, tablet sampai
      smart tv.
    - Banyaknya target perangkat yang dapat menjalankan Android menjadikan salah satu keuntungan,
      sehingga aplikasi kita dapat ditargetkan untuk banyak jenis perangkat.
    - Namun, agar aplikasi kita dapat berjalan dengan baik di berbagai jenis perangkat yang berbeda,
      aplikasi kita harus memastikan bahwa dapat mentoleransi ketersediaan fitur pada perangkat keras,
      dan juga UI yang harus flexible yang dapat beradaptasi dengan ukuran layar yang berbeda-beda.

    Controlling Application Availability
    - Android mendukung banyak sekali fitur yang dapat digunakan oleh aplikasi kita melalui Android
      Platform API. Beberapa fitur ada yang berbasis hardware (misal compass sensor dan fingerprint),
      beberapa berbasis software (misal app widgets), dan beberapa tergantung versi platform/versi OS Android-nya.
    - Tidak semua perangkat Android mendukung semua fitur, jadi kita harus mengontrol aplikasi kita
      berdasarkan fitur yang terdapat pada perangkat-nya.
    - Untuk mengontrol perangkat yang dapat menjalankan aplikasi kita, kita dapat menggunakan 2 cara,
      yaitu declarative atau programmatic.
    - Declarative artinya kita simpan pada konfigurasi aplikasi, hal ini menyebabkan kondisi wajib.
    - Programmatic artinya kita cek di kode aplikasi kita, jadi pengecekan dilakukan saat aplikasi
      berjalan.

    Device Feature di Manifest File (Declarative)
    - Contoh jika kita mewajibkan sebuah fitur ada di device, dan jika tidak ada maka aplikasi kita
      tidak dapat dijalankan, maka kita bisa tambahkan di manifest file.
    - Contoh, jika aplikasi kita berbasis  compass sensor, maka tidak berguna juga device-nya jika
      tidak memiliki fitur tersebut, sehingga kita dapat mewajibkan perangkat yang memiliki fitur
      compass sensor.
    - Jika perangkat tidak memiliki fitur itu, secara otomatis dia tidak dapat menginstall aplikasi
      kita.

    Device Feature di Kode (Programmatic)
    - Namun jika misal fitur yang kita butuhkan hanya opsional, misal contohnya fingerprint ada fitur
      yang boleh ada juga yang tidak, kita hanya cukup melakukan pengecekan di kode program kita saja.
    - Kita dapat menggunakan class PackageManager untuk mengeceknya.
    - Untuk lebih jelasnya mengenai class PackageManager dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/content/pm/PackageManager'
    - Dan untuk mendapatkan object PackageManager, kita dapat menggunakan function getPackageManager()
      atau pada Kotlin packageManager.

    Platform Version
    - Pada saat membuat aplikasi Android, kadang kita ingin mendukung versi dari platform yang minimal
      versi berapa.
    - Dan setiap versi platform Android rilis, biasanya akan membawa fitur baru, sehingga kita perlu
      mengetahuinya juga, fitur yang terdapat di Android tersebut ada sejak versi platform berapa.
    - Untuk menentukan bahwa aplikasi hanya dapat berjalan pada platform versi berapa maka dapat
      dilakukan dengan 2 cara:
        - yaitu mendeklarasikan secara langsung minimal SDK (minSdk) pada file build.gradle.
        - Dan dapat juga dilakukan secara Programmatic pada saat aplikasi berjalan, sehingga dapat
          melakukan pengecekan SDK pada saat aplikasi berjalan.
 */
package com.practice.devicecompatibility

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Device Feature di Kode (Programmatic)
            // Melakukan pengecekan apakah OS android pada saat ini memiliki fitur Fingerprint atau tidak.
            if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
                Log.i("FEATURE", "Enabled fingerprint feature")
            }
            else Log.i("FEATURE", "Disabled fingerprint feature")

        // Pengecekan Versi Platform
            // melakukan pengecekan SDK pada saat aplikasi berjalan
            // ketika menggunakan versi SDK dibawah 31 (S) maka menampilkan pesan Logging
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
                Log.i("SDK", "Disabled Some Features")
                Log.i("SDK", Build.VERSION.SDK_INT.toString())
            }
    }
}