import java.util.*;
//this is a ArrayList which implements List and Collection Interface 
public class ArrayLists {
    static void arrayList() {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(1000);
//        al.add("Java");
//        al.add(null);
        al.add(1000);
        al.add(1);
        al.add(56);
        al.add(35);
        al.add(99);
        al.add(5);
        al.add(78);
        al.add(98);
        al.add(100);
       System.out.println(al);
//
//        System.out.println(al.size());
//        System.out.println(al.get(0));
//        System.out.println(al.get(al.size()-1));

        al.add(1,5000);
        al.add(al.size(),4000);
//        System.out.println(al);
//        for (Object o : al) {
//            System.out.println(o);
//        }
//        System.out.println("al.isEmpty()"+al.isEmpty());
//        System.out.println("contain "+al.contains(5000));
//        System.out.println("remove "+al.remove((Object)5000));
//        al.clear();
//        System.out.println("al.isEmpty()"+al.isEmpty());
//        Iterator<Object> i = al.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        TreeSet<Object> ts = new TreeSet<Object>();
//        for (int i = 0; i < al.size(); i++) {
//            ts.add(al.get(i));
//        }
//
//        Iterator<Object> i = ts.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println(ts.headSet(80));
//        System.out.println(ts.tailSet(12));
//        PriorityQueue<Object> pq = new PriorityQueue<>(al);
//        pq.offer(1);
//        System.out.println(pq);


    }



    private static Object arr[];
    static {
        arr = new Object[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Object();
        }
    }
    static void compare(){
        ArrayList<Object> al = new ArrayList<>();
        long start;
        long end;
        start = System.currentTimeMillis();
        for (Object o: arr) {
            al.add(o);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    static void compare1(){
        LinkedList<Object> ll = new LinkedList<>();
        long start;
        long end;
        start = System.currentTimeMillis();
        for (Object o: ll) {
            ll.add(o);
        }
        end = System.currentTimeMillis();
        long total = end - start;
        System.out.println((long)total);

    }


    public static void main(String[] args) {
//        compare();
//        compare1();
        arrayList();
    }
}
