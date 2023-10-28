package com.example.futureahead.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futureahead.R;

import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedViewHolder>{

    ArrayList<com.example.futureahead.HelperClasses.HomeAdapter.MostViewedViewHolder>mostViewedLocations;

    public MostViewedAdapter(ArrayList<com.example.futureahead.HelperClasses.HomeAdapter.MostViewedViewHolder> mostViewedLocations){
        this.mostViewedLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design, parent,false);
        MostViewedViewHolder mostViewedViewHolder = new MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        com.example.futureahead.HelperClasses.HomeAdapter.MostViewedViewHolder helperClass = mostViewedLocations.get(position);
        holder.title.setText(helperClass.getTitle());
        holder.descriptions.setText(helperClass.getDescriptions());

    }


    @Override
    public int getItemCount() {
        return mostViewedLocations.size();
    }

    public static class MostViewedViewHolder extends RecyclerView.ViewHolder{

        TextView title,descriptions;

        public MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.mv_title);
            descriptions = itemView.findViewById(R.id.mv_desc);
        }
    }
}
