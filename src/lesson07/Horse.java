package lesson07;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Horse extends Animal {
    private int speed=-1;

    @Override
    String getName() {
        return "Horse";
    }

    public void setSpeed() {
       this.speed = new SecureRandom().nextInt(75);
    }

    @Override
    int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(75);
        }
        return this.speed;
    }

    @Override
    boolean isFlyAble() {
        return false;
    }
}



