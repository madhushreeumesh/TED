package com.fugenx.ted.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.fugenx.ted.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView=(TextView)findViewById(R.id.tv_signup);
        textView.setOnClickListener(this);
        TextView textView1=(TextView)findViewById(R.id.tv_text);
        textView1.setOnClickListener(this);
    }


    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_signup :
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(LoginActivity.this);
                alertDialog.setTitle(R.string.create_account);
                alertDialog.setMessage(R.string.alert_msg);
                alertDialog.setPositiveButton(R.string.ted_com, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {

                        Toast.makeText(getApplicationContext(), R.string.cancel, Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                alertDialog.show();

        case R.id.tv_text :

        AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(LoginActivity.this);
        alertDialog1.setTitle(R.string.pass);
        alertDialog1.setMessage(R.string.com);
        alertDialog1.setPositiveButton(R.string.ted_com, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {

                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog1.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        alertDialog1.show();
    }

    }
}
