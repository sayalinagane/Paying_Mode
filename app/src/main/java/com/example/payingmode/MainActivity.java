package com.example.payingmode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private Object Color;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ABC(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.alertdialog, null);
        builder.setTitle("Choose app to do payments");
        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("CANCEL", null);
        builder.setView(dialogLayout);
        builder.show();
    }
public void paytm(View view){
        Intent browserInetnt=new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/"));
        startActivity(browserInetnt);
}
    public void gpay(View view){
        Intent browserInetnt2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://pay.google.com/intl/en_in/about/?gclid=EAIaIQobChMIifCd0eLd5gIVSYuPCh0iLQ0TEAAYASAAEgLzEvD_BwE"));
        startActivity(browserInetnt2);
    }
    public void amazon(View view){
        Intent browserInetnt3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/gp/sva/dashboard"));
        startActivity(browserInetnt3);
    }
    public void bharatpe(View view){
        Intent browserInetnt4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://bharatpe.com/"));
        startActivity(browserInetnt4);

    }
    public void freecharge(View view){
        Intent browserInetnt5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freecharge.in/?utm_source=google&utm_medium=paid&utm_campaign=fc_sok_sem_reach_rma_web_in000_cc000_super_brand&gclid=EAIaIQobChMI_s6I_d3d5gIVjB0rCh0OMQ9iEAAYASAAEgJoNPD_BwE"));
        startActivity(browserInetnt5);

    }
    public void mobikwik(View view){
        Intent browserInetnt6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mobikwik.com/"));
        startActivity(browserInetnt6);

    }
}

