import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox = new ArrayList<>();

    public float getWeight() {
       //     return fruitBox.size() * fruitBox.get(0).getWeight();
        float weight = 0;
        for (T box : fruitBox) {
            weight+= box.getWeight();
        }return weight;
    }


    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruitBox.add(fruit);
        }
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.fruitBox.addAll(fruitBox);
        fruitBox.clear();
    }
}
