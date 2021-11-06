package lesson09;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Tiger implements IAnimal {
    private int speed=-1;
    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(100);
        }
        return this.speed;
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}

