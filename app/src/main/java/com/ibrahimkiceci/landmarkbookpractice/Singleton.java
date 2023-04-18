package com.ibrahimkiceci.landmarkbookpractice;

public class Singleton {

    private LandMark selectedLandmark;
    private static Singleton singleton;

    private Singleton() {

    }

    public LandMark getSelectedLandmark() {
        return selectedLandmark;
    }

    public void setChosenLandmark(LandMark selectedLandmark) {
        this.selectedLandmark = selectedLandmark;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;

    }



}
