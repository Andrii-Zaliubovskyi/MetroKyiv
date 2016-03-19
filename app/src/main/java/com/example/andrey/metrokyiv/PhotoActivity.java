package com.example.andrey.metrokyiv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;


public class PhotoActivity extends Activity implements View.OnClickListener {
    Button btn_Akademmistechko;
    Button btn_Zhytomyrska;
    Button btn_Sviatoshyn;
    Button btn_Nyvky;
    Button btn_Beresteiska;
    Button btn_Shuliavska;
    Button btn_Politekhnichnyi_Instytut;
    Button btn_Vokzalna;
    Button btn_Universytet;
    Button btn_Teatralna;
    Button btn_Khreshchatyk;
    Button btn_Arsenalna;
    Button btn_Dnipro;
    Button btn_Hydropark;
    Button btn_Livoberezhna;
    Button btn_Darnytsia;
    Button btn_Chernihivska;
    Button btn_Lisova;

    Button btn_Heroiv_Dnipra;
    Button btn_Minska;
    Button btn_Obolon;
    Button btn_Petrivka;
    Button btn_Tarasa_Shevchenka;
    Button btn_Kontraktova_Ploshcha;
    Button btn_Poshtova_Ploshcha;
    Button btn_Maidan_Nezalezhnosti;
    Button btn_Ploshcha_Lva_Tolstoho;
    Button btn_Olimpiiska;
    Button btn_Palats_Ukrayina;
    Button btn_Lybidska;
    Button btn_Demiivska;
    Button btn_Holosiivska;
    Button btn_Vasylkivska;
    Button btn_Vystavkovyi_Tsentr;
    Button btn_Ipodrom;
    Button btn_Teremky;

    Button btn_Syrets;
    Button btn_Dorohozhychi;
    Button btn_Lukianivska;
    Button btn_Zoloti_Vorota;
    Button btn_Palats_Sportu;
    Button btn_Klovska;
    Button btn_Pecherska;
    Button btn_Druzhby_Narodiv;
    Button btn_Vydubychi;
    Button btn_Slavutych;
    Button btn_Osokorky;
    Button btn_Pozniaky;
    Button btn_Kharkivska;
    Button btn_Vyrlytsia;
    Button btn_Boryspilska;
    Button btn_Chervony_Khutir;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("line1");
        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("Line 1");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("line2");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("Line 2");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("line3");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("Line 3");
        tabHost.addTab(tabSpec);

        btn_Akademmistechko = (Button) findViewById(R.id.btn_Akademmistechko);
        btn_Zhytomyrska = (Button) findViewById(R.id.btn_Zhytomyrska);
        btn_Sviatoshyn = (Button) findViewById(R.id.btn_Sviatoshyn);
        btn_Nyvky = (Button) findViewById(R.id.btn_Nyvky);
        btn_Beresteiska = (Button) findViewById(R.id.btn_Beresteiska);
        btn_Shuliavska = (Button) findViewById(R.id. btn_Shuliavska);
        btn_Politekhnichnyi_Instytut = (Button) findViewById(R.id.btn_Politekhnichnyi_Instytut);
        btn_Vokzalna = (Button) findViewById(R.id.btn_Vokzalna);
        btn_Universytet = (Button) findViewById(R.id.btn_Universytet);
        btn_Teatralna = (Button) findViewById(R.id.btn_Teatralna);
        btn_Khreshchatyk = (Button) findViewById(R.id.btn_Khreshchatyk);
        btn_Arsenalna = (Button) findViewById(R.id.btn_Arsenalna);
        btn_Dnipro =  (Button) findViewById(R.id.btn_Dnipro);
        btn_Hydropark =  (Button) findViewById(R.id.btn_Hydropark);
        btn_Livoberezhna = (Button) findViewById(R.id.btn_Livoberezhna);
        btn_Darnytsia = (Button) findViewById(R.id.btn_Darnytsia);
        btn_Chernihivska = (Button) findViewById(R.id.btn_Chernihivska);
        btn_Lisova = (Button) findViewById(R.id.btn_Lisova);

        btn_Heroiv_Dnipra = (Button) findViewById(R.id.btn_Heroiv_Dnipra);
        btn_Minska = (Button) findViewById(R.id.btn_Minska);
        btn_Obolon = (Button) findViewById(R.id.btn_Obolon);
        btn_Petrivka = (Button) findViewById(R.id.btn_Petrivka);
        btn_Tarasa_Shevchenka = (Button) findViewById(R.id.btn_Tarasa_Shevchenka);
        btn_Kontraktova_Ploshcha = (Button) findViewById(R.id.btn_Kontraktova_Ploshcha);
        btn_Poshtova_Ploshcha = (Button) findViewById(R.id.btn_Poshtova_Ploshcha);
        btn_Maidan_Nezalezhnosti = (Button) findViewById(R.id.btn_Maidan_Nezalezhnosti);
        btn_Ploshcha_Lva_Tolstoho = (Button) findViewById(R.id.btn_Ploshcha_Lva_Tolstoho);
        btn_Olimpiiska = (Button) findViewById(R.id.btn_Olimpiiska);
        btn_Palats_Ukrayina = (Button) findViewById(R.id.btn_Palats_Ukrayina);
        btn_Lybidska = (Button) findViewById(R.id.btn_Lybidska);
        btn_Demiivska = (Button) findViewById(R.id.btn_Demiivska);
        btn_Holosiivska = (Button) findViewById(R.id.btn_Holosiivska);
        btn_Vasylkivska = (Button) findViewById(R.id.btn_Vasylkivska);
        btn_Vystavkovyi_Tsentr = (Button) findViewById(R.id.btn_Vystavkovyi_Tsentr);
        btn_Ipodrom = (Button) findViewById(R.id.btn_Ipodrom);
        btn_Teremky = (Button) findViewById(R.id.btn_Teremky);

        btn_Syrets = (Button) findViewById(R.id.btn_Syrets);
        btn_Dorohozhychi = (Button) findViewById(R.id.btn_Dorohozhychi);
        btn_Lukianivska = (Button) findViewById(R.id.btn_Lukianivska);
        btn_Zoloti_Vorota = (Button) findViewById(R.id.btn_Zoloti_Vorota);
        btn_Palats_Sportu = (Button) findViewById(R.id.btn_Palats_Sportu);
        btn_Klovska = (Button) findViewById(R.id.btn_Klovska);
        btn_Pecherska = (Button) findViewById(R.id.btn_Pecherska);
        btn_Druzhby_Narodiv = (Button) findViewById(R.id.btn_Druzhby_Narodiv);
        btn_Vydubychi = (Button) findViewById(R.id.btn_Vydubychi);
        btn_Slavutych = (Button) findViewById(R.id.btn_Slavutych);
        btn_Osokorky = (Button) findViewById(R.id.btn_Osokorky);
        btn_Pozniaky = (Button) findViewById(R.id.btn_Pozniaky);
        btn_Kharkivska = (Button) findViewById(R.id.btn_Kharkivska);
        btn_Vyrlytsia = (Button) findViewById(R.id.btn_Vyrlytsia);
        btn_Boryspilska = (Button) findViewById(R.id.btn_Boryspilska);
        btn_Chervony_Khutir = (Button) findViewById(R.id.btn_Chervony_Khutir);


        btn_Akademmistechko.setOnClickListener(this);
        btn_Zhytomyrska.setOnClickListener(this);
        btn_Sviatoshyn.setOnClickListener(this);
        btn_Nyvky.setOnClickListener(this);
        btn_Beresteiska.setOnClickListener(this);
        btn_Shuliavska.setOnClickListener(this);
        btn_Politekhnichnyi_Instytut.setOnClickListener(this);
        btn_Vokzalna.setOnClickListener(this);
        btn_Universytet.setOnClickListener(this);
        btn_Teatralna.setOnClickListener(this);
        btn_Khreshchatyk.setOnClickListener(this);
        btn_Arsenalna.setOnClickListener(this);
        btn_Dnipro.setOnClickListener(this);
        btn_Hydropark.setOnClickListener(this);
        btn_Livoberezhna.setOnClickListener(this);
        btn_Darnytsia.setOnClickListener(this);
        btn_Chernihivska.setOnClickListener(this);
        btn_Lisova.setOnClickListener(this);

        btn_Heroiv_Dnipra.setOnClickListener(this);
        btn_Minska.setOnClickListener(this);
        btn_Obolon.setOnClickListener(this);
        btn_Petrivka.setOnClickListener(this);
        btn_Tarasa_Shevchenka.setOnClickListener(this);
        btn_Kontraktova_Ploshcha.setOnClickListener(this);
        btn_Poshtova_Ploshcha.setOnClickListener(this);
        btn_Maidan_Nezalezhnosti.setOnClickListener(this);
        btn_Ploshcha_Lva_Tolstoho.setOnClickListener(this);
        btn_Olimpiiska.setOnClickListener(this);
        btn_Palats_Ukrayina.setOnClickListener(this);
        btn_Lybidska.setOnClickListener(this);
        btn_Demiivska.setOnClickListener(this);
        btn_Holosiivska.setOnClickListener(this);
        btn_Vasylkivska.setOnClickListener(this);
        btn_Vystavkovyi_Tsentr.setOnClickListener(this);
        btn_Ipodrom.setOnClickListener(this);
        btn_Teremky.setOnClickListener(this);

        btn_Syrets.setOnClickListener(this);
        btn_Dorohozhychi.setOnClickListener(this);
        btn_Lukianivska.setOnClickListener(this);
        btn_Zoloti_Vorota.setOnClickListener(this);
        btn_Palats_Sportu.setOnClickListener(this);
        btn_Klovska.setOnClickListener(this);
        btn_Pecherska.setOnClickListener(this);
        btn_Druzhby_Narodiv.setOnClickListener(this);
        btn_Vydubychi.setOnClickListener(this);
        btn_Slavutych.setOnClickListener(this);
        btn_Osokorky.setOnClickListener(this);
        btn_Pozniaky.setOnClickListener(this);
        btn_Kharkivska.setOnClickListener(this);
        btn_Vyrlytsia.setOnClickListener(this);
        btn_Boryspilska.setOnClickListener(this);
        btn_Chervony_Khutir.setOnClickListener(this);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_photo, menu);
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
        switch (v.getId()) {
            case R.id.btn_Akademmistechko:
                Intent intentAkademmistechko = new Intent(this, PhotoActivity1.class);
                intentAkademmistechko.putExtra("station", btn_Akademmistechko.getText().toString() );
                startActivity(intentAkademmistechko);
                break;
            case R.id.btn_Zhytomyrska:
                Intent intentZhytomyrska = new Intent(this, PhotoActivity1.class);
                intentZhytomyrska.putExtra("station", btn_Zhytomyrska.getText().toString() );
                startActivity(intentZhytomyrska);
                break;
            case R.id.btn_Sviatoshyn:
                Intent intentSviatoshyn = new Intent(this, PhotoActivity1.class);
                intentSviatoshyn.putExtra("station", btn_Sviatoshyn.getText().toString() );
                startActivity(intentSviatoshyn);
                break;
            case R.id.btn_Nyvky:
                Intent intentNyvky = new Intent(this, PhotoActivity1.class);
                intentNyvky.putExtra("station", btn_Nyvky.getText().toString() );
                startActivity(intentNyvky);
                break;
            case R.id.btn_Beresteiska:
                Intent intentBeresteiska = new Intent(this, PhotoActivity1.class);
                intentBeresteiska.putExtra("station", btn_Beresteiska.getText().toString() );
                startActivity(intentBeresteiska);
                break;
            case R.id.btn_Shuliavska:
                Intent intentShuliavska = new Intent(this, PhotoActivity1.class);
                intentShuliavska.putExtra("station", btn_Shuliavska.getText().toString() );
                startActivity(intentShuliavska);
                break;
            case R.id.btn_Politekhnichnyi_Instytut:
                Intent intentPolitekhnichnyi_Instytut = new Intent(this, PhotoActivity1.class);
                intentPolitekhnichnyi_Instytut.putExtra("station", btn_Politekhnichnyi_Instytut.getText().toString() );
                startActivity(intentPolitekhnichnyi_Instytut);
                break;
            case R.id.btn_Vokzalna:
                Intent intentVokzalna = new Intent(this, PhotoActivity1.class);
                intentVokzalna.putExtra("station", btn_Vokzalna.getText().toString() );
                startActivity(intentVokzalna);
                break;
            case R.id.btn_Universytet:
                Intent intentUniversytet = new Intent(this, PhotoActivity1.class);
                intentUniversytet.putExtra("station", btn_Universytet.getText().toString() );
                startActivity(intentUniversytet);
                break;
            case R.id.btn_Teatralna:
                Intent intentTeatralna = new Intent(this, PhotoActivity1.class);
                intentTeatralna.putExtra("station", btn_Teatralna.getText().toString() );
                startActivity(intentTeatralna);
                break;
            case R.id.btn_Khreshchatyk:
                Intent intentKhreshchatyk = new Intent(this, PhotoActivity1.class);
                intentKhreshchatyk.putExtra("station", btn_Khreshchatyk.getText().toString() );
                startActivity(intentKhreshchatyk);
                break;
            case R.id.btn_Arsenalna:
                Intent intentArsenalna = new Intent(this, PhotoActivity1.class);
                intentArsenalna.putExtra("station", btn_Arsenalna.getText().toString() );
                startActivity(intentArsenalna);
                break;
            case R.id.btn_Dnipro:
                Intent intentDnipro = new Intent(this, PhotoActivity1.class);
                intentDnipro.putExtra("station", btn_Dnipro.getText().toString() );
                startActivity(intentDnipro);
                break;
            case R.id.btn_Hydropark:
                Intent intentHydropark = new Intent(this, PhotoActivity1.class);
                intentHydropark.putExtra("station", btn_Hydropark.getText().toString() );
                startActivity(intentHydropark);
                break;
            case R.id.btn_Livoberezhna:
                Intent intentLivoberezhna = new Intent(this, PhotoActivity1.class);
                intentLivoberezhna.putExtra("station", btn_Livoberezhna.getText().toString() );
                startActivity(intentLivoberezhna);
                break;
            case R.id.btn_Darnytsia:
                Intent intentDarnytsia = new Intent(this, PhotoActivity1.class);
                intentDarnytsia.putExtra("station", btn_Darnytsia.getText().toString() );
                startActivity(intentDarnytsia);
                break;
            case R.id.btn_Chernihivska:
                Intent intentChernihivska = new Intent(this, PhotoActivity1.class);
                intentChernihivska.putExtra("station", btn_Chernihivska.getText().toString() );
                startActivity(intentChernihivska);
                break;
            case R.id.btn_Lisova:
                Intent intentLisova = new Intent(this, PhotoActivity1.class);
                intentLisova.putExtra("station", btn_Lisova.getText().toString() );
                startActivity(intentLisova);
                break;


            case R.id.btn_Heroiv_Dnipra:
                Intent intentHeroiv_Dnipra = new Intent(this, PhotoActivity1.class);
                intentHeroiv_Dnipra.putExtra("station", btn_Heroiv_Dnipra.getText().toString() );
                startActivity(intentHeroiv_Dnipra);
                break;
            case R.id.btn_Minska:
                Intent intentMinska = new Intent(this, PhotoActivity1.class);
                intentMinska.putExtra("station", btn_Minska.getText().toString() );
                startActivity(intentMinska);
                break;
            case R.id.btn_Obolon:
                Intent intentObolon = new Intent(this, PhotoActivity1.class);
                intentObolon.putExtra("station", btn_Obolon.getText().toString() );
                startActivity(intentObolon);
                break;
            case R.id.btn_Petrivka:
                Intent intentPetrivka = new Intent(this, PhotoActivity1.class);
                intentPetrivka.putExtra("station", btn_Petrivka.getText().toString() );
                startActivity(intentPetrivka);
                break;
            case R.id.btn_Tarasa_Shevchenka:
                Intent intentTarasa_Shevchenka = new Intent(this, PhotoActivity1.class);
                intentTarasa_Shevchenka.putExtra("station", btn_Tarasa_Shevchenka.getText().toString() );
                startActivity(intentTarasa_Shevchenka);
                break;
            case R.id.btn_Kontraktova_Ploshcha:
                Intent intentKontraktova_Ploshcha = new Intent(this, PhotoActivity1.class);
                intentKontraktova_Ploshcha.putExtra("station", btn_Kontraktova_Ploshcha.getText().toString() );
                startActivity(intentKontraktova_Ploshcha);
                break;
            case R.id.btn_Poshtova_Ploshcha:
                Intent intentPoshtova_Ploshcha = new Intent(this, PhotoActivity1.class);
                intentPoshtova_Ploshcha.putExtra("station", btn_Poshtova_Ploshcha.getText().toString() );
                startActivity(intentPoshtova_Ploshcha);
                break;
            case R.id.btn_Maidan_Nezalezhnosti:
                Intent intentMaidan_Nezalezhnosti = new Intent(this, PhotoActivity1.class);
                intentMaidan_Nezalezhnosti.putExtra("station", btn_Maidan_Nezalezhnosti.getText().toString() );
                startActivity(intentMaidan_Nezalezhnosti);
                break;
            case R.id.btn_Ploshcha_Lva_Tolstoho:
                Intent intentPloshcha_Lva_Tolstoho = new Intent(this, PhotoActivity1.class);
                intentPloshcha_Lva_Tolstoho.putExtra("station", btn_Ploshcha_Lva_Tolstoho.getText().toString() );
                startActivity(intentPloshcha_Lva_Tolstoho);
                break;
            case R.id.btn_Olimpiiska:
                Intent intentOlimpiiska = new Intent(this, PhotoActivity1.class);
                intentOlimpiiska.putExtra("station", btn_Olimpiiska.getText().toString() );
                startActivity(intentOlimpiiska);
                break;
            case R.id.btn_Palats_Ukrayina:
                Intent intentPalats_Ukrayina = new Intent(this, PhotoActivity1.class);
                intentPalats_Ukrayina.putExtra("station", btn_Palats_Ukrayina.getText().toString() );
                startActivity(intentPalats_Ukrayina);
                break;
            case R.id.btn_Lybidska:
                Intent intentLybidska = new Intent(this, PhotoActivity1.class);
                intentLybidska.putExtra("station", btn_Lybidska.getText().toString() );
                startActivity(intentLybidska);
                break;
            case R.id.btn_Demiivska:
                Intent intentDemiivska = new Intent(this, PhotoActivity1.class);
                intentDemiivska.putExtra("station", btn_Demiivska.getText().toString() );
                startActivity(intentDemiivska);
                break;
            case R.id.btn_Holosiivska:
                Intent intentHolosiivska = new Intent(this, PhotoActivity1.class);
                intentHolosiivska.putExtra("station", btn_Holosiivska.getText().toString() );
                startActivity(intentHolosiivska);
                break;
            case R.id.btn_Vasylkivska:
                Intent intentVasylkivska = new Intent(this, PhotoActivity1.class);
                intentVasylkivska.putExtra("station", btn_Vasylkivska.getText().toString() );
                startActivity(intentVasylkivska);
                break;
            case R.id.btn_Vystavkovyi_Tsentr:
                Intent intentVystavkovyi_Tsentr = new Intent(this, PhotoActivity1.class);
                intentVystavkovyi_Tsentr.putExtra("station", btn_Vystavkovyi_Tsentr.getText().toString() );
                startActivity(intentVystavkovyi_Tsentr);
                break;
            case R.id.btn_Ipodrom:
                Intent intentIpodrom = new Intent(this, PhotoActivity1.class);
                intentIpodrom.putExtra("station", btn_Ipodrom.getText().toString() );
                startActivity(intentIpodrom);
                break;
            case R.id.btn_Teremky:
                Intent intentTeremky = new Intent(this, PhotoActivity1.class);
                intentTeremky.putExtra("station", btn_Teremky.getText().toString() );
                startActivity(intentTeremky);
                break;


            case R.id.btn_Syrets:
                Intent intentSyrets = new Intent(this, PhotoActivity1.class);
                intentSyrets.putExtra("station", btn_Syrets.getText().toString() );
                startActivity(intentSyrets);
                break;
            case R.id.btn_Dorohozhychi:
                Intent intentDorohozhychi = new Intent(this, PhotoActivity1.class);
                intentDorohozhychi.putExtra("station", btn_Dorohozhychi.getText().toString() );
                startActivity(intentDorohozhychi);
                break;
            case R.id.btn_Lukianivska:
                Intent intentLukianivska = new Intent(this, PhotoActivity1.class);
                intentLukianivska.putExtra("station", btn_Lukianivska.getText().toString() );
                startActivity(intentLukianivska);
                break;
            case R.id.btn_Zoloti_Vorota:
                Intent intentZoloti_Vorota = new Intent(this, PhotoActivity1.class);
                intentZoloti_Vorota.putExtra("station", btn_Zoloti_Vorota.getText().toString() );
                startActivity(intentZoloti_Vorota);
                break;
            case R.id.btn_Palats_Sportu:
                Intent intentPalats_Sportu = new Intent(this, PhotoActivity1.class);
                intentPalats_Sportu.putExtra("station", btn_Palats_Sportu.getText().toString() );
                startActivity(intentPalats_Sportu);
                break;
            case R.id.btn_Klovska:
                Intent intentKlovska = new Intent(this, PhotoActivity1.class);
                intentKlovska.putExtra("station", btn_Klovska.getText().toString() );
                startActivity(intentKlovska);
                break;
            case R.id.btn_Pecherska:
                Intent intentPecherska = new Intent(this, PhotoActivity1.class);
                intentPecherska.putExtra("station", btn_Pecherska.getText().toString() );
                startActivity(intentPecherska);
                break;
            case R.id.btn_Druzhby_Narodiv:
                Intent intentDruzhby_Narodiv = new Intent(this, PhotoActivity1.class);
                intentDruzhby_Narodiv.putExtra("station", btn_Druzhby_Narodiv.getText().toString() );
                startActivity(intentDruzhby_Narodiv);
                break;
            case R.id.btn_Vydubychi:
                Intent intentVydubychi = new Intent(this, PhotoActivity1.class);
                intentVydubychi.putExtra("station", btn_Vydubychi.getText().toString() );
                startActivity(intentVydubychi);
                break;
            case R.id.btn_Slavutych:
                Intent intentSlavutych = new Intent(this, PhotoActivity1.class);
                intentSlavutych.putExtra("station", btn_Slavutych.getText().toString() );
                startActivity(intentSlavutych);
                break;
            case R.id.btn_Osokorky:
                Intent intentOsokorky = new Intent(this, PhotoActivity1.class);
                intentOsokorky.putExtra("station", btn_Osokorky.getText().toString() );
                startActivity(intentOsokorky);
                break;
            case R.id.btn_Pozniaky:
                Intent intenPozniaky = new Intent(this, PhotoActivity1.class);
                intenPozniaky.putExtra("station", btn_Pozniaky.getText().toString() );
                startActivity(intenPozniaky);
                break;
            case R.id.btn_Kharkivska:
                Intent intentKharkivska = new Intent(this, PhotoActivity1.class);
                intentKharkivska.putExtra("station", btn_Kharkivska.getText().toString() );
                startActivity(intentKharkivska);
                break;
            case R.id.btn_Vyrlytsia:
                Intent intentVyrlytsia = new Intent(this, PhotoActivity1.class);
                intentVyrlytsia.putExtra("station", btn_Vyrlytsia.getText().toString() );
                startActivity(intentVyrlytsia);
                break;
            case R.id.btn_Boryspilska:
                Intent intentBoryspilska = new Intent(this, PhotoActivity1.class);
                intentBoryspilska.putExtra("station", btn_Boryspilska.getText().toString() );
                startActivity(intentBoryspilska);
                break;
            case R.id.btn_Chervony_Khutir:
                Intent intentChervony_Khutir = new Intent(this, PhotoActivity1.class);
                intentChervony_Khutir.putExtra("station", btn_Chervony_Khutir.getText().toString() );
                startActivity(intentChervony_Khutir);
                break;
            default:
                break;
        }
    }
}
