package tankGame.game;

import java.awt.image.BufferedImage;

public class UnbreakableWall extends BackgoundObject{
    public UnbreakableWall(BufferedImage img, int x, int y) {
        super(img, x, y);
        setPassby(false);
        visible = true;
    }
}
