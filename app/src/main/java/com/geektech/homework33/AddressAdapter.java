package com.geektech.homework33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<AddressViewHolder> {
    private ArrayList<String> address = new ArrayList<>();


    public AddressAdapter(ArrayList<String> address) {
        this.address = address;
    }

    @NonNull
    @Override
    public AddressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull AddressViewHolder holder, int position) {
        holder.bind(address.get(position));

    }

    @Override
    public int getItemCount() {
        return address.size();
    }
}
