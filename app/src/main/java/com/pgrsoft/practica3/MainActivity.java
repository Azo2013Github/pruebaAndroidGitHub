package com.pgrsoft.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Date date;
    static {
        Log.d("INFO", "METHOD STATIC EXECUTE");
    }

    public MainActivity(){Log.d("INFO", "INTO METHOD CONTRUCT");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("INFO", "Method onCreate To Start *****");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display);
        date = new Date();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("INFO", "La APP esta en pause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*long millisegundos = (new Date()).getTime() - date.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(millisegundos/1000).append(": millisegundos");
        textView.setText(sb.toString());*/
    }

    //hacer cualquier cosa con el button izquierdo
    public void actionButtonLeft(View view) throws ParseException {
        Log.d("INFO","CLICADO SOBRE BUTTON IZQUIERDO");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String converts = "16/11/1983";
        date = sdf.parse(converts);
        textView.setText(String.valueOf(date));

    }
}
