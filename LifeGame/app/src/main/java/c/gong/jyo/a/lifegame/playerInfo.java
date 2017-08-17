package c.gong.jyo.a.lifegame;

import java.util.HashMap;

/**
 * Created by derba on 2017-08-17.
 */

public class playerInfo
{
    static HashMap<String, Float> playerStatus;
    static HashMap<String, Integer> playerItem;

    public static void init()
    {
        playerStatus = new HashMap<>();

        playerStatus.put("hp", (float)100 );
        playerStatus.put("weight", (float)70 );
        playerStatus.put("attack", (float)0 );
        playerStatus.put("intellect", (float)0 );
        playerStatus.put("appeal", (float)0 );
        playerStatus.put("luck", (float)0 );
        playerStatus.put("maxHP", (float)100 );

        playerItem = new HashMap<>();

        playerItem.put("money", 0 );
        playerItem.put("mirror", 0 );
        playerItem.put("book", 0 );
        playerItem.put("ramen", 0 );
        playerItem.put("hanoo", 0 );

        //playerItem.put();
    }

    public static Float getPlayerStatus( String statusName ) { return playerStatus.get(statusName); }
    public static Integer getPlayerItem( String itemName ) { return playerItem.get(itemName); }
    public static void setPlayerStatus( String statusName, Float status ) { playerStatus.put(statusName, playerStatus.get(statusName) + status ); }
    public static void setPlayerItem( String itemName, Integer status ) { playerItem.put(itemName, playerItem.get(itemName) + status ); }
}
