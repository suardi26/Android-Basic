/**
    Reset Android Studio
    - Kadang ada kalanya kita sering menghadapi error ketika membuka atau menjalankan project Android,
      entah error di Android SDK-nya, atau error pada Android Studio-nya.
    - Pada Kasus yang error seperti ini, yang tidak ada hubungannya dengan kode program kita, kita
      dapat mencoba melakukan reset Android Studio kita.
    - Harapannya adalah, kita bisa membuka Android Studio seperti ketika pertama kali kita menginstall
      Android Studio.
    - Melakukan Reset Android Studio dapat dilakukan dengan menghapus emulator dan membuat ulang
      emulatornya, atau pun menghapus dan menginstall ulang SDK Tools ataupun melakukan Invalidate
      caches di menu File.
 */
package com.practice.resetandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}