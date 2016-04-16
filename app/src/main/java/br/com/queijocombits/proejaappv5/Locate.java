package br.com.queijocombits.proejaappv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Locate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate);
    }

    public void gotoFind(View view)
    {
        int number = 54;
        Intent find = new Intent(this, find.class);
        find.putExtra("Numero",number);
        startActivity(find);
    }

    //teste2.0
    //Outroteste24343d5d

}
