package com.example.chinegua.fem_lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter adaptador = ArrayAdapter.createFromResource(
                this,
                R.array.datos,
                android.R.layout.simple_list_item_1);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptador);

       /* listView.setOnClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

            }
        });*/

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String opcion = listView.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), opcion, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


