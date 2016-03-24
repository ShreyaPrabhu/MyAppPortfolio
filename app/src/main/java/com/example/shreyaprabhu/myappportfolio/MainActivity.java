package com.example.shreyaprabhu.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    Context context = MainActivity.this;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SpotifyToast(View view) {
        Toast.makeText(context,"This button will launch my Spotify Streamer app!", duration).show();
    }

    public void ScoresToast(View view) {
        Toast.makeText(context,"This button will launch my Scores app!", duration).show();
    }

    public void LibraryToast(View view) {
        Toast.makeText(context,"This button will launch my Library app!", duration).show();
    }

    public void BuildItToast(View view) {
        Toast.makeText(context,"This button will launch my Build It Bigger app!", duration).show();
    }

    public void MaterialiseToast(View view) {
        Toast.makeText(context,"This button will launch my XYZ Reader app!", duration).show();
    }

    public void CapstoneToast(View view) {
        Toast.makeText(context,"This button will launch my Capstone app!", duration).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
