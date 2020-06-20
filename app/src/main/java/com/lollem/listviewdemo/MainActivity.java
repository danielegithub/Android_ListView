package com.lollem.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lstView;
    ImageView imgFoto;
    String[] cose = {"Montagna","Casa", "Prato", "Barca"};

    int[] photo = {
            R.drawable.montagna,
            R.drawable.casa,
            R.drawable.prato,
            R.drawable.barca
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView = (ListView)findViewById(R.id.lstView);
        this.imgFoto = (ImageView)findViewById(R.id.imgScelta);
        this.setAdapter();
    }

    /*
     * Adapter utilizzato per fare da bridge tra adpterview ed i dati
     * l'adpterView è proprio la listview
     */
    private void setAdapter(){
        ArrayAdapter adpter = new ArrayAdapter<String>(this,R.layout.item_text, cose);
        lstView.setAdapter(adpter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),cose[i],Toast.LENGTH_LONG).show();
                imgFoto.setImageResource(photo[i]);
            }
        });
    }
}