import java.util.Comparator;
import java.util.TreeSet;


//Default natural sorting order
//class Demo implements Comparable{
//    String name;
//    int eid;
//    public Demo(String name, int eid){
//        this.name = name;
//        this.eid = eid;
//    }
//
//    @Override
//    public String toString() {
//        return this.name+" "+this.eid;
//    }
//    public int compareTo(Object obj){
//        int eid1= this.eid;
//        Demo e = (Demo) obj;
//        int eid2 = e.eid;
//        if(eid1<eid2){
//            return -1;
//        } else if (eid1>eid2) {
//            return 1;
//        }else return 0;
//    }
//}

//Customized sorting order
class Demo{
    String name;
    int eid;
    public Demo(String name, int eid){
        this.name = name;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return this.name+" "+this.eid;
    }

}

class myCompare implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Demo e1 = (Demo) o1;
        Demo e2 = (Demo) o2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}

class Comp{
    public static void main(String[] args) {
        Demo e1 = new Demo("Harsh", 101);
        Demo e2 = new Demo("Tushar", 102);
        Demo e3 = new Demo("Meghana", 99);
        Demo e4 = new Demo("Navjot", 100);
        TreeSet t = new TreeSet<>(new myCompare());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(new Demo("Akshay", 103));
        t.add(new Demo("Mohit", 103));
        System.out.println(t);
    }
}
