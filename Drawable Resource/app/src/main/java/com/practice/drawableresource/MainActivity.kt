/**
    Drawable Resource
    - Drawable Resource adalah jenis resource dengan konsep graphics yang bisa digambar pada layar.
    - Ada banyak jenis Drawable, seperti Bitmap File(file gambar), Nine Patch File, Layer List,
      State List, dll.
    - Untuk lebih jelasnya mengenai drawable resource dapat mengunjungi halaman web :
      'https://developer.android.com/guide/topics/resources/drawable-resource?hl=id'.
    - Drawable direpresentasikan dalam class Drawable, dan untuk mendapatkannya, kita dapat menggunakan
      function getDrawable(resourceId) pada class Resources.
    - Untuk lebih jelasnya mengenai class Drawable dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/graphics/drawable/Drawable'.
    - Salah satu komponen yang dapat digunakan untuk menampilkan resource Bitmap File (jpg, png, dll)
      adalah ImageView.
    - Dapat juga pada source code mengambil resources drawable dengan menambahkan code :
        'resources.getDrawable(R.drawable.test, theme)'

 */
package com.practice.drawableresource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        // Mengambil resources drawable yaitu test.jpg
        resources.getDrawable(R.drawable.test, theme)
    }
}