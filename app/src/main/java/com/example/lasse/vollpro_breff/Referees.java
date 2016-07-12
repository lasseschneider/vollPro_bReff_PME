package com.example.lasse.vollpro_breff;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Referees extends BaseActivity {

    GridView gridView;

    static final String[]Schiedsrichter = new String[]{
            "Vorname","Lizenz","SRseit",
            "Hans", "A", "2010",
            "Jürgen", "C", "2013",
            "Karl", "B", "2000",
            "Laus", "I", "2012",
            "Lenz", "C", "2011",
            "Kevin", "I", "2015"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_referees);

        gridView = (GridView) findViewById(R.id.activity_referees);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Schiedsrichter);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}



