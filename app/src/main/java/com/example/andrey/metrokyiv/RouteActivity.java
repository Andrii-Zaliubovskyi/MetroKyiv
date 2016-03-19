package com.example.andrey.metrokyiv;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class RouteActivity extends Activity implements View.OnClickListener {

    Button buttonAkademmistechko;
    Button buttonZhytomyrska;
    Button buttonSviatoshyn;
    Button buttonNyvky;
    Button buttonBeresteiska;
    Button buttonShuliavska;
    Button buttonPolitekhnichnyi_Instytut;
    Button buttonVokzalna;
    Button buttonUniversytet;
    Button buttonTeatralna;
    Button buttonKhreshchatyk;
    Button buttonArsenalna;
    Button buttonDnipro;
    Button buttonHydropark;
    Button buttonLivoberezhna;
    Button buttonDarnytsia;
    Button buttonChernihivska;
    Button buttonLisova;

    Button buttonHeroiv_Dnipra;
    Button buttonMinska;
    Button buttonObolon;
    Button buttonPetrivka;
    Button buttonTarasa_Shevchenka;
    Button buttonKontraktova_Ploshcha;
    Button buttonPoshtova_Ploshcha;
    Button buttonMaidan_Nezalezhnosti;
    Button buttonPloshcha_Lva_Tolstoho;
    Button buttonOlimpiiska;
    Button buttonPalats_Ukrayina;
    Button buttonLybidska;
    Button buttonDemiivska;
    Button buttonHolosiivska;
    Button buttonVasylkivska;
    Button buttonVystavkovyi_Tsentr;
    Button buttonIpodrom;
    Button buttonTeremky;

    Button buttonSyrets;
    Button buttonDorohozhychi;
    Button buttonLukianivska;
    Button buttonZoloti_Vorota;
    Button buttonPalats_Sportu;
    Button buttonKlovska;
    Button buttonPecherska;
    Button buttonDruzhby_Narodiv;
    Button buttonVydubychi;
    Button buttonSlavutych;
    Button buttonOsokorky;
    Button buttonPozniaky;
    Button buttonKharkivska;
    Button buttonVyrlytsia;
    Button buttonBoryspilska;
    Button buttonChervony_Khutir;

    EditText editTextStart;
    EditText editTextEnd;
    Button buttonGo;
    String evalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        buttonAkademmistechko = (Button) findViewById(R.id.buttonAkademmistechko);
        buttonZhytomyrska = (Button) findViewById(R.id.buttonZhytomyrska);
        buttonSviatoshyn = (Button) findViewById(R.id.buttonSviatoshyn);
        buttonNyvky = (Button) findViewById(R.id.buttonNyvky);
        buttonBeresteiska = (Button) findViewById(R.id.buttonBeresteiska);
        buttonShuliavska = (Button) findViewById(R.id.buttonShuliavska);
        buttonPolitekhnichnyi_Instytut = (Button) findViewById(R.id.buttonPolitekhnichnyiInstytut);
        buttonVokzalna = (Button) findViewById(R.id.Vokzalna);
        buttonUniversytet = (Button) findViewById(R.id.buttonUniversytet);
        buttonTeatralna = (Button) findViewById(R.id.buttonTeatralna);
        buttonKhreshchatyk = (Button) findViewById(R.id.buttonKhreshchatyk);
        buttonArsenalna = (Button) findViewById(R.id.buttonArsenalna);
        buttonDnipro = (Button) findViewById(R.id.buttonDnipro);
        buttonHydropark = (Button) findViewById(R.id.buttonHydropark);
        buttonLivoberezhna = (Button) findViewById(R.id.buttonLivoberezhna);
        buttonDarnytsia = (Button) findViewById(R.id.buttonDarnytsia);
        buttonChernihivska = (Button) findViewById(R.id.buttonChernihivska);
        buttonLisova = (Button) findViewById(R.id.buttonLisova);

        buttonHeroiv_Dnipra = (Button) findViewById(R.id.buttonHeroivDnipra);
        buttonMinska = (Button) findViewById(R.id.buttonMinska);
        buttonObolon = (Button) findViewById(R.id.buttonObolon);
        buttonPetrivka = (Button) findViewById(R.id.buttonPetrivka);
        buttonTarasa_Shevchenka = (Button) findViewById(R.id.buttonTarasaShevchenka);
        buttonKontraktova_Ploshcha = (Button) findViewById(R.id.buttonKontraktovaPloshcha);
        buttonPoshtova_Ploshcha = (Button) findViewById(R.id.buttonPoshtovaPloshcha);
        buttonMaidan_Nezalezhnosti = (Button) findViewById(R.id.buttonMaidanNezalezhnosti);
        buttonPloshcha_Lva_Tolstoho = (Button) findViewById(R.id.buttonPloshchaLvaTolstoho);
        buttonOlimpiiska = (Button) findViewById(R.id.buttonOlimpiiska);
        buttonPalats_Ukrayina = (Button) findViewById(R.id.buttonPalatsUkrayina);
        buttonLybidska = (Button) findViewById(R.id.buttonLybidska);
        buttonDemiivska = (Button) findViewById(R.id.buttonDemiivska);
        buttonHolosiivska = (Button) findViewById(R.id.buttonHolosiivska);
        buttonVasylkivska = (Button) findViewById(R.id.buttonVasylkivska);
        buttonVystavkovyi_Tsentr = (Button) findViewById(R.id.buttonVystavkovyiTsentr);
        buttonIpodrom = (Button) findViewById(R.id.buttonIpodrom);
        buttonTeremky = (Button) findViewById(R.id.buttonTeremky);

        buttonSyrets = (Button) findViewById(R.id.buttonSyrets);
        buttonDorohozhychi = (Button) findViewById(R.id.buttonDorohozhychi);
        buttonLukianivska = (Button) findViewById(R.id.buttonLukianivska);
        buttonZoloti_Vorota = (Button) findViewById(R.id.buttonZolotiVorota);
        buttonPalats_Sportu = (Button) findViewById(R.id.buttonPalatsSportu);
        buttonKlovska = (Button) findViewById(R.id.buttonKlovskaa);
        buttonPecherska = (Button) findViewById(R.id.buttonPecherska);
        buttonDruzhby_Narodiv = (Button) findViewById(R.id.buttonDruzhbyNarodiv);
        buttonVydubychi = (Button) findViewById(R.id.buttonVydubychi);
        buttonSlavutych = (Button) findViewById(R.id.buttonSlavutych);
        buttonOsokorky = (Button) findViewById(R.id.buttonOsokorky);
        buttonPozniaky = (Button) findViewById(R.id.buttonPozniaky);
        buttonKharkivska = (Button) findViewById(R.id.buttonKharkivska);
        buttonVyrlytsia = (Button) findViewById(R.id.buttonVyrlytsia);
        buttonBoryspilska = (Button) findViewById(R.id.buttonBoryspilska);
        buttonChervony_Khutir = (Button) findViewById(R.id.buttonChervonyKhutir);

        editTextStart = (EditText) findViewById(R.id.editTextStart);
        editTextEnd = (EditText) findViewById(R.id.editTextEnd);
        buttonGo = (Button) findViewById(R.id.buttonGo);

        buttonAkademmistechko.setOnClickListener(this);
        buttonZhytomyrska.setOnClickListener(this);
        buttonSviatoshyn.setOnClickListener(this);
        buttonNyvky.setOnClickListener(this);
        buttonBeresteiska.setOnClickListener(this);
        buttonShuliavska.setOnClickListener(this);
        buttonPolitekhnichnyi_Instytut.setOnClickListener(this);
        buttonVokzalna.setOnClickListener(this);
        buttonUniversytet.setOnClickListener(this);
        buttonTeatralna.setOnClickListener(this);
        buttonKhreshchatyk.setOnClickListener(this);
        buttonArsenalna.setOnClickListener(this);
        buttonDnipro.setOnClickListener(this);
        buttonHydropark.setOnClickListener(this);
        buttonLivoberezhna.setOnClickListener(this);
        buttonDarnytsia.setOnClickListener(this);
        buttonChernihivska.setOnClickListener(this);
        buttonLisova.setOnClickListener(this);

        buttonHeroiv_Dnipra.setOnClickListener(this);
        buttonMinska.setOnClickListener(this);
        buttonObolon.setOnClickListener(this);
        buttonPetrivka.setOnClickListener(this);
        buttonTarasa_Shevchenka.setOnClickListener(this);
        buttonKontraktova_Ploshcha.setOnClickListener(this);
        buttonPoshtova_Ploshcha.setOnClickListener(this);
        buttonMaidan_Nezalezhnosti.setOnClickListener(this);
        buttonPloshcha_Lva_Tolstoho.setOnClickListener(this);
        buttonOlimpiiska.setOnClickListener(this);
        buttonPalats_Ukrayina.setOnClickListener(this);
        buttonLybidska.setOnClickListener(this);
        buttonDemiivska.setOnClickListener(this);
        buttonHolosiivska.setOnClickListener(this);
        buttonVasylkivska.setOnClickListener(this);
        buttonVystavkovyi_Tsentr.setOnClickListener(this);
        buttonIpodrom.setOnClickListener(this);
        buttonTeremky.setOnClickListener(this);

        buttonSyrets.setOnClickListener(this);
        buttonDorohozhychi.setOnClickListener(this);
        buttonLukianivska.setOnClickListener(this);
        buttonZoloti_Vorota.setOnClickListener(this);
        buttonPalats_Sportu.setOnClickListener(this);
        buttonKlovska.setOnClickListener(this);
        buttonPecherska.setOnClickListener(this);
        buttonDruzhby_Narodiv.setOnClickListener(this);
        buttonVydubychi.setOnClickListener(this);
        buttonSlavutych.setOnClickListener(this);
        buttonOsokorky.setOnClickListener(this);
        buttonPozniaky.setOnClickListener(this);
        buttonKharkivska.setOnClickListener(this);
        buttonVyrlytsia.setOnClickListener(this);
        buttonBoryspilska.setOnClickListener(this);
        buttonChervony_Khutir.setOnClickListener(this);

        buttonGo.setOnClickListener(this);

        editTextStart.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                evalue = "1";
                return false;
            }
        });
        editTextEnd.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                evalue = "2";
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_route, menu);
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
            case R.id.buttonAkademmistechko:
                if (evalue == "1") {
                    editTextStart.setText("Akademmistechko");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Akademmistechko");
                }
                break;
            case R.id.buttonZhytomyrska:
                if (evalue == "1") {
                    editTextStart.setText("Zhytomyrska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Zhytomyrska");
                }
                break;
            case R.id.buttonSviatoshyn:
                if (evalue == "1") {
                    editTextStart.setText("Sviatoshyn");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Sviatoshyn");
                }
                break;
            case R.id.buttonNyvky:
                if (evalue == "1") {
                    editTextStart.setText("Nyvky");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Nyvky");
                }
                break;
            case R.id.buttonBeresteiska:
                if (evalue == "1") {
                    editTextStart.setText("Beresteiska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Beresteiska");
                }
                break;
            case R.id.buttonShuliavska:
                if (evalue == "1") {
                    editTextStart.setText("Shuliavska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Shuliavska");
                }
                break;
            case R.id.buttonPolitekhnichnyiInstytut:
                if (evalue == "1") {
                    editTextStart.setText("Politekhnichnyi Instytut");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Politekhnichnyi Instytut");
                }
                break;
            case R.id.Vokzalna:
                if (evalue == "1") {
                    editTextStart.setText("Vokzalna");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Vokzalna");
                }
                break;
            case R.id.buttonUniversytet:
                if (evalue == "1") {
                    editTextStart.setText("Universytet");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Universytet");
                }
                break;
            case R.id.buttonTeatralna:
                if (evalue == "1") {
                    editTextStart.setText("Teatralna");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Teatralna");
                }
                break;
            case R.id.buttonKhreshchatyk:
                if (evalue == "1") {
                    editTextStart.setText("Khreshchatyk");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Khreshchatyk");
                }
                break;
            case R.id.buttonArsenalna:
                if (evalue == "1") {
                    editTextStart.setText("Arsenalna");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Arsenalna");
                }
                break;
            case R.id.buttonDnipro:
                if (evalue == "1") {
                    editTextStart.setText("Dnipro");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Dnipro");
                }
                break;
            case R.id.buttonHydropark:
                if (evalue == "1") {
                    editTextStart.setText("Hydropark");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Hydropark");
                }
                break;
            case R.id.buttonLivoberezhna:
                if (evalue == "1") {
                    editTextStart.setText("Livoberezhna");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Livoberezhna");
                }
                break;
            case R.id.buttonDarnytsia:
                if (evalue == "1") {
                    editTextStart.setText("Darnytsia");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Darnytsia");
                }
                break;
            case R.id.buttonChernihivska:
                if (evalue == "1") {
                    editTextStart.setText("Chernihivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Chernihivska");
                }
                break;
            case R.id.buttonLisova:
                if (evalue == "1") {
                    editTextStart.setText("Lisova");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Lisova");
                }
                break;


            case R.id.buttonHeroivDnipra:
                if (evalue == "1") {
                    editTextStart.setText("Heroiv Dnipra");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Heroiv Dnipra");
                }
                break;
            case R.id.buttonMinska:
                if (evalue == "1") {
                    editTextStart.setText("Minska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Minska");
                }
                break;
            case R.id.buttonObolon:
                if (evalue == "1") {
                    editTextStart.setText("Obolon");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Obolon");
                }
                break;
            case R.id.buttonPetrivka:
                if (evalue == "1") {
                    editTextStart.setText("Petrivka");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Petrivka");
                }
                break;
            case R.id.buttonTarasaShevchenka:
                if (evalue == "1") {
                    editTextStart.setText("Tarasa Shevchenka");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Tarasa Shevchenka");
                }
                break;
            case R.id.buttonKontraktovaPloshcha:
                if (evalue == "1") {
                    editTextStart.setText("Kontraktova Ploshcha");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Kontraktova Ploshcha");
                }
                break;
            case R.id.buttonPoshtovaPloshcha:
                if (evalue == "1") {
                    editTextStart.setText("Poshtova Ploshcha");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Poshtova Ploshcha");
                }
                break;
            case R.id.buttonMaidanNezalezhnosti:
                if (evalue == "1") {
                    editTextStart.setText("Maidan Nezalezhnosti");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Maidan Nezalezhnosti");
                }
                break;
            case R.id.buttonPloshchaLvaTolstoho:
                if (evalue == "1") {
                    editTextStart.setText("Ploshcha Lva Tolstoho");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Ploshcha Lva Tolstoho");
                }
                break;
            case R.id.buttonOlimpiiska:
                if (evalue == "1") {
                    editTextStart.setText("Olimpiiska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Olimpiiska");
                }
                break;
            case R.id.buttonPalatsUkrayina:
                if (evalue == "1") {
                    editTextStart.setText("Palats Ukrayina");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Palats Ukrayina");
                }
                break;
            case R.id.buttonLybidska:
                if (evalue == "1") {
                    editTextStart.setText("Lybidska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Lybidska");
                }
                break;
            case R.id.buttonDemiivska:
                if (evalue == "1") {
                    editTextStart.setText("Demiivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Demiivska");
                }
                break;
            case R.id.buttonHolosiivska:
                if (evalue == "1") {
                    editTextStart.setText("Holosiivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Holosiivska");
                }
                break;
            case R.id.buttonVasylkivska:
                if (evalue == "1") {
                    editTextStart.setText("Vasylkivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Vasylkivska");
                }
                break;
            case R.id.buttonVystavkovyiTsentr:
                if (evalue == "1") {
                    editTextStart.setText("Vystavkovyi Tsentr");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Vystavkovyi Tsentr");
                }
                break;
            case R.id.buttonIpodrom:
                if (evalue == "1") {
                    editTextStart.setText("Ipodrom");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Ipodrom");
                }
                break;
            case R.id.buttonTeremky:
                if (evalue == "1") {
                    editTextStart.setText("Teremky");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Teremky");
                }
                break;


            case R.id.buttonSyrets:
                if (evalue == "1") {
                    editTextStart.setText("Syrets");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Syrets");
                }
                break;
            case R.id.buttonDorohozhychi:
                if (evalue == "1") {
                    editTextStart.setText("Dorohozhychi");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Dorohozhychi");
                }
                break;
            case R.id.buttonLukianivska:
                if (evalue == "1") {
                    editTextStart.setText("Lukianivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Lukianivska");
                }
                break;
            case R.id.buttonZolotiVorota:
                if (evalue == "1") {
                    editTextStart.setText("Zoloti Vorota");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Zoloti Vorota");
                }
                break;
            case R.id.buttonPalatsSportu:
                if (evalue == "1") {
                    editTextStart.setText("Palats Sportu");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Palats Sportu");
                }
                break;
            case R.id.buttonKlovskaa:
                if (evalue == "1") {
                    editTextStart.setText("Klovskaa");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Klovskaa");
                }
                break;
            case R.id.buttonPecherska:
                if (evalue == "1") {
                    editTextStart.setText("Pecherska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Pecherska");
                }
                break;
            case R.id.buttonDruzhbyNarodiv:
                if (evalue == "1") {
                    editTextStart.setText("Druzhby Narodiv");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Druzhby Narodiv");
                }
                break;
            case R.id.buttonVydubychi:
                if (evalue == "1") {
                    editTextStart.setText("Vydubychi");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Vydubychi");
                }
                break;
            case R.id.buttonSlavutych:
                if (evalue == "1") {
                    editTextStart.setText("Slavutych");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Slavutych");
                }
                break;
            case R.id.buttonOsokorky:
                if (evalue == "1") {
                    editTextStart.setText("Osokorky");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Osokorky");
                }
                break;
            case R.id.buttonPozniaky:
                if (evalue == "1") {
                    editTextStart.setText("Pozniaky");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Pozniaky");
                }
                break;
            case R.id.buttonKharkivska:
                if (evalue == "1") {
                    editTextStart.setText("Kharkivska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Kharkivska");
                }
                break;
            case R.id.buttonVyrlytsia:
                if (evalue == "1") {
                    editTextStart.setText("Vyrlytsia");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Vyrlytsia");
                }
                break;
            case R.id.buttonBoryspilska:
                if (evalue == "1") {
                    editTextStart.setText("Boryspilska");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Boryspilska");
                }
                break;
            case R.id.buttonChervonyKhutir:
                if (evalue == "1") {
                    editTextStart.setText("Chervony Khutir");
                }
                if (evalue == "2") {
                    editTextEnd.setText("Chervony Khutir");
                }
                break;

            case R.id.buttonGo:

                if (editTextStart.getText().toString().equals("") || editTextEnd.getText().toString().equals("") || editTextStart.getText().toString().equals(editTextEnd.getText().toString())) {
                    Toast toast = Toast.makeText(RouteActivity.this, "incorrectly selected route", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    Intent intentGo = new Intent(this, RouteActivity1.class);
                    intentGo.putExtra("start", editTextStart.getText().toString());
                    intentGo.putExtra("end", editTextEnd.getText().toString());
                    startActivity(intentGo);
                    break;
                }


            default:
                break;
        }
    }

}
