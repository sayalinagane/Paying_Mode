package com.example.payingmode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final CharSequence[] items = {"Red", "Green", "Blue"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this); builder.setTitle("Pick a color");
        builder.setItems(items, new DialogInterface.OnClickListener() {     public void onClick(DialogInterface dialog, int item) {         Toast.makeText(getApplicationContext(), items[item],
                Toast.LENGTH_SHORT).show();
        }
        });
        AlertDialog alert = builder.create();


    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               