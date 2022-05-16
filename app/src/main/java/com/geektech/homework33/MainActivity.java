package com.geektech.homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
   private AddressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView.findViewById(R.id.recycler_view);
        ArrayList<String> address = new ArrayList<>();
        address.add("Panfilova 101");
        address.add("Sovetskaya 101");
        address.add("Prospekt Mira 101");
        address.add("Logvinenko 101");
        address.add("Orozbekova 101");
        address.add("Pravda 101");
        address.add("Almatinka 101");
        address.add("Magistral 101");
        address.add("Lenina 101");
        address.add("Gastello 101");
        adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
}