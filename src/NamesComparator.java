import java.util.Comparator;

public class NamesComparator implements Comparator<String> {

//    @Override
//    public int compare(MyArrayList2 o1, MyArrayList2 o2) {
//        return o1.mList;
//    }

    @Override
    public int compare(String o1, String o2) {
        return o1.toUpperCase().compareTo(o2.toUpperCase());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        //return false;
    }

//    @Override
//    public int compare(MyArrayList2 o1, MyArrayList2 o2) {
//        return o1.mList.co(o2.mList);
//    }
}
