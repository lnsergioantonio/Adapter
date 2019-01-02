package com.example.sergio.cf_adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterStudent extends ArrayAdapter {
    private Activity context;
    ArrayList<Student> students;
    private  int resourse;

    public AdapterStudent(@NonNull Activity context, int resource, ArrayList<Student> students) {
        super(context, resource, students);
        this.context=context;
        this.resourse=resource;
        this.students=students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(view == null){
            if(context!=null){
                view = context.getLayoutInflater().inflate(resourse,null);
                holder.txtItem = view.findViewById(R.id.txtItem);
                view.setTag(holder);
            }
        }else{
            holder= (ViewHolder) view.getTag();
        }

        Student student = students.get(position);
        holder.txtItem.setText(student.getName());
        if(!student.isPass()){
            holder.txtItem.setBackgroundColor(Color.RED);
        }else{}
        return view;
    }
    class ViewHolder{
        private TextView txtItem;

    }
}
