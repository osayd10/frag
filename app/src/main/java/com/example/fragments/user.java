package com.example.fragments;

import android.os.Parcel;
import android.os.Parcelable;

public class user implements Parcelable {


    public static final Creator<user> CREATOR = new Creator<user>() {
        @Override
        public user createFromParcel(Parcel in) {
            return new user(in);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };
    private String name;
    private int age;
    private int id;

    public user(String Name,int Age,int Id){
        name=Name;
        age=Age;
        id=Id;

    }
    public String getname(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
    public int getid(){
        return this.id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.age);
        parcel.writeInt(this.id);
    }
    public user(Parcel parcel) {
        name = parcel.readString();
        age = parcel.readInt();
        id=parcel.readInt();
    }

}
