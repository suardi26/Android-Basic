/**
    Context
    - Dalam Android, terdapat juga object bernama Context, Context berisi global informasi tentang
      environment aplikasi. Context merupakan Abstract Class yang implementasinya sudah dilakukan
      oleh Android.
    - Contex memungkinkan kita mengakses resource, membuka activity, menerima intent, bradcasting,
      dll.
    - Untuk lebih jelasnya mengenai class Contex dapat mengunjungi halaman web :
      'https://developer.android.com/reference/android/content/Context'.

    Jenis Context
    - Pada Android, terdapat 2 jenis Context, yaitu Application Context dan Activity Context.
    - Application Context merupakan context yang tersedia di aplikasi Android, dan hanya dibuat sekali,
      alias singleton.
    - Application Context dapat diakses dengan function getApplicationContext().
    - Activity Context Merupakan context tersedia di Activity. Misal jika kita punya MainActivity,
      maka akan ada Activity Context untuk MainActivity itu.
    - Activity Context dapat diakses langsung dengan Activity-nya, karena Activity adalah turunan dari
      Context.

    Kapan menggunakan Context
    - Application Context digunakan jika kita ingin membuat object yang singleton yang membutuhkan
      Context.
    - Activity Context digunakan jika kita ingin membuat object yang hanya digunakan di Activity
      tersebut.
    - Jangan menggunakan Activity Context untuk object yang singleton, karena nanti otomatis
      referensi ke Activity tersebut akan selalu ada, dan otomatis object activity tidak dapat
      dihapus di memory Android, hal ini dapat menyebabkan memory leak.
    - Activity context ketika tidak digunakan lagi dapat di hapus dari memory, berbeda dengan
      Application context yang tidak dapat dihapus dari memory hingga aplikasinya di matikan.
 */
package com.practice.context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)
    }
}