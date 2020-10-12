package model;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

public class Name {

    @SerializedName("first_name")
    private String  first_name;

    @SerializedName("last_name")
    private String  last_name;

    @SerializedName("image")
    private String  image;


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
