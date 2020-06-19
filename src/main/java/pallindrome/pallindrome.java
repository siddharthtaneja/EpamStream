package pallindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class pallindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("Enter size");
        int size = s.nextInt();
        for(int i=0;i<size;i++){
            String ele = s.next();
            list.add(ele);
        }
        List<String> list1 = func(list,(String str)-> System.out.println("Successful"));
        System.out.println(list1);
    }
    public static List<String> func(List<String> list, Consumer<String> consumer){
        List<String> f = new ArrayList<String >();
        for(String str: list){
            String reverse = new StringBuilder(str).reverse().toString();
            if(reverse.equals(str)){
                f.add(str);
            }
        }
        return f;
    }
}
