package config;

import java.text.DecimalFormat;

public class StaticValues {

    public static final DecimalFormat df = new DecimalFormat("0.0");
    public static final String APP_NAME = "Haunted Valley";
    public static final int APP_HEIGHT = 1000;
    public static final int APP_WIDTH = 1000;
    public static final int ACTIVITY_PANE_HEIGHT = 200;
    public static final int SPRITE_WIDTH = 32;
    public static final int SPRITE_HEIGHT = 48;
    public static final int TILE_SIZE = 32;
    public static final double WALK_SPEED = SPRITE_WIDTH; //px per sec

    public static final class Colors{
        public static final String BLACK = "#000000";
        public static final String WHITE = "#ffffff";
    }

    //Login page
    public static final String USERNAME_TF_HINT = "Account Hex Number";
    public static final String LOGIN_BTN_TEXT = "Enter Haunted Valley";

    //Server connection info
    public static final String SERVER_HOST = "67.166.25.40";
    public static final int SERVER_PORT = 3000;
    public static final int CLIENT_BROADCAST_RATE = 15;
}
