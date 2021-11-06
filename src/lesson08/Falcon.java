package lesson08;

import lesson07.Animal;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Falcon implements IAnimal {
    private int speed=-1;
    @Override
    public String getName() {
        return "Falcon";
    }

    @Override
    public int getSpeed() {
        if(this.speed==-1)
        {
            this.speed=new SecureRandom().nextInt(150);
        }
        return this.speed;
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }
}

