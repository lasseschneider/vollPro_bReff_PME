package com.example.lasse.vollpro_breff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    Button bLogout;
    EditText etName, etAge, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.etName);
        etAge = (EditText)findViewById(R.id.etAge);
        etUsername = (EditText)findViewById(R.id.etUsername);
        bLogout = (Button) findViewById(R.id.bRegister);

        bLogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogout:

                startActivity(new Intent(this, MainActivity.class));

                break;
            case R.id.bRegister:

                startActivity(new Intent(this, Register.class));

                break;
        }
    }
}
