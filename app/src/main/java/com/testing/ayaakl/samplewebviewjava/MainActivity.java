package com.testing.ayaakl.samplewebviewjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import android.content.Intent;
//import android.net.Uri;
//import android.support.v7.app.ActionBarActivity;
//import android.os.Bundle;
//
//import android.view.Menu;
//import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //b1 = findViewById(R.id.button);

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //startActivity(new Intent(MainActivity.this, WebViewActivity.class));
//                    Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
//                    startActivity(intent);
//                //
//
//            }
//        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this,"Web view is being opened now",Toast.LENGTH_LONG).show();
    }
}
