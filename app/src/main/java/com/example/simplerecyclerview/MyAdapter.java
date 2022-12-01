package com.example.simplerecyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

     public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
       private String[] mDataset;
       public static class MyViewHolder extends RecyclerView.ViewHolder {
           public TextView textView;

           public MyViewHolder(View v) {
               super(v);
               //textView = v.findViewById(R.id.tvFirstNameRow);
           }
       }

         @Override
         public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
         {

         }

     }




