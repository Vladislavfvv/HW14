import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //List <MyTElement> list = new ArrayList<>(100);

        MyArrayList2<Integer> myArrayList2 = new MyArrayList2<Integer>();
        myArrayList2.setMyArrayList(100);

        System.out.println("Arraylist: ");
        for (Integer l : myArrayList2.mList) {
            System.out.print(l + " ");
        }

        System.out.println("\nStream: ");
        Stream<Integer> stream = myArrayList2.mList.stream();
        //Stream<MyArrayList2> stream = new Collection(myArrayList2);
        //stream.forEach(integer -> System.out.print(integer + " "));


        System.out.println("\nStream2: ");
        IntStream stream2 = IntStream.of(10, 20);
        stream2.forEach(value -> System.out.print(value + " "));


        System.out.println("\n Without dublicate stream1: ");
        List<Integer> distinctList = stream.distinct().sorted().collect(Collectors.toList());
        distinctList.forEach(integer -> System.out.print(integer + " "));
        System.out.println("\n Count of elements: " + distinctList.size());

        System.out.println("\n Even elements ranging from 7 to 17 stream1");
        Stream<Integer> stream3 = myArrayList2.mList.stream();
        List<Integer> evenElementst = stream3.filter(integer -> integer > 7
                && integer < 17 && integer % 2 == 0).collect(Collectors.toList());
        evenElementst.forEach(integer -> System.out.print(integer + " "));
        System.out.println("\n Count of elements: " + evenElementst.size());

        System.out.println("\n Multiply by 2: ");
        Stream<Integer> mylistmultiplyStream = myArrayList2.mList.stream();
        List<Integer> multiplyBy2List = mylistmultiplyStream.map(integer -> integer * 2).collect(Collectors.toList());
        multiplyBy2List.forEach(integer -> System.out.print(integer + " "));
        System.out.println("\n Count of elements: " + multiplyBy2List.size());

        //System.out.println("\n Multiply by 2 2 Variant: ");
        // Stream<Integer> mylistmultiplyStream2 = myArrayList2.mList.stream().reduce((s1, 2) -> s1*2).orElse(0);//?????????????????
        // List<Integer> multiplyBy2List2 = mylistmultiplyStream2.forEachOrdered(integer -> integer.appe);
        //  multiplyBy2List2.forEach(integer -> System.out.print(integer + " "));
        //System.out.println("\n Count of elements: " + multiplyBy2List.size());


        System.out.println("\n The first four elements are sorted: ");
        Stream<Integer> streamForEl = myArrayList2.mList.stream();
        List<Integer> listForEl = streamForEl.sorted().limit(4).collect(Collectors.toList());
        listForEl.forEach(integer -> System.out.print(integer + " "));
        System.out.println("\nCount of elements: " + listForEl.size());


        System.out.print("\n Count of elements in the stream: ");
        Stream<Integer> streamCountOfEl = myArrayList2.mList.stream();
        int count = (int) streamCountOfEl.count();
        System.out.print(count);


        System.out.print("\n\n Everage in the stream: ");
        Stream<Integer> everStream = myArrayList2.mList.stream();
        Optional<Integer> allrezult = everStream.reduce((integer, integer2) -> integer + integer2);
        double allcount = (double) myArrayList2.mList.stream().count();
        System.out.println(allrezult.get() / allcount);


        System.out.println("////////////////////////List ");
        MyArrayList2<String> nameOfStudents = new MyArrayList2<>();

        //Collections.addAll(nameOfStudents, "Vlad", "Vlad Fomin", "Ilya", "Maria", "Dmitriy", "Valentin Radukevich");
        nameOfStudents.setMyArrayList("Vlad", "Vlad Fomin", "Ilya", "Maria", "Dmitriy", "Valentin Radukevich",
                "Anastasia", "Sergey Melnik", "Manager", "Julija", "Lesha", "Roman", "Black_overload");
        ArrayList<String> namesList = new ArrayList<>();
        Collections.addAll(namesList, "Vlad", "Vlad Fomin", "Ilya", "Maria", "Dmitriy", "Valentin Radukevich",
                "Anastasia", "Sergey Melnik", "Manager", "Julija", "Lesha", "Roman", "Black_overload", "anna");


//        nameOfStudents.setMyArrayList("Vlad");
//        nameOfStudents.setMyArrayList("Vlad Fomin");
//        nameOfStudents.setMyArrayList("Ilya");
//        nameOfStudents.setMyArrayList("Maria");
//        nameOfStudents.setMyArrayList("Dmitriy");
//        nameOfStudents.setMyArrayList("Valentin Radukevich");
//        nameOfStudents.setMyArrayList("Anastasia");
//        nameOfStudents.setMyArrayList("Sergey Melnik");
//        nameOfStudents.setMyArrayList("Manager");
//        nameOfStudents.setMyArrayList("Julija");
//        nameOfStudents.setMyArrayList("Lesha");
//        nameOfStudents.setMyArrayList("Roman");
//        nameOfStudents.setMyArrayList("Black_overload");

        System.out.println("List of students: ");
        for (String str : nameOfStudents.mList) {
            System.out.print(str + " ");
        }
        ;
        System.out.println("\nCount of students" + nameOfStudents.mList.size());
        System.out.println("0) List of students2: ");
        namesList.stream().forEach(s -> System.out.print(s + " "));
        //System.out.println("\n" + nameOfStudents.mList.size());
        System.out.println("\n\n 1) With name Vlad: ");
        List<String> selectVlad = namesList.stream().map(s -> s.toUpperCase()).filter(s -> s.contains("VLAD")).collect(Collectors.toList());
        selectVlad.forEach(s -> System.out.println(s + " "));
        System.out.println("\n 2) With first letter A: ");
        List<String> selectFirstA = namesList.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A")).collect(Collectors.toList());
        selectFirstA.forEach(s -> System.out.println(s + " "));

        System.out.println("\n 3) Sorting elements of collection: ");
        List<String> sortedList = namesList.stream().sorted().collect(Collectors.toList());
       sortedList.forEach(s -> System.out.println(s + " "));
        System.out.println("\n!!!!!First element:");
        namesList.stream().sorted().limit(1).forEach(s -> System.out.print(s + " "));


        System.out.println("\n////////////Second sorting with Comparator");
        namesList.stream().sorted(new NamesComparator()).forEach(s -> System.out.print(s + " "));
        System.out.println("\n!!!!!First element:");
        namesList.stream().sorted(new NamesComparator()).limit(1).forEach(s -> System.out.println(s + " "));


        System.out.println("2 Variant");
        Optional<String> min = namesList.stream().min(String::compareTo);
        //System.out.println(min.get());
        min.ifPresentOrElse(s -> System.out.println(min.get()),
                () -> System.out.println("Collection is empty"));




        //AtomicInteger q = new AtomicInteger();
        //allrezult.ifPresent(integer -> q.getAndIncrement());

        //System.out.println("\n" + q);


        //Stream<Integer> streamArifm = myArrayList2.mList.stream();
        // myArrayList2.mList.stream().toArray(value -> value.);
        //System.out.println(average);
//        double sum = myArrayList2.mList.stream().mapToDouble(MyArrayList2::getmList).sum();
//
//        Object [] objects = myArrayList2.mList.stream().toArray();
//        System.out.println(Arrays.stream(objects).count());
//        Arrays.stream(objects).mapToDouble(value -> )


        //int average = myArrayList2.mList.stream().mapToInt(value -> value.average();
        //double average = myArrayList2.mList.stream().mapToDouble().average().getAsDouble();
        //        List<MyIntElement> listFrom7To17 = (List<MyIntElement>) mal.list.stream().filter(
//                myIntElement -> myIntElement.getEl() > 7
//                        && myIntElement.getEl() < 17
//                        && myIntElement.getEl() % 2 == 0).collect(Collectors.toList());
//        listFrom7To17.forEach(System.out::print);


        // myArrayList2.mList.forEach(System.out::print);


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
