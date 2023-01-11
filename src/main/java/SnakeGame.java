import java.awt.*;
import java.util.Arrays;

public class SnakeGame {

    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fonts));
        new GameFrame();
    }

}
