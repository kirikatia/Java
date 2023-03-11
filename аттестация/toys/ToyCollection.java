package toys;
import java.util.HashMap;

public class ToyCollection {
    private HashMap<Integer, Toy> toys;
    private double fullWeight = 0;

    public ToyCollection() {
        toys = new HashMap<Integer, Toy>();
    }

    public void add(Toy toy) {
        toys.put(toy.getId(), toy);
        fullWeight += toy.getFrequency();
    }

    private Toy get(int id) {
        return toys.get(id);
    }

    public Toy getRandom(){
        double random = Math.random() * fullWeight;
        
        // берем случайную игрушку с учетом вероятностей их выпадения
        for (Toy toy : toys.values()) {
            random -= toy.getFrequency();
            if (random <= 0){
                remove(toy.getId());
                return toy;
            }
        }

        return null;
    }

    private void remove(int id) {
        Toy toy = get(id);
        if (toy.getQuantity() > 1){
            toy.setQuantity(toy.getQuantity() - 1);
            return;
        }

        fullWeight -= toy.getFrequency();
        toys.remove(id);
    }
}
