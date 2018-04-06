package com.dotnet;

import java.awt.*;

public class DrawResource   {
    private Image img;
    private final Position p;
    private int width;
    private int height;
    public DrawResource(Image image, Position p, int width, int height){
        img=image;
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public Position getPoint() {
        return p;
    }

    public Image getImg() {
        return img;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
