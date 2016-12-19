package com.example.ribgoamaw.mvparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        Button maps = (Button) findViewById(R.id.button);
        maps.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(SetupActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        }) ;

        Button setup = (Button) findViewById(R.id.button11);
        setup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(SetupActivity.this, ReservationActivity.class);
                startActivity(intent);
            }
        }) ;
    }
}
