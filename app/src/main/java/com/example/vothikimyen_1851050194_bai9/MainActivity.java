package com.example.vothikimyen_1851050194_bai9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btNoti1, btNoti2, btNoti3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        anhXa();
        btNoti1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "You have a messsage !";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.ic_messgae)
                        .setContentTitle("Tin Nhan")
                        .setContentText(message)
                        .setAutoCancel(true);
                Intent intent = new Intent(MainActivity.this,NotificationActivity1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message",message);
                PendingIntent pendingIntent =  PendingIntent.getActivity(MainActivity.this, 0 , intent, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager  notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0,builder.build());


            }
        } );
    }

    private void anhXa() {
        btNoti1 = findViewById( R.id.noti1 );
        btNoti2 = findViewById( R.id.noti2 );
        btNoti3 = findViewById( R.id.noti3 );
    }
}