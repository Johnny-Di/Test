package org.example;

public class Tank {
    public Tank() {
    }

    public Tank(int xPosition, int yPosition) {
        this.x = xPosition;
        this.y = yPosition;
    }

    public Tank(int xPosition, int yPosition, int fuel) {
        this.x = xPosition;
        this.y = yPosition;
        this.fuel = fuel;
    }

    int x, y;
    int fuel;

    void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    void goForward(int position) {
        if (position < 0 && -position > -fuel) {
            position = -fuel;
        }
        else if (position > fuel) {
            position = fuel;
        }
        x += position;
    }

    void goBackward(int position) {
        goForward(-position);
    }
}