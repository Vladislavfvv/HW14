import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyArrayList2<M> {

    List<M> mList;

    public  List<M> getmList() { return mList;}

    public void setmList(List<M> mList) {this.mList = mList;}

    public void setMyArrayList(int n) {
        Random random = new Random();
        this.mList = new ArrayList<>();
        System.out.println("Size: " + this.mList.size());
        for (int i = 0; i < n; i++) {
            Integer element = random.nextInt(20);
            mList.add((M) element);
        }
        System.out.println("Size: " + this.mList.size());
    }

    public void setMyArrayList(String ... names){
        this.mList = new ArrayList<>();
        for (String name: names) {
            mList.add((M) name);
        }
    }


//    public void createArrayList(String ... names){
//        this.mList = new ArrayList<>();
//        for (String name: names) {
//            mList.add((M) name);
//        }
//    }



    @Override
    public String toString() {
        return "MyArrayList2{" +
                "mList=" + mList +
                '}';
    }








//    public double average(List<Integer> list){
//        double av = 0.0;
//        list.forEach(m -> getmList().listIterator().);
//    }


}
