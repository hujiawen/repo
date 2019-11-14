package hjw.ev.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.google.zxing.MultiFormatReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val multiFormatReader = MultiFormatReader()
    }
}
