package developersudhanshu.com.tictactoe;

import android.content.Context;
import android.widget.Button;

/**
 * Created by Sudhanshu on 14-05-2018.
 */

public class MyButton extends Button {

    private int player = 0;

    public MyButton(Context context) {
        super(context);
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
