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

public class Tournaments extends BaseActivity {

        GridView gridView;

        static final String[]Turniere = new String[]{
            "Münster", "Supercup", "April",
            "Hamburg", "Supercup", "Mai",
            "Dresden", "Cup", "Juni",
            "Jena", "Cup", "Juni",
            "Duisburg", "Cup", "Juni",
            "Binz", "Supercup", "Juli",
            "StPeter", "Cup", "Juli",
            "Kuehlungsborn", "Supercup", "August",
            "Timmendorf", "DM", "September"
    };

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_tournaments);

            gridView = (GridView) findViewById(R.id.gvTournament);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, Turniere);

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



