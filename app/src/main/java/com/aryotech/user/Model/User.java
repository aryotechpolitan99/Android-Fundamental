package com.aryotech.user.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    String nama;
    String userName;
    int avatar;
    String company;
    String location;
    String repository;
    String follower;
    String following;

    public User(String nama, String userName, int avatar, String company, String location, String repository, String follower, String following) {
        this.nama = nama;
        this.userName = userName;
        this.avatar = avatar;
        this.company = company;
        this.location = location;
        this.repository = repository;
        this.follower = follower;
        this.following = following;
    }

    protected User(Parcel in) {
        nama = in.readString();
        userName = in.readString();
        avatar = in.readInt();
        company = in.readString();
        location = in.readString();
        repository = in.readString();
        follower = in.readString();
        following = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(userName);
        dest.writeInt(avatar);
        dest.writeString(company);
        dest.writeString(location);
        dest.writeString(repository);
        dest.writeString(follower);
        dest.writeString(following);
    }
}
