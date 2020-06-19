package lowercase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lowercase {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("Enter Size");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            String ele = s.next();
            list.add(ele);
        }
        Stream<String> stream = list.stream();
        List<String> finall = stream.filter(p -> p.length() == 3 && p.charAt(0) == 'a').collect(Collectors.toList());
        System.out.println(finall);
    }
}
