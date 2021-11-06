package lesson09;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 11/05/2021
 */
public class Horse implements IAnimal{
    private int speed=-1;
    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(75);
        }
        return this.speed;
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}
