package com.tallangroberg.TallansFavoriteToys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     TextView toysView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toysView = (TextView) findViewById(R.id.tv_toy_names);

        String[] toyNames = ToyBox.getToys();

        for( String toyName : toyNames) {
            toysView.append(toyName + "\n\n\n");
        }
    }
}