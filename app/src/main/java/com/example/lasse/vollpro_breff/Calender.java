package com.example.lasse.vollpro_breff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calender extends BaseActivity {
    CalendarView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        cv = (CalendarView) findViewById(R.id.cvCalender);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView calView, int year, int month, int dayOfMonth){
                month = month+1;
                Toast.makeText(getApplicationContext(),dayOfMonth + "/"+month+"/"+year,Toast.LENGTH_LONG).show();
            }
        });

    }
}
