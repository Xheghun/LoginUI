package com.xheghun.loginui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.loginui.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class UIRecyclerAdapter extends RecyclerView.Adapter<UIRecyclerAdapter.ViewHolder> {

    List<UIDetails> list;
    Context mContext;

    public UIRecyclerAdapter(List<UIDetails> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc_card_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (list != null) {
            UIDetails uiDetails = list.get(position);
            holder.title.setText(uiDetails.title);
            Glide.with(mContext).load(uiDetails.getLoginImg()).into(holder.login_img);
            Glide.with(mContext).load(uiDetails.getSignUpImg()).into(holder.sign_up_img);
            holder.materialCardView.setOnClickListener(v -> mContext.startActivity(new Intent(mContext, uiDetails.activity)));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView title;
        public final ImageView login_img;
        public final ImageView sign_up_img;
        final MaterialCardView materialCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(androidx.core.R.id.title);
            login_img = itemView.findViewById(R.id.login_img);
            sign_up_img = itemView.findViewById(R.id.sign_up_img);
            materialCardView = itemView.findViewById(R.id.card);

        }
    }
}
