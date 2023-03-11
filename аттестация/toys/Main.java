package toys;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ToyCollection toyCollection = new ToyCollection();
        // добавляем игрушки
        toyCollection.add(new Toy(1, "Мяч", 2, 0.5));
        toyCollection.add(new Toy(2, "Кукла", 4, 0.3));
        toyCollection.add(new Toy(3, "Машинка", 1, 0.2));

        // разыгрываем призы
        ArrayList<Toy> prizes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Toy toy = toyCollection.getRandom();
            if (toy == null){
                System.out.println("Призов больше нет");
                break;
            }

            System.out.println("Приз: " + toy.getName());
            prizes.add(toy);
        }

        ToyWriter.writePrizesToFile(prizes);
    }
}
