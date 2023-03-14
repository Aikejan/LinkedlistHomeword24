import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
            for (int i = 0; i < 50; i++) {
                array.add(random.nextInt(1, 100));
            }
            System.out.println(array);
        ArrayList<Integer> jupsan = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int a = array.get(i);
            if(a%2==0){
                jupsan.add(a);
            }

        }
        System.out.println(jupsan);
        ArrayList<Integer>taksan = new ArrayList<>();
        for (int i = 0; i <array.size() ; i++) {
            int b = array.get(i);
            if (b%2==1){
                taksan.add(b);
            }

        } System.out.println(taksan);


    }
}