package com.example.asusx453sa.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> a;
    ListView listview;
    String hasil[] = {
            "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView)findViewById(R.id.listview);
        a = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hasil);
        listview.setAdapter(a);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent hasil = new Intent(MainActivity.this, Main2Activity.class);
                String list = listview.getAdapter().toString();
                hasil.putExtra("hasil", hasil);
                startActivity(hasil);
            }
        });

    }
}
