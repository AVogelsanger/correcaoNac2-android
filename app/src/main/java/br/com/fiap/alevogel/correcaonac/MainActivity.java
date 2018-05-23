    package br.com.fiap.alevogel.correcaonac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkLanche1;
    CheckBox chkLanche2;
    CheckBox chkLanche3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chkLanche1=findViewById(R.id.chkLanche1);
        chkLanche2=findViewById(R.id.chkLanche2);
        chkLanche3=findViewById(R.id.chkLanche3);


    }


    public void comprar(View view) {
        double total = 0.0;

        if (chkLanche1.isChecked()){
            total += 15;
        }
        if (chkLanche2.isChecked()){
            total += 15;
        }
        if (chkLanche3.isChecked()){
            total += 15;
        }
        Toast.makeText(this, getString(R.string.toastmsg) + total, Toast.LENGTH_SHORT).show();
    }
}
