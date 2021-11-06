package lesson06;

import java.security.SecureRandom;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class NewAnimal {

    private final String name;
    private final int speed;
    private final boolean flyAble;

    private NewAnimal(Builder builder) {
        name=builder.name;
        speed=builder.speed;
        flyAble=builder.flyAble;
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyAble;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int maxSpeed) {
            this.speed =new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder setFlyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public NewAnimal build(){
            return new NewAnimal(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }
}
