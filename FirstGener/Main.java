package FirstGener;

public class Main {
    public static void main(String[] args) {



        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);

        Box<Integer> sample2 = new Box<>(1);// Был указан класс String, а использовали вкачестве объекта число, по этому заменен на Integer
        System.out.println(sample2);

        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
