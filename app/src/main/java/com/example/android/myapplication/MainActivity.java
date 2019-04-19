package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    final List<User> users = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Tarih/saat formatlamak için yazılan kod parçacığı
        SimpleDateFormat dateFormat =new SimpleDateFormat("hh:mm:ss");
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        String lastUpdateDate = dateFormat.format(gregorianCalendar.getTime());

        users.add(new User(true, "İrem Kardaş",lastUpdateDate));
        users.add(new User(true, "Merve Subaşı",lastUpdateDate));
        users.add(new User(true, "Merve Memsin",lastUpdateDate));
        users.add(new User(false, "Semih Kırdinli",lastUpdateDate));

        final ListView listView =(ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(this, users);
        listView.setAdapter(customAdapter);





    }
}