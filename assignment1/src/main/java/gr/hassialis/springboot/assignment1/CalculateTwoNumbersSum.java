package gr.hassialis.springboot.assignment1;

import org.springframework.stereotype.Component;

@Component
public class CalculateTwoNumbersSum {

    private int X, Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getSum() {
        return X + Y;
    }

}
