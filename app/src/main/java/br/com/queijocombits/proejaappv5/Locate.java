package br.com.queijocombits.proejaappv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Locate extends AppCompatActivity {

    private EditText busca;
    Button btnbuscar;

    public void setUI(){
        busca = (EditText) findViewById(R.id.editText);
        btnbuscar = (Button) findViewById(R.id.button4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate);
        setUI();
        setActions();
    }

    public void gotoFind(String name)
    {
        Intent find = new Intent(this, find.class);
        find.putExtra("Busca",name);
        startActivity(find);
    }

    public void setActions(){
        btnbuscar.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                String name = busca.getText().toString();
                gotoFind(name);
            }
        });
    }
}
