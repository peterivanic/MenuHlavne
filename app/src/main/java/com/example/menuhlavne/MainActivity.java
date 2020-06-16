package com.example.menuhlavne;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.oAppke:
                Toast.makeText(this,"Informacie o aplikacii ...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.web:
                Toast.makeText(this,"Nacitavam web ...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ukoncit:
                this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
