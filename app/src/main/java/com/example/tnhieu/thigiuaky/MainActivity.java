package com.example.tnhieu.thigiuaky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2 ;
    private Button bt_cong;
    private ListView lv;
    ArrayList<String> x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x= new ArrayList<>();
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        bt_cong=(Button)findViewById(R.id.bt_cong);
        lv= (ListView)findViewById(R.id.lv);
    }
    public void xuly(View view)
    {
        final ArrayAdapter  maray = new ArrayAdapter(this, android.R.layout.simple_list_item_1, x);
        lv.setAdapter(maray);
        String t1= edt1.getText().toString();
        String t2= edt2.getText().toString();
        int x1= Integer.parseInt(t1);
        int x2= Integer.parseInt(t2);
        int t=x1+x2;
        String k =t1+"+"+t2+"="+t;
        x.add(k);

    }
}
