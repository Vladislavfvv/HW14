import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //List <MyTElement> list = new ArrayList<>(100);

        MyArrayList2<Integer> myArrayList2 = new MyArrayList2<Integer>();
        myArrayList2.setMyArrayList(100);

        myArrayList2.mList.forEach(System.out::println);

//        MyArrayList mal = new MyArrayList();
//
//
//        mal.list.forEach(System.out::println);
//        for (int i = 0; i < mal.list.size(); i++) {
//            System.out.println(mal.list.stream().iterator());
//        }
//
//        mal.setListOfElements(100);
//        mal.list.forEach(System.out::println);
//
//        for (int i = 0; i < 1000; i++) {
//            Random random = new Random();
//            MyIntElement element = new MyIntElement(random.nextInt(20));
//            mal.list.add(element);
//        }
//
//        System.out.print("ArrayList: ");
//        mal.list.forEach(System.out::print);
//
//        Stream<MyIntElement> stream = mal.list.stream();
//        List<MyIntElement> sortedList = stream.distinct().collect(Collectors.toList());
//        System.out.println("\n//////////////\n Без дублекатов:");
//        sortedList.forEach(System.out::print);
//
//        System.out.println("\n//////////////\n от 7 до 17:");
//        List<MyIntElement> listFrom7To17 = (List<MyIntElement>) mal.list.stream().filter(
//                myIntElement -> myIntElement.getEl() > 7
//                        && myIntElement.getEl() < 17
//                        && myIntElement.getEl() % 2 == 0).collect(Collectors.toList());
//        listFrom7To17.forEach(System.out::print);

    }
}
