package gamearena;

import java.awt.*;

public abstract class Drawable {

    int layer;

    public int getLayer() {
        return layer;
    }

    abstract void draw(Graphics2D graphics);

}
