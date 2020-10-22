package com.example.semesterproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter <myadapter.viewhoholder> {

    String[] data;
    public myadapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public viewhoholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_item , parent , false);
        return new viewhoholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhoholder holder, int position) {
        String[] split = data[position].split("//");
        holder.item1.setText(split[0]);
        holder.item2.setText(split[1]);
        holder.item3.setText(split[2]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewhoholder extends RecyclerView.ViewHolder{
        TextView item1 , item2 , item3;
        public viewhoholder(@NonNull View itemView) {
            super(itemView);
            item1 = itemView.findViewById(R.id.item1);
            item2 = itemView.findViewById(R.id.item2);
            item3 = itemView.findViewById(R.id.item3);
        }
    }
}
