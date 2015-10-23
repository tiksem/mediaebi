package com.tiksem.media.data;

import android.os.Parcel;

public class Artist extends ArtCollection{
    private Artist(int id, boolean local) {
        super(id, local);
    }

    private Artist(boolean local) {
        super(local);
    }

    public static Artist createLocalArtist(int id){
        return new Artist(id, true);
    }

    public static Artist createInternetArtist(int id){
        return new Artist(id, false);
    }

    public static Artist createLocalArtist(){
        return new Artist(true);
    }

    public static Artist createInternetArtist(){
        return new Artist(false);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    protected Artist(Parcel in) {
        super(in);
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        public Artist createFromParcel(Parcel source) {
            return new Artist(source);
        }

        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };
}
