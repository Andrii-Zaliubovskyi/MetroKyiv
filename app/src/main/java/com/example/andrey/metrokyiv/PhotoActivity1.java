package com.example.andrey.metrokyiv;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class PhotoActivity1 extends Activity {
String myStation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_activity1);
        ImageView imageVievw = (ImageView) findViewById(R.id.imageView);
        myStation = getIntent().getStringExtra("station");

        switch (myStation){

            case "Akademmistechko":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.akademmistechko));
                break;
            case "Zhytomyrska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.zhytomyrska));
                break;
            case "Sviatoshyn":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.svyatoshyn));
                break;
            case "Nyvky":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.nyvky));
                break;
            case "Beresteiska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.beresteyska));
                break;
            case "Shuliavska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.shulyavska));
                break;
            case "Politekhnichnyi Instytut":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.politekhnichnyi_instytut));
                break;
            case "Vokzalna":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.vokzalna));
                break;
            case "Universytet":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.universytet));
                break;
            case "Teatralna":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.teatralna));
                break;
            case "Khreshchatyk":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.khreschatyk));
                break;
            case "Arsenalna":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.arsenalna));
                break;
            case "Dnipro":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.dnipro));
                break;
            case "Hydropark":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.hidropark));
                break;
            case "Livoberezhna":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.livoberezhna));
                break;
            case "Darnytsia":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.darnytsia));
                break;
            case "Chernihivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.chernihivska));
                break;
            case "Lisova":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.lisova));
                break;


            case "Heroiv Dnipra":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.heroiv_dnipra));
                break;
            case "Minska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.minska));
                break;
            case "Obolon":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.obolon));
                break;
            case "Petrivka":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.petrivka));
                break;
            case "Tarasa Shevchenka":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.tarasa_shevchenka));
                break;
            case "Kontraktova Ploshcha":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.kontraktova_ploscha));
                break;
            case "Poshtova Ploshcha":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.poshtova_ploscha));
                break;
            case "Maidan Nezalezhnosti":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.maydan_nezalezhnosti));
                break;
            case "Ploshcha Lva Tolstoho":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.kontraktova_ploscha));
                break;
            case "Olimpiiska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.respublikanskyi_stadion));
                break;
            case "Palats Ukrayina":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.palats_ukrayina));
                break;
            case "Lybidska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.lybidska));
                break;
            case "Demiivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.demiivska));
                break;
            case "Holosiivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.holosiivska));
                break;
            case "Vasylkivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.vasylkivska));
                break;
            case "Vystavkovyi Tsentr":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.vystav_tsentr));
                break;
           case "Ipodrom":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.ipodrom));
                break;
            case "Teremky":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.teremky));
                break;


            case "Syrets":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.syrets));
                break;
            case "Dorohozhychi":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.dorogozhychi));
                break;
            case "Lukianivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.lukianovska));
                break;
            case "Zoloti Vorota":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.zoloti_vorota));
                break;
            case "Palats Sportu":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.palats_sportu));
                break;
            case "Klovska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.klovska));
                break;
            case "Pecherska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.pecherska));
                break;
            case "Druzhby Narodiv":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.druzhby_narodiv));
                break;
            case "Vydubychi":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.vydubychi));
                break;
            case "Slavutych":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.slavutych));
                break;
            case "Osokorky":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.osokorky));
                break;
            case "Pozniaky":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.pozniaky));
                break;
            case "Kharkivska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.kharkivska));
                break;
            case "Vyrlytsia":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.vyrlytsia));
                break;
            case "Boryspilska":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.boryspilska));
                break;
            case "Chervony Khutir":
                imageVievw.setImageDrawable(getResources().getDrawable(R.drawable.chervonyi_khutir));
                break;

            default:
                break;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_photo_activity1, menu);
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
}
