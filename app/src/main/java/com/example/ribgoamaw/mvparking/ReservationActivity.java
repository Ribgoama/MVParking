package com.example.ribgoamaw.mvparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        Button mapes = (Button) findViewById(R.id.button10);
        mapes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservationActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        Button mapps = (Button) findViewById(R.id.button12);
        mapps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservationActivity.this, DriversListActivity.class);
                startActivity(intent);
            }
        });

        Button result = (Button) findViewById(R.id.button13);
        result.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservationActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        Button reject = (Button) findViewById(R.id.button14);
        result.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservationActivity.this, RejectActivity.class);
                startActivity(intent);
            }
        });


    }
}
