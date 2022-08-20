/**
    Layout Resource
    - Layout resource adalah definisi dari tampilan untuk UI.
    - Di dalam layout, kita dapat mendefinisikan isi View atau ViewGroup.
    - View adalah single komponen, sedangkan ViewGroup adalah container atau wadah untuk satu atau lebih
      komponen View.
    - Contoh ViewGroup seperti LinearLayout, RelativeLayout, FrameLayout, dll.
    - Layout juga dapat menambahkan layout lain, dengan menggunakan tag <include>.
    - Setiap layout harus memiliki satu root element, jika misal kita tidak ingin memiliki root
      element, misal untuk digunakan sebagai include di layout lain, kita dapat gunakan root tag <merge>.
 */
package com.practice.layoutresource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)
    }
}