package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Postingan implements Parcelable {

    private Integer image2;
    private String username;
    private Integer image;
    private String desc;

    public Postingan(Integer image2, String username, Integer image, String desc) {
        this.image2 = image2;
        this.username = username;
        this.image = image;
        this.desc = desc;
    }

    public Integer getImage2() {
        return image2;
    }
    public void setImage2(Integer image2) {
        this.image2 = image2;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getImage() {
        return image;
    }
    public void setImage(Integer image) {
        this.image = image;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected Postingan(Parcel in) {
        username=in.readString();
        desc=in.readString();
        if(in.readByte()==0){
            image=null;
        }else{
            image=in.readInt();
        }
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int flags) {
        parcel.writeString(username);
        parcel.writeString(desc);
        if(image==null){
            parcel.writeByte((byte)0);
        }else{
            parcel.writeByte((byte)1);
            parcel.writeInt(image);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public static final Creator<Postingan> CREATOR = new Creator<Postingan>() {
        @Override
        public Postingan createFromParcel(Parcel in) {
            return new Postingan(in);
        }

        @Override
        public Postingan[] newArray(int size) {
            return new Postingan[size];
        }
    };
}
