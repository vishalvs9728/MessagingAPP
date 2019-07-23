package com.example.vishalsingh.textmessenger;

import android.app.ActionBar;
import android.app.Activity;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    TextView tv;
    Button send,exit;
    EditText Mobile,msg;
    private ActionBar supportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mobile=(EditText)findViewById(R.id.ed1);
        msg=(EditText)findViewById(R.id.ed2);
        tv=(TextView)findViewById(R.id.t1);
        send=(Button)findViewById(R.id.b1);
        send.setOnClickListener(this);
        Mobile.addTextChangedListener(sndms);
        msg.addTextChangedListener(sndms);
        exit=(Button)findViewById(R.id.bt2);
        exit.setOnClickListener(this);




}
        private TextWatcher sndms=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String mo = Mobile.getText().toString();
                String ss = msg.getText().toString();

                send.setEnabled(!mo.isEmpty() && !ss.isEmpty());
                if(!mo.isEmpty() && !ss.isEmpty())
                {
                    send.setText("send");
                }
                if(mo.isEmpty() || ss.isEmpty())
                {
                    send.setText(null);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };




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


    @Override
    public void onClick(View v) {
        switch (v.getId())

        {case R.id.b1:
            String mo = Mobile.getText().toString();
            String s = msg.getText().toString();
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            PendingIntent p = PendingIntent.getActivity(getApplicationContext(), 0, i, 0);

            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(mo, null, s, p, null);
            Toast.makeText(MainActivity.this, "Sent message", Toast.LENGTH_SHORT).show();
            finish();
            break;
            case R.id.bt2:
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;
        }
    }


    }





