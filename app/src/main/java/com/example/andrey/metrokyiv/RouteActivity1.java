package com.example.andrey.metrokyiv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RouteActivity1 extends Activity {
    String myStart;
    String myEnd;
    TextView textViewStart;
    TextView textViewEnd;
    TextView textViewMinutes;
    int line;
    int minutes;


    String[] stations1 = {"Akademmistechko", "Zhytomyrska", "Sviatoshyn", "Nyvky", "Beresteiska",
            "Shuliavska", "Politekhnichnyi Instytut", "Vokzalna", "Universytet",
            "Teatralna", "Zoloti Vorota", "Lukianivska", "Dorohozhychi", "Syrets"};

    String[] stations2 = {"Akademmistechko", "Zhytomyrska", "Sviatoshyn", "Nyvky", "Beresteiska",
            "Shuliavska", "Politekhnichnyi Instytut", "Vokzalna", "Universytet",
            "Teatralna", "Khreshchatyk", "Maidan Nezalezhnosti", "Poshtova Ploshcha",
            "Kontraktova Ploshcha", "Tarasa Shevchenka", "Petrivka", "Obolon", "Minska",
            "Heroiv Dnipra"};

    String[] stations3 = {"Akademmistechko", "Zhytomyrska", "Sviatoshyn", "Nyvky", "Beresteiska",
            "Shuliavska", "Politekhnichnyi Instytut", "Vokzalna", "Universytet",
            "Teatralna", "Khreshchatyk", "Arsenalna", "Dnipro", "Hydropark",
            "Livoberezhna", "Darnytsia", "Chernihivska", "Lisova"};

    String[] stations4 = {"Akademmistechko", "Zhytomyrska", "Sviatoshyn", "Nyvky", "Beresteiska",
            "Shuliavska", "Politekhnichnyi Instytut", "Vokzalna", "Universytet",
            "Teatralna", "Zoloti Vorota", "Palats Sportu", "Klovskaa", "Pecherska",
            "Druzhby Narodiv", "Vydubychi", "Slavutych", "Osokorky", "Pozniaky",
            "Kharkivska", "Vyrlytsia", "Boryspilska", "Chervony Khutir"};

    String[] stations5 = {"Akademmistechko", "Zhytomyrska", "Sviatoshyn", "Nyvky", "Beresteiska",
            "Shuliavska", "Politekhnichnyi Instytut", "Vokzalna", "Universytet",
            "Teatralna", "Khreshchatyk", "Maidan Nezalezhnosti", "Ploshcha Lva Tolstoho",
            "Olimpiiska", "Palats Ukrayina", "Lybidska", "Demiivska", "Holosiivska",
            "Vasylkivska", "Vystavkovyi Tsentr", "Ipodrom", "Teremky"};

    String[] stations6 = {"Syrets", "Dorohozhychi", "Lukianivska", "Zoloti Vorota", "Palats Sportu",
            "Ploshcha Lva Tolstoho", "Maidan Nezalezhnosti", "Poshtova Ploshcha",
            "Kontraktova Ploshcha", "Tarasa Shevchenka", "Petrivka", "Obolon", "Minska",
            "Heroiv Dnipra"};

    String[] stations7 = {"Syrets", "Dorohozhychi", "Lukianivska", "Zoloti Vorota", "Teatralna",
            "Khreshchatyk", "Arsenalna", "Dnipro", "Hydropark", "Livoberezhna",
            "Darnytsia", "Chernihivska", "Lisova"};

    String[] stations8 = {"Syrets", "Dorohozhychi", "Lukianivska", "Zoloti Vorota", "Palats Sportu",
            "Klovskaa", "Pecherska", "Druzhby Narodiv", "Vydubychi", "Slavutych",
            "Osokorky", "Pozniaky", "Kharkivska", "Vyrlytsia", "Boryspilska",
            "Chervony Khutir"};

    String[] stations9 = {"Syrets", "Dorohozhychi", "Lukianivska", "Zoloti Vorota", "Palats Sportu",
            "Ploshcha Lva Tolstoho", "Olimpiiska", "Palats Ukrayina", "Lybidska",
            "Demiivska", "Holosiivska", "Vasylkivska", "Vystavkovyi Tsentr", "Ipodrom",
            "Teremky"};

    String[] stations10 = {"Heroiv Dnipra", "Minska", "Obolon", "Petrivka", "Tarasa Shevchenka",
            "Kontraktova Ploshcha", "Poshtova Ploshcha", "Maidan Nezalezhnosti",
            "Khreshchatyk", "Arsenalna", "Dnipro", "Hydropark", "Livoberezhna",
            "Darnytsia", "Chernihivska", "Lisova"};

    String[] stations11 = {"Heroiv Dnipra", "Minska", "Obolon", "Petrivka", "Tarasa Shevchenka",
            "Kontraktova Ploshcha", "Poshtova Ploshcha", "Maidan Nezalezhnosti",
            "Ploshcha Lva Tolstoho", "Palats Sportu", "Klovskaa", "Pecherska",
            "Druzhby Narodiv", "Vydubychi", "Slavutych", "Osokorky", "Pozniaky",
            "Kharkivska", "Vyrlytsia", "Boryspilska", "Chervony Khutir"};

    String[] stations12 = {"Heroiv Dnipra", "Minska", "Obolon", "Petrivka", "Tarasa Shevchenka",
            "Kontraktova Ploshcha", "Poshtova Ploshcha", "Maidan Nezalezhnosti",
            "Ploshcha Lva Tolstoho", "Olimpiiska", "Palats Ukrayina", "Lybidska",
            "Demiivska", "Holosiivska", "Vasylkivska", "Vystavkovyi Tsentr",
            "Ipodrom", "Teremky"};

    String[] stations13 = {"Lisova", "Chernihivska", "Darnytsia", "Livoberezhna", "Hydropark",
            "Dnipro", "Arsenalna", "Khreshchatyk", "Teatralna", "Zoloti Vorota",
            "Palats Sportu", "Klovskaa", "Pecherska", "Druzhby Narodiv", "Vydubychi",
            "Slavutych", "Osokorky", "Pozniaky", "Kharkivska", "Vyrlytsia", "Boryspilska",
            "Chervony Khutir"};

    String[] stations14 = {"Lisova", "Chernihivska", "Darnytsia", "Livoberezhna", "Hydropark",
            "Dnipro", "Arsenalna", "Khreshchatyk", "Maidan Nezalezhnosti",
            "Ploshcha Lva Tolstoho", "Olimpiiska", "Palats Ukrayina", "Lybidska",
            "Demiivska", "Holosiivska", "Vasylkivska", "Vystavkovyi Tsentr", "Ipodrom",
            "Teremky"};

    String[] stations15 = {"Chervony Khutir", "Boryspilska", "Vyrlytsia", "Kharkivska", "Pozniaky",
            "Osokorky", "Slavutych", "Vydubychi", "Druzhby Narodiv", "Pecherska",
            "Klovskaa", "Palats Sportu", "Ploshcha Lva Tolstoho", "Olimpiiska",
            "Palats Ukrayina", "Lybidska", "Demiivska", "Holosiivska", "Vasylkivska",
            "Vystavkovyi Tsentr", "Ipodrom", "Teremky"};

    ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stations1));
    ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(stations2));
    ArrayList<String> arrayList3 = new ArrayList<String>(Arrays.asList(stations3));
    ArrayList<String> arrayList4 = new ArrayList<String>(Arrays.asList(stations4));
    ArrayList<String> arrayList5 = new ArrayList<String>(Arrays.asList(stations5));
    ArrayList<String> arrayList6 = new ArrayList<String>(Arrays.asList(stations6));
    ArrayList<String> arrayList7 = new ArrayList<String>(Arrays.asList(stations7));
    ArrayList<String> arrayList8 = new ArrayList<String>(Arrays.asList(stations8));
    ArrayList<String> arrayList9 = new ArrayList<String>(Arrays.asList(stations9));
    ArrayList<String> arrayList10 = new ArrayList<String>(Arrays.asList(stations10));
    ArrayList<String> arrayList11 = new ArrayList<String>(Arrays.asList(stations11));
    ArrayList<String> arrayList12 = new ArrayList<String>(Arrays.asList(stations12));
    ArrayList<String> arrayList13 = new ArrayList<String>(Arrays.asList(stations13));
    ArrayList<String> arrayList14 = new ArrayList<String>(Arrays.asList(stations14));
    ArrayList<String> arrayList15 = new ArrayList<String>(Arrays.asList(stations15));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route1);

        myStart = getIntent().getStringExtra("start");
        myEnd = getIntent().getStringExtra("end");

        textViewStart = (TextView) findViewById(R.id.textViewStart);
        textViewEnd = (TextView) findViewById(R.id.textViewEnd);
        textViewMinutes = (TextView) findViewById(R.id.textViewMinutes);
        textViewStart.setText(myStart);
        textViewEnd.setText(myEnd);


        boolean valStart1 = arrayList1.contains(myStart);
        boolean valEnd1 = arrayList1.contains(myEnd);
        if (valStart1 == true && valEnd1 == true) {
            line = 1;
        }
        boolean valStart2 = arrayList2.contains(myStart);
        boolean valEnd2 = arrayList2.contains(myEnd);
        if (valStart2 == true && valEnd2 == true) {
            line = 2;
        }
        boolean valStart3 = arrayList3.contains(myStart);
        boolean valEnd3 = arrayList3.contains(myEnd);
        if (valStart3 == true && valEnd3 == true) {
            line = 3;
        }
        boolean valStart4 = arrayList4.contains(myStart);
        boolean valEnd4 = arrayList4.contains(myEnd);
        if (valStart4 == true && valEnd4 == true) {
            line = 4;
        }
        boolean valStart5 = arrayList5.contains(myStart);
        boolean valEnd5 = arrayList5.contains(myEnd);
        if (valStart5 == true && valEnd5 == true) {
            line = 5;
        }
        boolean valStart6 = arrayList6.contains(myStart);
        boolean valEnd6 = arrayList6.contains(myEnd);
        if (valStart6 == true && valEnd6 == true) {
            line = 6;
        }
        boolean valStart7 = arrayList7.contains(myStart);
        boolean valEnd7 = arrayList7.contains(myEnd);
        if (valStart7 == true && valEnd7 == true) {
            line = 7;
        }
        boolean valStart8 = arrayList8.contains(myStart);
        boolean valEnd8 = arrayList8.contains(myEnd);
        if (valStart8 == true && valEnd8 == true) {
            line = 8;
        }
        boolean valStart9 = arrayList9.contains(myStart);
        boolean valEnd9 = arrayList9.contains(myEnd);
        if (valStart9 == true && valEnd9 == true) {
            line = 9;
        }
        boolean valStart10 = arrayList10.contains(myStart);
        boolean valEnd10 = arrayList10.contains(myEnd);
        if (valStart10 == true && valEnd10 == true) {
            line = 10;
        }
        boolean valStart11 = arrayList11.contains(myStart);
        boolean valEnd11 = arrayList11.contains(myEnd);
        if (valStart11 == true && valEnd11 == true) {
            line = 11;
        }
        boolean valStart12 = arrayList12.contains(myStart);
        boolean valEnd12 = arrayList12.contains(myEnd);
        if (valStart12 == true && valEnd12 == true) {
            line = 12;
        }
        boolean valStart13 = arrayList13.contains(myStart);
        boolean valEnd13 = arrayList13.contains(myEnd);
        if (valStart13 == true && valEnd13 == true) {
            line = 13;
        }
        boolean valStart14 = arrayList14.contains(myStart);
        boolean valEnd14 = arrayList14.contains(myEnd);
        if (valStart14 == true && valEnd14 == true) {
            line = 14;
        }
        boolean valStart15 = arrayList15.contains(myStart);
        boolean valEnd15 = arrayList15.contains(myEnd);
        if (valStart15 == true && valEnd15 == true) {
            line = 15;
        }

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.listView);


        switch (line) {
            case 1:
                int indexStart1 = arrayList1.indexOf(myStart);
                int indexEnd1 = arrayList1.indexOf(myEnd);

                if (indexStart1 < indexEnd1) {
                    minutes = (indexEnd1 - indexStart1) * 3;
                } else {
                    minutes = (indexStart1 - indexEnd1) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");

                if (indexStart1 < indexEnd1) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList1.subList(indexStart1 + 1, indexEnd1));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList1);
                    int indexStart = arrayList1.indexOf(myStart);
                    int indexEnd = arrayList1.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList1.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }

            case 2:
                int indexStart2 = arrayList2.indexOf(myStart);
                int indexEnd2 = arrayList2.indexOf(myEnd);

                if (indexStart2 < indexEnd2) {
                    minutes = (indexEnd2 - indexStart2) * 3;
                } else {
                    minutes = (indexStart2 - indexEnd2) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart2 < indexEnd2) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList2.subList(indexStart2 + 1, indexEnd2));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList2);
                    int indexStart = arrayList2.indexOf(myStart);
                    int indexEnd = arrayList2.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList2.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 3:
                int indexStart3 = arrayList3.indexOf(myStart);
                int indexEnd3 = arrayList3.indexOf(myEnd);
                if (indexStart3 < indexEnd3) {
                    minutes = (indexEnd3 - indexStart3) * 3;
                } else {
                    minutes = (indexStart3 - indexEnd3) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart3 < indexEnd3) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList3.subList(indexStart3 + 1, indexEnd3));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList3);
                    int indexStart = arrayList3.indexOf(myStart);
                    int indexEnd = arrayList3.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList3.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 4:
                int indexStart4 = arrayList4.indexOf(myStart);
                int indexEnd4 = arrayList4.indexOf(myEnd);
                if (indexStart4 < indexEnd4) {
                    minutes = (indexEnd4 - indexStart4) * 3;
                } else {
                    minutes = (indexStart4 - indexEnd4) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart4 < indexEnd4) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList4.subList(indexStart4 + 1, indexEnd4));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList4);
                    int indexStart = arrayList4.indexOf(myStart);
                    int indexEnd = arrayList4.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList4.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 5:
                int indexStart5 = arrayList5.indexOf(myStart);
                int indexEnd5 = arrayList5.indexOf(myEnd);
                if (indexStart5 < indexEnd5) {
                    minutes = (indexEnd5 - indexStart5) * 3;
                } else {
                    minutes = (indexStart5 - indexEnd5) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart5 < indexEnd5) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList5.subList(indexStart5 + 1, indexEnd5));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList5);
                    int indexStart = arrayList5.indexOf(myStart);
                    int indexEnd = arrayList5.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList5.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 6:
                int indexStart6 = arrayList6.indexOf(myStart);
                int indexEnd6 = arrayList6.indexOf(myEnd);
                if (indexStart6 < indexEnd6) {
                    minutes = (indexEnd6 - indexStart6) * 3;
                } else {
                    minutes = (indexStart6 - indexEnd6) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart6 < indexEnd6) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList6.subList(indexStart6 + 1, indexEnd6));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList6);
                    int indexStart = arrayList6.indexOf(myStart);
                    int indexEnd = arrayList6.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList6.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 7:
                int indexStart7 = arrayList7.indexOf(myStart);
                int indexEnd7 = arrayList7.indexOf(myEnd);
                if (indexStart7 < indexEnd7) {
                    minutes = (indexEnd7 - indexStart7) * 3;
                } else {
                    minutes = (indexStart7 - indexEnd7) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart7 < indexEnd7) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList7.subList(indexStart7 + 1, indexEnd7));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList7);
                    int indexStart = arrayList7.indexOf(myStart);
                    int indexEnd = arrayList7.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList7.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 8:
                int indexStart8 = arrayList8.indexOf(myStart);
                int indexEnd8 = arrayList8.indexOf(myEnd);
                if (indexStart8 < indexEnd8) {
                    minutes = (indexEnd8 - indexStart8) * 3;
                } else {
                    minutes = (indexStart8 - indexEnd8) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart8 < indexEnd8) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList1.subList(indexStart8 + 1, indexEnd8));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList8);
                    int indexStart = arrayList8.indexOf(myStart);
                    int indexEnd = arrayList8.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList8.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 9:
                int indexStart9 = arrayList9.indexOf(myStart);
                int indexEnd9 = arrayList9.indexOf(myEnd);
                if (indexStart9 < indexEnd9) {
                    minutes = (indexEnd9 - indexStart9) * 3;
                } else {
                    minutes = (indexStart9 - indexEnd9) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart9 < indexEnd9) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList1.subList(indexStart9 + 1, indexEnd9));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList9);
                    int indexStart = arrayList9.indexOf(myStart);
                    int indexEnd = arrayList9.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList9.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 10:
                int indexStart10 = arrayList10.indexOf(myStart);
                int indexEnd10 = arrayList10.indexOf(myEnd);
                if (indexStart10 < indexEnd10) {
                    minutes = (indexEnd10 - indexStart10) * 3;
                } else {
                    minutes = (indexStart10 - indexEnd10) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart10 < indexEnd10) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList10.subList(indexStart10 + 1, indexEnd10));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList10);
                    int indexStart = arrayList10.indexOf(myStart);
                    int indexEnd = arrayList10.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList10.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 11:
                int indexStart11 = arrayList11.indexOf(myStart);
                int indexEnd11 = arrayList11.indexOf(myEnd);
                if (indexStart11 < indexEnd11) {
                    minutes = (indexEnd11 - indexStart11) * 3;
                } else {
                    minutes = (indexStart11 - indexEnd11) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart11 < indexEnd11) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList11.subList(indexStart11 + 1, indexEnd11));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList11);
                    int indexStart = arrayList11.indexOf(myStart);
                    int indexEnd = arrayList11.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList11.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 12:
                int indexStart12 = arrayList12.indexOf(myStart);
                int indexEnd12 = arrayList12.indexOf(myEnd);
                if (indexStart12 < indexEnd12) {
                    minutes = (indexEnd12 - indexStart12) * 3;
                } else {
                    minutes = (indexStart12 - indexEnd12) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart12 < indexEnd12) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList12.subList(indexStart12 + 1, indexEnd12));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList12);
                    int indexStart = arrayList12.indexOf(myStart);
                    int indexEnd = arrayList12.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList12.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 13:
                int indexStart13 = arrayList13.indexOf(myStart);
                int indexEnd13 = arrayList13.indexOf(myEnd);
                if (indexStart13 < indexEnd13) {
                    minutes = (indexEnd13 - indexStart13) * 3;
                } else {
                    minutes = (indexStart13 - indexEnd13) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart13 < indexEnd13) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList13.subList(indexStart13 + 1, indexEnd13));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList13);
                    int indexStart = arrayList13.indexOf(myStart);
                    int indexEnd = arrayList13.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList13.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 14:
                int indexStart14 = arrayList14.indexOf(myStart);
                int indexEnd14 = arrayList14.indexOf(myEnd);
                if (indexStart14 < indexEnd14) {
                    minutes = (indexEnd14 - indexStart14) * 3;
                } else {
                    minutes = (indexStart14 - indexEnd14) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart14 < indexEnd14) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList14.subList(indexStart14 + 1, indexEnd14));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList14);
                    int indexStart = arrayList14.indexOf(myStart);
                    int indexEnd = arrayList14.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList14.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            case 15:
                int indexStart15 = arrayList15.indexOf(myStart);
                int indexEnd15 = arrayList15.indexOf(myEnd);
                if (indexStart15 < indexEnd15) {
                    minutes = (indexEnd15 - indexStart15) * 3;
                } else {
                    minutes = (indexStart15 - indexEnd15) * 3;
                }

                textViewMinutes.setText("about " + minutes + " minutes");
                if (indexStart15 < indexEnd15) {
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList15.subList(indexStart15 + 1, indexEnd15));
                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);
                    break;
                } else {
                    Collections.reverse(arrayList15);
                    int indexStart = arrayList15.indexOf(myStart);
                    int indexEnd = arrayList15.indexOf(myEnd);
                    ArrayList<String> arrayList = new ArrayList<String>(arrayList15.subList(indexStart + 1, indexEnd));

                    // создаем адаптер
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arrayList);
                    // присваиваем адаптер списку
                    lvMain.setAdapter(adapter1);

                    break;
                }
            default:
                Toast toast = Toast.makeText(RouteActivity1.this, "incorrectly selected route", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_route_activity1, menu);
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
