package Entities.CharacterUnits;

import Entities.Position;

import java.util.Random;


public abstract class AbstractCharacter {
    private static final int RangeForRandomPosition = 100;
    protected Position position;
    protected String name;

    public AbstractCharacter(String name) {
        this.name = name;
        this.position = new Position(
                new Random().nextInt(AbstractCharacter.RangeForRandomPosition),
                new Random().nextInt(AbstractCharacter.RangeForRandomPosition)
        );
    }
}
