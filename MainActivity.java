package com.example.misonido;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
MediaPlayer sonidoM;
Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonidoM = MediaPlayer.create(this,R.raw.sonido);
        boton1= (Button) findViewById(R.id.boton);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoM.start();
            }
        });

    }
}
