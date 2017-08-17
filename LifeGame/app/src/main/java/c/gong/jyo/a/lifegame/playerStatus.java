package c.gong.jyo.a.lifegame;

/**
 * Created by derba on 2017-08-17.
 */

public class playerStatus
{
    float money, hp, weight, attack, intellect, appeal, luck, maxHp;

    public playerStatus()
    {
        money = 100000;
        maxHp = 100;
        hp = 100;
        weight = 70;
        attack = 0;
        intellect = 0;
        appeal = 0;
        luck = 0;
    }
    public playerStatus( float []a ) {
        this.money = a[1];
        this.hp = a[2];
        this.maxHp = a[3];
        this.weight = a[4];
        this.attack = a[5];
        this.intellect = a[6];
        this.appeal = a[7];
        this.luck = a[8];
    }

    public float getMoney() { return money; }
    public float getHp() { return hp; }
    public float getMaxHp() { return maxHp; }
    public float getWeight() { return weight; }
    public float getAttack() { return attack; }
    public float getIntellect() { return intellect; }
    public float getAppeal() { return appeal; }
    public float getLuck() { return luck; }
    public float[] getEverything()
    {
        float []a = { money, hp, maxHp, weight, attack, intellect, appeal, luck };
        return a;
    }

    public void setMoney ( float money ) { this.money = money; }
    public void setHp ( float hp ) { this.hp = hp; }
    public void setMaxHp ( float maxHp ) { this.maxHp = maxHp; }
    public void setWeight ( float weight ) { this.weight = weight; }
    public void setAttack ( float attack ) { this.attack = attack; }
    public void setIntellect ( float intellect ) { this.intellect = intellect; }
    public void setAppeal ( float appeal ) { this.appeal = appeal; }
    public void setLuck ( float luck ) { this.luck = luck; }
}
