package Entities.CharacterUnits;

import Entities.ICharacter;


public class Human extends AbstractCharacter implements ICharacter {
    public Human(String name) {
        super(name);
    }

    @Override
    public void move(int distanceX, int distanceY) {
        System.out.printf("I am human %s. ", this.name);
        System.out.printf("Moving from %s", this.position);
        this.position.x += distanceX;
        this.position.y += distanceY;
        System.out.printf(" to %s\n", this.position);
    }
}
