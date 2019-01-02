package com.example.sergio.cf_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapter<Student> adapter = new ArrayAdapter<Student>(this,R.layout.item_adapter,R.id.txtItem,Student.getStudents());
        AdapterStudent adapter = new AdapterStudent(this,R.layout.item_adapter,Student.getStudents());
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
