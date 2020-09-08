import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        int a = arr.get(0)+arr.get(1);
        int b = arr.get(0)+arr.get(2);
        int c = arr.get(1)+arr.get(2);
        int d = arr.get(0)+arr.get(1)+arr.get(2);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        Collections.sort(arr);

//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
        for (int i = 0; i < arr.size(); i++) {

            if (i == 0){
//                System.out.println(arr.get(0));
            }else {
                int selisih = (arr.get(i)) - (arr.get(i-1));
                if (selisih>1){
                    System.out.println(arr.get(i-1));
                }
            }


        }

    }
}

