package br.com.queijocombits.proejaappv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class find extends AppCompatActivity {

    TextView textViewFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        //Intent intent = getIntent();
        String mostra = getIntent().getStringExtra("Busca");
        setUI();
        textViewFind.setText(mostra);
    }

    public void setUI(){

        textViewFind = (TextView) findViewById(R.id.textViewFind);

    }
}


