import Builder.Director;
import Builder.HouseBuilder;
import House.House;


public class HouseAgency {
    public static void main(String[] args) {
        // как бы это было для каждого объекта по умолчанию
        // паттерн "никакой"
        System.out.println(new House(10, 3, 7, false, false, 1));


        // теперь можно использовать builder
        // паттерн "строитель"
        var builder = new HouseBuilder();
        System.out.println(builder.setDoorsCount(3).setRoomsCount(7).getHouse());


        // или можно использовать "директора"
        // в нём можно создавать готовые конфигурации/сеты для строительства каких-то фундаментальных вещей
        // или просто полностью готовые сеты полностью для всего House мутить
        // паттерн "строитель (уже с директором)"
        var director = new Director();
        director.buildBudgetHousing(builder);
        builder.addGarage(); // разумеется, можно дополнительно после базового сета ещё что-то дополнить
        System.out.println(builder.getHouse());
    }
}
