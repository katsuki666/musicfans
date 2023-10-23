package com.example.musicfans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View

class screen3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

    }
    fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    fun openLink1(view: View) {
        val url = "https://www.youtube.com/watch?v=X6o7RtOHpVc&list=RDGMEMJQXQAmqrnmK1SEjY_rKBGA&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink2(view: View) {
        val url = "https://www.youtube.com/watch?v=58u-zkDLNPg&list=RDQMr5sEb9gR39k&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink3(view: View) {
        val url = "https://www.youtube.com/watch?v=_o4gGupXxVE&list=RDGMEMQ1dJ7wXfLlqCjwV0xfSNbA&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink4(view: View) {
        val url = "hhttps://www.youtube.com/watch?v=94bGzWyHbu0&list=PLOUzUrKhNae6JqXAjG56Akc79vuzYCOYz" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink5(view: View) {
        val url = "https://www.youtube.com/watch?v=Hbj3z8Db4Rk&list=RDGMEMR48zJN_YMORCOLhrAwXwKw&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink6(view: View) {
        val url = "https://www.youtube.com/watch?v=2ips2mM7Zqw&list=RDQMs46arWPPnGk&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
    fun openLink7(view: View) {
        val url = "https://www.youtube.com/watch?v=EH65CnUakgg&list=RDQMLlGEgsHjWms&start_radio=1" // Reemplaza con tu primer enlace
        openLink(url)
    }
}