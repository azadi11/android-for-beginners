package com.sherpastudio.buildingapplication.model;

import android.util.Log;

public class Castle extends Building {

    int numberOfTowers;
    public Castle(String name, int doors, int windows,int towers,int numberOfTowers) {
        super(name, doors, windows);
        this.numberOfTowers=numberOfTowers;
    }




    @Override
    public String getDescription(){
       String getIt= super.getDescription();
        return getIt+numberOfTowers+"towers";
    }

    @Override
    public void build() {
Log.d("Castle","lets build a castle");
    }
}
