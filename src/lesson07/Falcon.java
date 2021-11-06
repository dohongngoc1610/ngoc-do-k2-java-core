package lesson07;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Falcon extends Animal {
    private int speed=-1;
    @Override
    String getName() {
        return "Falcon";
    }

    @Override
    int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(150);
        }
        return this.speed;
    }

    @Override
    boolean isFlyAble() {
        return true;
    }
}

