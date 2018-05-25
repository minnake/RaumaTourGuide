package com.example.keinonen.raumatourguide;

public class Guide{

    private int headerName;

    private int infoText;

    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Guide(int ListHeaderName, int ListInfoText, int ListImageResourceId) {
        headerName = ListHeaderName;
        infoText = ListInfoText;
        imageResourceId = ListImageResourceId;
    }

    public Guide(int ListHeaderName, int ListInfoText) {
        headerName = ListHeaderName;
        infoText = ListInfoText;
    }

    public int getHeaderName() {
        return headerName;
    }

    public int getInfoText() {
        return infoText;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }


}
