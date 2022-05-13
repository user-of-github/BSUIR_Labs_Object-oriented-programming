import Entities.CharacterUnits.Dwarf;
import Entities.CharacterUnits.Elf;
import Entities.Squad;


public class TheBattleOfFiveArmies {
    public static void main(String[] args) {
        var dwarvesSquad = TheBattleOfFiveArmies.getDwarvesSquad();
        dwarvesSquad.move(1, 1);
        System.out.println();

        var elvesSquad = TheBattleOfFiveArmies.getElvesSquad();
        elvesSquad.move(-1, -1);
        System.out.println();

        var elvesAndDwarfes = new Squad();
        elvesAndDwarfes.addUnitToSquad(elvesSquad);
        elvesAndDwarfes.addUnitToSquad(dwarvesSquad);

        elvesAndDwarfes.move(10, 10);
    }

    private static Squad getDwarvesSquad() {
        var torin = new Dwarf("Torin");
        var train = new Dwarf("Train");
        var gloin = new Dwarf("Gloin");

        var squad = new Squad();
        squad.addUnitToSquad(gloin);
        squad.addUnitToSquad(train);
        squad.addUnitToSquad(torin);

        return squad;
    }

    private static Squad getElvesSquad() {
        var legolas = new Elf("Legolas");
        var tauriel = new Elf("Tauriel");
        var tranduil = new Elf("Tranduil");

        var squad = new Squad();
        squad.addUnitToSquad(legolas);
        squad.addUnitToSquad(tauriel);
        squad.addUnitToSquad(tranduil);

        return squad;
    }
}
