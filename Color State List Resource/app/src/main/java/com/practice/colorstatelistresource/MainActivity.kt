/**
    Color State List Resource
    - Color State List Resource merupakan object yang dapat kita buat dalam XML yang merupakan representasi
      Color (Warna), tapi tidak satu Color, melainkan bisa beberapa Color tergantung state dari View-nya.
    - Color State List Resource di representasikan dalam class ColorStateList.
    - untuk lebih jelasnya mengenai class ColorStateList dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/content/res/ColorStateList'
    - Color State List Resource juga dapat menggunakan Color Resource yang sudah kita buat di Values
      Resource dengan menggunakan @color/nameResource
    - untuk lebih jelasnya mengenai Color List Resource dapat mengunjungi halaman web :
      'https://developer.android.com/guide/topics/resources/color-list-resource?hl=id'
    - Color State List Resource dapat digunakan pada componen seperti button dll
 */
package com.practice.colorstatelistresource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)
    }
}