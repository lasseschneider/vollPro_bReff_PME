package com.example.lasse.vollpro_breff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Lasse on 05.07.2016.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_fragments, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if( item.getItemId() == R.id.action_daten_aktualisieren){

            Toast.makeText(this, "Aktualisieren gedrückt!", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(id == R.id.action_main){
            startActivity(new Intent(String.valueOf(MainActivity.class)));
            return true;
        }
        else if(id == R.id.action_tournaments){
            startActivity(new Intent(this,Tournaments.class));
            return true;
        }
        else if(id == R.id.action_calender){
            startActivity(new Intent(this,Calender.class));
        }
        else if(id == R.id.action_referees){
            startActivity(new Intent(this,Referees.class));

        }

            return super.onOptionsItemSelected(item);

    }
}
