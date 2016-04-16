package br.com.queijocombits.proejaappv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void gotoLocate(View view)
    {
        Intent locate = new Intent(this, Locate.class);
        startActivity(locate);
    }

    public void gotoAboutEja(View view)
    {
        Intent aboutEja = new Intent(this, AboutEja.class);
        startActivity(aboutEja);
    }

    public void gotoNewsEja(View view)
    {
        Intent newsEja = new Intent(this, News.class);
        startActivity(newsEja);
    }

    public void gotoAboutApp(View view)
    {
        Intent aboutApp = new Intent(this, AboutApp.class);
        startActivity(aboutApp);
    }

}
