package com.aryotech.user.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.aryotech.user.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class UserDetail extends AppCompatActivity {

    TextView tvUserNameDetail, tvNameDetail, tvRepositoryDetail, tvLocDetail,tvCompanyDetail, tvFollowerDetail, tvFollowingDetail;
    ImageView imgUserDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        tvNameDetail = findViewById(R.id.tv_detail_name);
        tvUserNameDetail = findViewById(R.id.tv_detail_username);
        tvCompanyDetail = findViewById(R.id.tv_value_company);
        tvLocDetail = findViewById(R.id.tv_value_location);
        tvFollowerDetail = findViewById(R.id.tv_value_follower);
        tvFollowingDetail = findViewById(R.id.tv_value_following);
        tvRepositoryDetail = findViewById(R.id.tv_value_repository);
        imgUserDetail = findViewById(R.id.img_detail_user);

        User user = getIntent().getParcelableExtra("detail");

        tvNameDetail.setText(""+user.getNama());
        tvUserNameDetail.setText(""+user.getUserName());
        tvCompanyDetail.setText(": "+user.getCompany());
        tvLocDetail.setText(": "+user.getLocation());
        tvRepositoryDetail.setText(": "+user.getRepository());
        tvFollowerDetail.setText(""+user.getFollower());
        tvFollowingDetail.setText(""+user.getFollowing());
        Glide.with(this)
                .load(user.getAvatar())
                .apply(new RequestOptions().override(150,150))
                .into(this.imgUserDetail);

        getSupportActionBar().setTitle("Detail User");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
