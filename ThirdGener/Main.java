package ThirdGener;

public class Main {
    public static void main(String[] args) {


        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();


       // Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage()); Добавить не возможно, т.к. Cabbage не относится к классу Fruit
       // cabbageBox.getObj().printClass();


        BoxForVegetable<String,Vegetable> cabbageBox = new BoxForVegetable <>("cabbage", new Cabbage());//Создана нвая коробка для овощей
        cabbageBox.getObj().printClass(); // Положили капусту в коробку для овощей
    }
}

