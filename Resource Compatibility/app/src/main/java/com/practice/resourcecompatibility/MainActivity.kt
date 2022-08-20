/**
    Resource Compatibility
    - Pada Localization, resource itu dapat mendukung multi bahasa.
    - Pada Android, resoruce juga mendukung multi compatibility.
    - Misal, ketika kita membuat gambar dengan ukuran 100px, gambar ini akan terlihat bagus pada
      perangkat dengan density rendah, tapi ketika menggunakan perangkat dengan density tinggi,
      maka gambar itu ada kemungkinan akan pecah.
    - Oleh karena itu, kadang kita perlu mendukung beberapa jenis resource tergantung dari perangkat
      yang ingin kita dukung.
    - Pada saat membuat resource baru maka dapat menentukan Resource Compatibility-nya sesuai dengan
      keperluan misal : misal orientation, night mode, size, density, dll.
 */
package com.practice.resourcecompatibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)
    }
}