package com.example.andrey.metrokyiv;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnMap;
    Button btnRoute;
    Button btnScheme;
    Button btnPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // найдем View-элементы
        btnMap = (Button) findViewById(R.id.btnMap);
        btnRoute = (Button) findViewById(R.id.btnRoute);
        btnScheme = (Button) findViewById(R.id.btnSchem);
        btnPhoto = (Button) findViewById(R.id.btnPhoto);

        // присваиваем обработчик кнопкам
        btnMap.setOnClickListener(this);
        btnRoute.setOnClickListener(this);
        btnScheme.setOnClickListener(this);
        btnPhoto.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // по id определеяем кнопку, вызвавшую этот обработчик
        switch (v.getId()){
            case R.id.btnMap:
                Intent intentMap = new Intent(this, MapActivity.class);
                startActivity(intentMap);
                break;
            case R.id.btnRoute:
                Intent intentRoute = new Intent(this, RouteActivity.class);
                startActivity(intentRoute);
                break;
            case R.id.btnSchem:
                Intent intentScheme = new Intent(this, SchemeActivity.class);
                startActivity(intentScheme);
                break;
            case R.id.btnPhoto:
                Intent intentPhoto = new Intent(this, PhotoActivity.class);
                startActivity(intentPhoto);

                break;
            default:
                break;
        }
    }
}
