package Average;
import java.util.*;
import java.util.function.Consumer;

public class Average {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter size");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = s.nextInt();
            list.add(ele);
        }
        func(list,(Integer a) -> System.out.println(a),n);
    }
    static void func(List<Integer> l, Consumer<Integer> consumer, int n){
        int sum = 0;
        for(Integer i : l){
            sum = sum + i;
        }
        sum = sum/n;
        consumer.accept(sum);
    }

}
