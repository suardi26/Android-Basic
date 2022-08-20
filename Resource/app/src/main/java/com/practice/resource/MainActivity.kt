/**
    - Resource adalah file tambahan atau konten statis yang biasanya digunakan pada kode program kita.
    - Seperti text, gambar, layout, animasi, dan lain-lain.
    - Android sendiri mendukung banyak sekali resource.
    - Untuk mengambil data resource-nya, kita dapat menggunakan class Resources.
    - Untuk lebih jelasnya silahkan kunjungi halaman web :
      'https://developer.andorid.com/reference/android/content/res/Resources'
    Jenis-jenis Resource
        Resource Directory      Keterangan
        - animator              XML file definisi property animations
        - anim                  XML file definisi tween animations
        - color                 XML file definisi warna
        - drawable              Bitmap files (png, jpg, gif) atau XML file drawable resource.
        - mipmap                Drawable file untuk icon launcher.
        - layout                XML file definisi layout user interface.
        - menu                  XML file definisi app menu.
        - raw                   File yang utuh lainnya.
        - values                XML file yang berisi value seperti String, integer dll.
        - xml                   XML file yang dapat dibaca menggunakan Resources.getXML()
        - font                  Font files.
        - dll.
    Resources pada Activity
    - Class Resources secara otomatis akan dibuatkan di dalam Android Context, dimana Activity adalah
      turunan dari Android Context.
    - Untuk mendapatkan object Resources, kita dapat langsung menggunakan function getResources(),
      atau jika menggunakan Kotlin, kita bisa langsung panggil property resources.

    Mengakses Resource
    - Setiap membuat Resource, secara otomatis resource tersebut akan memiliki id yang secara otomatis
      ditambahkan ke class R
    - Dengan demikian, untuk mengakses resource id-nya pada kode program kita, kita dapat langsung
      menggunakan class R
    - Namun resource juga dapat dipanggil dari resource lainnya, pada kasus ini, kita dapat menggunakan
      id resource diawali @ dan jenis resource, lalu diikuti dengan id resource, misalnya @string/id_string
    - Contohnya pada layout, ketika kita membuat text pada button, kita ingin mengisi text-nya dari
      resource string misalnya.
    - Untuk value resource seharusnya ditambahkan pada directory resource bukan pada source code nya,
      seperti data String yang ditampilkan di UI, idealnya data-data tersebut disimpan didalam
      directory resource bukan pada source code.

    Value Resource
    - values resource merupakan jenis resource yang biasanya digunakan untuk menyimpan data-data
      statis yang digunakan pada kode program kita misal String, Integer, bolean , color dll.

        - String Resource
          - String merupakan resource yang berisi teks.
          - Rekomendasinya ketika kita membuat tulisan untuk kita tampilkan pada halaman UI aplikasi
            Android, disarankan jangan melakukan hardcode pada kode program, lebih baik menggunakan
            String resource.
          - Hal ini karena jika kita ingin mengubah text-nya, tidak perlu mengubah kode program, selain
            itu data text-nya dapat digunakan ulang pada halaman UI berbeda.
          - Formatting String
            - Kadang saat menggunakan String resource, kita butuh membuat String yang datanya dinamis
              dan memiliki parameter, contoh pada kasus menuliskan 'Hello $name'.
            - Artinya $name tersebut dapat berubah-ubah.
            - String Resource mendukung hal tersebut, kita dapat menggunakan formatting String pada
              String resource, caranya cukup gunakan format '%index$s' untuk parameter String, atau
              %index$d untuk angka desimal/angka. Dan parameternya boleh lebih dari satu.
                contoh :    - "Hello %1$s"
                            - "Hello %2$d"
                            - "Hello %1$s %2$s"
          - String Array Resource
            - values resource juga dapat kita tambahkan tipe resource berupa String Array
            - Kita dapat menggunakan tag<string-array> untuk menambahkan tipe String Array Resource.
            - Dan di dalamnya untuk menambahkan tiap datanya, kita dapat menggunakan tag<item>
            - String Array Resource secara otomatis akan terdapat pada property array pada class R.
            - Untuk mengambil String Array Resource, kita dapat menggunakan function getStringArray(resourceld)
            - Pada String Array tidak terdapat paremeter Formatting String.

        - Value Resource Lainnya.
            - Selain String Resource dan String Array Resource, di dalam Value Resource, kita dapat
              menambahkan banyak jenis Resource lainnya.
            - Misalnya Integer, Integer Array, Boolean, Color, dll.
            - Untuk lebih jelasnya silahkan kunjungi halaman web
              'https://developer.android.com/guide/topics/resources/more-resources?hl=id'.
 */
package com.practice.resource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        // Memanggil function initComponents
        initComponents()


        sayHelloButton.setOnClickListener(){
            val name: String = nameEditText.text.toString()
            val halo = " See You Next Step !!!"

            // memanggil String resource dengan parameter format String.
            // data yang dimasukan sebagai argument boleh lebih dari satu
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name, halo)

            // Mengambil value String Array Resource
            resources.getStringArray(R.array.names).forEach { value ->
                Log.i("StringArray", value)
            }


            // Mengambil data dari resources yang dibuat pada file other.xml dan di keluarkan
            // pada log.
            Log.i("valueResoruce", resources.getBoolean(R.bool.isProductionMode).toString())
            Log.i("valueResource", resources.getInteger(R.integer.maxPage).toString())
            Log.i("valueResource", resources.getIntArray(R.array.numbers).joinToString( "," ))
            Log.i("valueResource", resources.getColor(R.color.red, theme).toString())

            // Mengubah button dengan warna dari color resoruces 'red'.
            sayHelloButton.setBackgroundColor(resources.getColor(R.color.red, theme))
        }
    }
}