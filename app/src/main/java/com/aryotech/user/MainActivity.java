package com.aryotech.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aryotech.user.Adapter.ListAdapter;
import com.aryotech.user.Model.User;
import com.aryotech.user.Model.UserData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListUser;
    ArrayList<User> userArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListUser = findViewById(R.id.rv_user);
        rvListUser.setHasFixedSize(true);

        userArrayList.addAll(UserData.getListUser());
        showRecyclerList();
    }

    private void showRecyclerList(){

        rvListUser.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(userArrayList);
        rvListUser.setAdapter(listAdapter);
    }
}
