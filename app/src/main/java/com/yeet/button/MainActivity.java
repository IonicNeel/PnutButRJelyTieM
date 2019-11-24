package com.yeet.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.LineNumberReader;

import static com.yeet.button.R.string.pnausts;

public class MainActivity extends AppCompatActivity {
    int buttonclicks = 0;
    TextView Textedit;
    EditText NAME;
    Button buttontwo, taostb;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NAME = findViewById(R.id.et1);

        s = NAME.getText().toString();


        Button buttonOne = findViewById(R.id.button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    Intent activity1 = new Intent(getApplicationContext(), hello.class);
                    startActivity(activity1);


            }
        });
        Button buttonThree = findViewById(R.id.button3);
        Textedit = findViewById(R.id.txt1);


        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicks++;
                Textedit.setText("Clicks"+buttonclicks);
            }
        });

        taostb = findViewById(R.id.btoast);

        taostb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();

                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,"pfskfskfksfssdkjjfdksjfksdbsdjfskdfksdbfksdjbbbbbbbbbbbbbbbbbbbb", Toast.LENGTH_LONG);
                toast.show();

            }
        });















    }
}
