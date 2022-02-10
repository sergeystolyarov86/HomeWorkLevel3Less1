import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String[] arr = {"учусь", "Я", "на", "geekBrains"};
        System.out.println("Массив до перестановки элементов: "+Arrays.toString(arr));
        replaceIndex(arr, 1,0);
        System.out.println("Массив после перестановки элементов: "+Arrays.toString(arr));
        System.out.println("Задание 2");
        System.out.println(toArrayList(arr) instanceof ArrayList);
        System.out.println("Задание 3");

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.addFruit(new Apple(),9);
        orangeBox.addFruit(new Orange(),6);
        orangeBox1.addFruit(new Orange(),4);


        System.out.println("Вес коробки appleBox: "+appleBox.getWeight());
        System.out.println("Вес коробки orangeBox: "+orangeBox.getWeight());
        System.out.println("Вес коробки orangeBox1: "+orangeBox1.getWeight());
        System.out.println("Сравнение коробок с разными фруктами: "+appleBox.compare(orangeBox));
        orangeBox.pourTo(orangeBox1);
        System.out.println("Вес коробки orangeBox1 после пересыпания: "+orangeBox1.getWeight());
        System.out.println("Вес коробки orangeBox после пересыпания: "+orangeBox.getWeight());
        
    }

    static <T> void replaceIndex(T[] arr, int index1,int index2) {
        T data;
        data = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = data;
    }

    static <T> List<T> toArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
