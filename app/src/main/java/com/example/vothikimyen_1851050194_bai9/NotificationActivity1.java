package com.example.vothikimyen_1851050194_bai9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NotificationActivity1 extends AppCompatActivity {
    TextView tvnati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notification1 );
        tvnati = findViewById( R.id.tv_nano );
        String message = getIntent().getStringExtra( "message" );
        tvnati.setText( message );
    }
}