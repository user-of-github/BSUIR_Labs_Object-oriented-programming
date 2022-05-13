package Entities;

import java.util.ArrayList;
import java.util.List;


public class Squad implements ICharacter {
    protected List<ICharacter> entities = new ArrayList<>();

    public void addUnitToSquad(ICharacter unit) {
        this.entities.add(unit);
    }

    public void removeUnit(ICharacter unit) {
        this.entities.remove(unit);
    }

    @Override
    public void move(int distanceX, int distanceY) {
        for (var unit : this.entities)
            unit.move(distanceX, distanceY);
    }
}
