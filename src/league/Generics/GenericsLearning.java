package league.Generics;

import java.util.ArrayList;
import java.util.*;

public class GenericsLearning<T,S> {
   private T obj;

   private S name;
    public GenericsLearning(T obj , S name) {
        this.obj = obj;
        this.name = name;
    }

    public T getObj() {
        return obj;
    }


    public void arrays(){
        System.out.println(name+" : "+ Arrays.toString((int[]) getObj()));

        }
    }


class Main{
    public static void main(String[] args) {
        int[] generic={5,8,6,9};
        GenericsLearning<int[],String> learning=new GenericsLearning<>(generic,"generic");
        learning.arrays();

        ArrayList<String> al=new ArrayList<>();
        al.add("String");
        al.add("Xusniddin");
        al.add(String.valueOf(25));

        String a=(String) al.get(0);
        String b=(String) al.get(1);
        String c=(String) al.get(2);

    }
}
