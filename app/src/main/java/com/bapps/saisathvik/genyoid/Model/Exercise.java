package com.bapps.saisathvik.genyoid.Model;

/**
 * Created by Sai Sathvik on 12/27/2017.
 */

public class Exercise {

     private int image_id;
     private String name;

    public Exercise(int image_id, String name) {

        this.image_id = image_id;
        this.name = name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
