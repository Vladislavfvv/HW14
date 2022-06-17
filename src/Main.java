public class Main {
    public static void main(String[] args) {

        MyArrayList mal = new MyArrayList();


        mal.list.forEach(System.out::println);
        for (int i = 0; i < mal.list.size(); i++) {
            System.out.println(mal.list.stream().iterator());
        }
    }
}
