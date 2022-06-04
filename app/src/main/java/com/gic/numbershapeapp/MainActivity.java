package com.gic.numbershapeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public class app_shape {



        int uen;
        int uhn;
        public String trinum(){

            int cv=1;
            int tn=1;


            while(tn < uen){
                cv++;
                tn=tn+cv;

            }
            String s;
            if(uen==tn){
                return s="WOW!You found a traingular number!";

            }
            else{
                s="It's just a normal number.";
                return s;
            }

        }
        public String squnum(){
            int ps=1;
            int v=1;
            String s;
            while(ps < uhn){
                v=v+2;
                ps=ps+v;
            }
            if(uhn==ps){
                s="WOW!You found a Square number!";
                return s;
            }
            else{
                s="It's just a normal number.";
                return s;
            }
        }


    }
    public void checker(View view){
        app_shape usn = new app_shape();
        EditText utrino=(EditText) findViewById(R.id.tnn);
        EditText ustuno=(EditText) findViewById(R.id.snn);
        EditText usquno=(EditText) findViewById(R.id.tsnn);

        if(usquno.getText().toString().isEmpty() && ustuno.getText().toString().isEmpty() ){
            usquno.setEnabled(false);
            ustuno.setEnabled(false);
            usn.uen= Integer.parseInt(utrino.getText().toString());


            Toast.makeText(this, usn.trinum(), Toast.LENGTH_LONG).show();

        }
        else if(utrino.getText().toString().isEmpty() && usquno.getText().toString().isEmpty()){
            utrino.setEnabled(false);
            ustuno.setEnabled(false);

            usn.uhn= Integer.parseInt(ustuno.getText().toString());

            Toast.makeText(this, usn.squnum(), Toast.LENGTH_LONG).show();

        }
        else if(utrino.getText().toString().isEmpty() && ustuno.getText().toString().isEmpty()){
            usquno.setEnabled(false);
            utrino.setEnabled(false);

            usn.uen= Integer.parseInt(usquno.getText().toString());
            usn.uhn= Integer.parseInt(usquno.getText().toString());


            String r=usn.trinum();
            String r1=usn.squnum();

            Log.i("info", usn.trinum() + usn.squnum());
            if(r =="WOW!You found a traingular number!" && r1 == "WOW!You found a Square number!"){


                Toast.makeText(this, "OMG! THIS NUMBER IS BOTH PERFECT AND TRIANGULAR!", Toast.LENGTH_LONG).show();
            }

            else if(r =="It's just a normal number." && r1 == "WOW!You found a Square number!"){

                Toast.makeText(this, "You got a square number but not a triangular number!", Toast.LENGTH_LONG).show();

            }
            else if(r =="WOW!You found a traingular number!" && r1 == "It's just a normal number."){


                Toast.makeText(this, "You got a triangular number but not a square number!", Toast.LENGTH_LONG).show();

            }
            else if(r =="It's just a normal number." && r1 == "It's just a normal number."){


                Toast.makeText(this, "This is a simple number! Bring some cool number!", Toast.LENGTH_LONG).show();

            }
        }

    }
    public void reset(View view){
        EditText utrino=(EditText) findViewById(R.id.tnn);
        EditText usquno=(EditText) findViewById(R.id.snn);
        EditText ustuno=(EditText) findViewById(R.id.tsnn);

        usquno.setEnabled(true);
        ustuno.setEnabled(true);
        utrino.setEnabled(true);

        usquno.setText("");
        ustuno.setText("");
        utrino.setText("");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}