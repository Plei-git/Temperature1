package com.swufe.temperature;

import android.app.Notification;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.showText);
        inp = (EditText) findViewById(R.id.inpText);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        //btn.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //public void onClick(View v) {
              //  Log.i("main","onClick called....");
              //      String str = inp.getText().toString();

        //out.setText("answer" + str);
         //   }
        //});
    }

    @Override
    public void onClick(View v) {
        Log.i("click","onClick msg....");
        //TextView tv = (TextView) findViewById(R.id.showText);
        //EditText inp = (EditText) findViewById(R.id.inpText);
        String str = inp.getText().toString();
        int num = Integer.parseInt(str);
        if(num <= -273){
            out.setText("请输入合适的温度");
        }
        else {
            double hua = num * 1.8 + 32;
            out.setText(String.valueOf(hua + "华氏度"));
        }
    }
}
