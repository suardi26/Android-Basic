/**
    Screen Compatibility
    - Android berjalan di perangkat dengan berbagai ukuran layar, dari smartphone, tablet sampai
      ke smart TV.
    - Untuk mengkategorisasikan perangkat berdasarkan ukuran layar, Android mendefenisikan dalam
      2 karakteristik, screen size (Ukuran layar) dan screen density (kepadatan pixel layar, atau
      DPI).
    - Untuk mempermudah dan menggeneralisasi semua varian ini, Android membagi menjadi beberapa
      grup.
    - Screen size : small, normal, large dan xlarge.
    - Screen density : mdpi (medium), hdpi (high), xhdpi (extra high), xxhdpi (extra-extra high)
      dan others.
    - Secara default, aplikasi kita akan kompatibel dengan semua screen size dan density, karena
      Android akan melakukan penyesuaian layout UI dan gambar untuk tiap perangkat layar.
    - Namun untuk pengalaman yang lebih baik, ada baiknya kita menggunakan resource yang sesuai
      dengan tiap jenis layar.

    Pixel Densities
    - Pada saat kita akan mendukung perangkat yang kepadatan pixel-nya berbeda-beda, maka agak
      menyulitkan ketika kita ingin membuat komponen yang ukurannya fix, misal menggunakan pixel.
    - Contoh jika kita menggunakan komponen dengan ukuran 100px, maka akan terlihat besar di layar
      yang density-nya kecil, tapi akan terlihat kecil jika diukuran layar yang density-nya besar.
    - Oleh karena itu, di Android, kita jarang menggunakan ukuran px, melainkan ukuran
      dp (density-independent pixels).
    - Ukuran dp dapat secara otomatis membesar sesuai dengan screen density.
    - Jika kita ingin menghitung berapa pixel dari dp, maka kita dapat menggunakan rumus :
        px = dp * (dpi/160).
    - Untuk lebih jelasnya mengenai Screen Densities dapat mengunjungi halaman web :
      'https://developer.android.com/training/multiscreen/screendensities'

        Density Qualifier       Description
        - ldpi                  Resources for low-density (ldpi) screens (~120dpi).
        - mdpi                  Resources for medium-density (mdpi) screens (~160dpi).
                                (This is the baseline density).
        - hdpi                  Resources for high-density (hdpi) screens (~240dpi).
        - xhdpi                 Resources for extra-high-density (xhdpi) screens (~320dpi).
        - xxhdpi                Resources for extra-extra-high-density (xxhdpi) screens (~480dpi).
        - xxxhdpi               Resources for extra-extra-extra-high-density (xxxhdpi) screens (~640dpi).
 */

package com.practice.screencompatibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}