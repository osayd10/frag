package com.example.fragments;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User implements Parcelable {

    private String mName;
    private int mAge;
    private int mId;

    public User(String Name, int Age, int Id) {
        mName = Name;
        mAge = Age;
        mId = Id;
    }

    public User(Parcel parcel) {
        mName = parcel.readString();
        mAge = parcel.readInt();
        mId = parcel.readInt();
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

    @NonNull
    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public int getId() {
        return mId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeInt(mAge);
        parcel.writeInt(mId);
    }
}
