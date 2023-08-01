package com.sabtoharyadi.uas_2021202245;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public TextView namaTextView, deskripsiTextView, tglWaktuTextView, suhuTextView;

    public CuacaViewHolder (View itemView) {
        super(itemView);

        namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = (TextView)itemView.findViewById(R.id.deskripsiTextView);
        tglWaktuTextView = (TextView)itemView.findViewById(R.id.tglWaktuTextView);
        suhuTextView = (TextView)itemView.findViewById(R.id.suhuTextView);
    }
}
