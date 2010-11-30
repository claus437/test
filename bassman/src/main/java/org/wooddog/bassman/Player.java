package org.wooddog.bassman;

/**
 * Created by IntelliJ IDEA.
 * User: dencbr
 * Date: 30-11-2010
 * Time: 15:35:07
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private static final Player INSTANCE = new Player();

    public static final Player getInstance() {
        return INSTANCE;
    }

    public void play(Node node) {
        
    }
}
