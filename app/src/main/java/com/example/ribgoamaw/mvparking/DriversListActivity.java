package com.example.ribgoamaw.mvparking;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class DriversListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_list);

        Button news = (Button) findViewById(R.id.button10);
        news.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(DriversListActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        }) ;

        String[] drivers = {"John Lewis", "Michael Decluit", "Babatunde James", "Silvia Perrez", "Ribgoama Bolden"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, drivers);
        getListView().setAdapter(adapter);
    }
}
