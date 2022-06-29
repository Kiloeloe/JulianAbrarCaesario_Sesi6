package com.severianfw.training_mobile;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.severianfw.training_mobile.databinding.ItemNbaTeamBinding;

import java.util.List;

public class NbaTeamAdapter extends RecyclerView.Adapter<NbaTeamAdapter.ViewHolder> {

    private final List<String> nbaTeamItems;

    public NbaTeamAdapter(List<String> nbaTeamItems, List<String> nbaTeamItems1){

        this.nbaTeamItems = nbaTeamItems;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNbaTeamBinding binding = ItemNbaTeamBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(nbaTeamItems.get(position));
    }

    @Override
    public int getItemCount() {
        return nbaTeamItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        ItemNbaTeamBinding binding;

        public ViewHolder(@NonNull ItemNbaTeamBinding binding) {
            super(binding.getRoot());
        }

        void bind(String nbaTeamItem){
            binding.tvName.setText(nbaTeamItem);
        }
    }
}
