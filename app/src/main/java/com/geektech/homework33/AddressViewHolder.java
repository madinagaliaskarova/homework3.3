package com.geektech.homework33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView addressName;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        addressName = itemView.findViewById(R.id.address);
    }

    public void bind(String address) {
        addressName.setText(address);
    }
}
