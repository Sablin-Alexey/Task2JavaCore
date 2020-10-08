package SecondGener;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {





        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);

        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        Box<String, Integer> goodSample1 = new Box<>("2",3);//Реализован пример с созданием объектов подходящих по типу для list1
        Box<String,Integer> goodSimple2 = new Box<>("abc",7);


        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
       // list1.add(sample2);//Для samle1 sample2 не работает добавление, т.к. конфликт типов. Выхода 2а, либо менять параметры list1, либо делать другие объекты.
       // list1.add(sample1);
        list1.add(goodSample1);//Добавили объекты. Ошибок нет.
        list1.add(goodSimple2);



    }
}
