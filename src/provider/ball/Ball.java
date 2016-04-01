package provider.ball;

import provider.Color;

public class Ball {
    private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public boolean isTheSameColor(Color color) {
        return color.equals(this.color);
    }
}
