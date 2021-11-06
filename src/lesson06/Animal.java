package lesson06;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Animal {
    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name, int maxSpeed) {
        this.name = name;
        maxSpeed=new SecureRandom().nextInt(maxSpeed);
        this.speed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int maxSpeed) {
        maxSpeed=new SecureRandom().nextInt(maxSpeed);
        this.speed = maxSpeed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
