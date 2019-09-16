package com.arnaldo.app_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1;
    private Button btn_ocultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.imageView);
        btn_ocultar = (Button) findViewById(R.id.button);
    }

    public void Ocultar(View view){
        btn_ocultar.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }
}
