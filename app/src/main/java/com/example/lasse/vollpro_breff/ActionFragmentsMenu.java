package com.example.lasse.vollpro_breff;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * Created by Lasse on 05.07.2016.
 */
public class ActionFragmentsMenu extends Fragment {
    public ActionFragmentsMenu(){}

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.menu_fragments, menu);
    }
    @TargetApi(Build.VERSION_CODES.M)
    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        // Wir prüfen, ob Menü-Element mit der ID "action_daten_aktualisieren"
        // ausgewählt wurde und geben eine Meldung aus
        int id = item.getItemId();
        if (id == R.id.action_daten_aktualisieren) {
            Toast.makeText(getActivity(), "Aktualisieren gedrückt!", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(id == R.id.action_main){
            startActivity(new Intent(String.valueOf(MainActivity.class)));
            return true;
        }
        else if(id == R.id.action_tournaments){
            Intent i = new Intent(this.getContext(),Tournaments.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    }
