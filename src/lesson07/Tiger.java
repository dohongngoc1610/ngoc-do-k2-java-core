package lesson07;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Tiger extends Animal {
    private int speed=-1;
    @Override
    String getName() {
        return "Tiger";
    }

    @Override
    int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(100);
        }
        return this.speed;
    }

    @Override
    boolean isFlyAble() {
        return false;
    }
}

