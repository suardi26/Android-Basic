/**
Android
    - Android adalah sistem operasi berbasis Linux yang dirancang untuk perangkat layar sentuh
      seperti smartphone/tablet.
    - Android awalnya dikembangkan oleh Android Inc, Android Inc didirikan oleh Andy Rubin pada tahun 2003.
    - Google mengakusisi Android Inc pada tahun 2005, dan menjadikan anak perusahaan sepenuhnya yang
      dimiliki oleh Google.
    - System Operasi Android dirilis  secara resmi pada tahun 2007, dan ponsel Android pertama mulai
      dijual pada tahun 2008.
    - Untuk dokumentasi mengenai android dapat dikunjungi halaman web 'https://www.android.com/?hl=id'
    - Sama seperti OS lain-nya, Android sendiri sudah berkembang sejak pertama kali dikenalkan.
    - Pada saat ini, Android sudah versi 12.
    - Namun bukan berarti semua perangkat sudah menggunakan Android versi 12, bisa jadi beberapa
      perangkat belum mendukung OS Android versi terbaru.

Android Development
    - Pada saat pertama kali diperkenalkan, untuk membuat aplikasi di Android, kita bisa membuatnya
      menggunakan bahasa pemrograman Java.
    - Namun bukan berarti semua fitur pemrograman Java dapat digunakan.
    - Android hanya menggunakan bahasa pemrograman Java, dan sedikit fitur yang terdapat pada Java.
    - Oleh karena itu, kita perlu belajar lagi standard library atau API yang terdapat pada Android,
      karena walaupun menggunakan bahasa yang sama, namun teknologinya berbeda, untuk detailnya
      dapat mengunjungi halaman web 'https://developer.android.com/?hl=id', web ini dikhususkan
      untuk developers android.

Pemrograman Kotlin
    - Pada tahun 2017, Google mengumumkan bahwa Kotlin menjadi bahasa pemrograman utama yang sekarang
      digunakan untuk pengembangan aplikasi Android, menggantikan java.
    - Kotlin adalah bahasa pemrograman yang dibuat oleh perusahaan JetBrains yang pertama kali
      dirilis sekitar tahun 2011.
    - Pada saat ini, Kotlin semakin populer karena Kotlin dapat bekerja dengan baik dengan ekosistem
      Java, sehingga tidak hanya programmer Android, Programmer Backend Java pun sekarang banyak yang
      menggunakan Kotlin, untuk detailnya dapat mengunjungi halaman web 'https://developer.android.com/kotlin?hl=id'.

Android Studio
    - Android Studio adalah integrated Development Environment(Text Editor Yang lengkap) yang
      disediakan oleh Google untuk membuat aplikasi Android.
    - Android Studio sendiri dibangun diatas JetBrains Intellij IDEA, sehingga akan sangat familiar
      untuk programmer yang sebelumnya sudah menggunakan JetBrains IDE.
    - Android Studio dapat digunakan dengan gratis, untuk detailnya dapat mengunjungi halaman web
      'https://developer.android.com/studio?hl=id'

Android SDK
    - Pada saat kita membuat aplikasi Android menggunakan android studio, maka kita membutuhkan
      Android SDK (Software Development Kit)
    - Android SDK akan terinstall secara otomatis ketika pertama kali kita membuat project,
      namun kadang kita ingin menambahkan fitur atau melakukan update terhadap Android SDK yang kita install.
    - Kita dapat menggunakan Android Studio untuk melakukan management Android SDK.

Android Compatibility
    - Karena Android adalah sistem operasi yang Open Source, maka banyak sekali vendor yang membuat
      device yang menggunakan OS Android.
    - Dari mulai smartphone, tablet, smart tv sampai dashboard untuk mobil.
    - Oleh karena itu, kita perlu berhati-hati untuk memastikan kode program kita dapat berjalan
      pada device yang berbeda.
    - Salah satu yang paling penting adalah memilih Android API Level yang ingin kita gunakan.
    - Pada saat kita membuat aplikasi Android, kita perlu menentukan API Level minimal yang akan
      kita gunakan, hal ini dilakukan untuk memastikan aplikasi kita dapat berjalan dengan baik pada
      sistem operasi Android yang menggunakan API Level tersebut.

API Level
    - Semakin tinggi API Level yang dipilih, maka semakin banyak fitur yang dapat digunakan, tapi
      semakin sedikit juga device yang sudah menggunakan API Level tersebut.
    - Oleh karena itu, kita perlu hati-hati menentukan API Level minimal yang akan kita gunakan untuk
      membuat aplikasi android.
    - Salah satu yang paling mudah, kita dapat melihat statistic pengguna device Android berdasarkan
      API Level-nya.

Android Release Note
    - Untuk melihat daftar fitur apa saja yang terdapat di versi Android tertentu, kita dapat melihat
      detailnya di release note Android-nya, pada halaman web :
      'https://developer.android.com/about/versions?hl=id'.

Gradle
    - Android menggunakan Gradle untuk project management-nya.
    - Secara default, Android Studio akan membuat multi module Gradle Project, dimana hanya terdapat
      1 module, yaitu app.

Android Virtual Device
    - Pada saat kita membuat aplikasi Android, kita tidak dapat menjalankan aplikasinya di OS Windows,
      Mac, Linux yang kita gunakan.
    - Kita membutuhkan OS Android untuk menjalankan aplikasi Android kita.
    - Ada 2 cara menjalankan aplikasi Android kita, pertama menggunakan device Android kita, dan
      kedua membuat Virtual Device/Emulator.
    - Dan Android SDK mendukung untuk membuat Virtual Device, sehingga akan memudahkan kita menjalankan
      sistem operasi Android secara virtual.

 Android Development Mode
    - Selain menggunakan Android Virtual Device (Emulator), kita juga dapat menggunakan smartphone
      Android untuk mencoba aplikasi Android kita.
    - Namun Sebelum kita dapat menggunakan smartphone Android kita, terlebih dahulu kita perlu
      menjelaskan Development Mode di smartphone Android kita.
    - Biasanya tiap merek smartphone memiliki cara sendiri-sendiri untuk mengaktifkan Development Mode,
      oleh karena itu disarankan untuk mencari di internet cara mengaktifkan Development Mode pada
      merek smartphone yang kita gunakan.
    - Khusus untuk Windows, kita juga perlu menginstall Driver agar smartphone Android kita dapat
      terdeteksi, untuk lebih jelasnya dapat mengunjungi halaman web :
      'https://developer.android.com/studio/run/oem-usb?hl=id'.

 Android Build System
    - Android Build System akan melakukan kompilasi aplikasi dari kode program dan resource serta
      mem-package semuanya menjadi sebuah aplikasi Android.
    - Android Studio menggunakan Gradle, untuk melakukan otomatisasi semua proses tersebut,
      sehingga kita tidak perlu melakukannya secara manual lagi menggunakan Android Build System.
    - Gradle dan Anroid Build System sendiri sebenarnya dapat berjalan secara independen, oleh
      karena itu kita wajib menggunakan Android Studio, namun dengan menggunakan Android Studio,
      akan mempermudah kita ketika membuat aplikasi Android.

    Proses Build
    - Compiler akan melakukan kompilasi semua code kita menjadi DEX (Dalvix Executable) file.
    - API Packager akan menandai file apakah ini versi debug atau release, sebelum akhirnya dijadikan
      aplikasi file APK (Android Application Package).

 Konfigurasi Modul Aplikasi
    - Setiap module pada project, terdapat gradle file build.gradle yang berisikan konfigurasi dari
      module aplikasi.
    - Kita perlu menentukan konfigurasi pada modul aplikasi sesuai dengan build configuration yang kita
      gunakan, misal kita harus pastikan sdk dan target sdk-nya sesuai dengan yang kita gunakan misalnya.
    - Selain kita juga perlu menentukan applicationId, yang mana itu adalah id dari aplikasi kita, dan
      harus unik secara global, artinya tidak boleh ada yang sama.

 Android Application Package
    - Sebelum menjalankan apikasi,kita perlu mem-package aplikasi Android kita dalam format
      APK (Android Application Package).
    - Namun hal ini tidak perlu kita lakukan manual, karena secara otomatis Android Studio akan
      menggunakan Gradle untuk membuat APK secara otomatis, lalu mengirimnya ke Device Android
      yang kita pilih (Virtual Device atau Device Asli).

 Manifest File
    - Setiap project Android, wajib memiliki Manifest File yaitu AndroidManifest.xml
    - Manifest File berisikan informasi dari aplikasi yang kita buat, seperti informasi Activity,
      Permission, Intent, Provider, Receiver, Service, dll.
    - Untuk lebih jelasnya silahkan buka halaman web :
      'https://developer.android.com/guide/topics/manifest/manifest-intro?hl=id'
 */
package com.practice.createproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}