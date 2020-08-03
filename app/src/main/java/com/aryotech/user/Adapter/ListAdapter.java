package com.aryotech.user.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aryotech.user.Model.User;
import com.aryotech.user.Model.UserDetail;
import com.aryotech.user.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private ArrayList<User> listUser;
    private Context context;

    public ListAdapter(ArrayList<User> listUser){

        this.listUser = listUser;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_user, parent, false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {

        User user = listUser.get(position);
        Glide.with(holder.itemView.getContext())
                .load(user.getAvatar())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgAvatar);
        holder.tvName.setText(user.getNama());
        holder.tvReposit.setText(user.getRepository());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, UserDetail.class);
                intent.putExtra("detail", listUser.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listUser.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgUser, imgAvatar;
        TextView  tvUsername, tvName, tvCompany, tvLoc, tvReposit, tvFollower, tvFollowing;
        LinearLayout linearLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.img_detail_user);
            imgAvatar = itemView.findViewById(R.id.img_item_avatar);
            tvUsername = itemView.findViewById(R.id.tv_detail_username);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvCompany = itemView.findViewById(R.id.tv_value_company);
            tvLoc = itemView.findViewById(R.id.tv_value_location);
            tvReposit = itemView.findViewById(R.id.tv_item_repository);
            tvFollower = itemView.findViewById(R.id.tv_value_follower);
            tvFollowing = itemView.findViewById(R.id.tv_value_following);
            linearLayout = itemView.findViewById(R.id.linear_layout);

        }
    }
}
