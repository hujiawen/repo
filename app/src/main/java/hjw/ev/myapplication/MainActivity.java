package hjw.ev.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.zxing.MultiFormatReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiFormatReader multiFormatReader = new MultiFormatReader();
    }
}