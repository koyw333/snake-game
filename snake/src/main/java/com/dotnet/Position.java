package com.dotnet;

public class Position {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setPosition(Position position) {
        x = position.getX();
        y = position.getY();
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void left(int term) {
        x = x - term;
    }

    public void right(int term) {
        x = x + term;
    }

    public void up(int term) {
        y = y - term;
    }

    public void down(int term) {
        y = y + term;
    }
}
