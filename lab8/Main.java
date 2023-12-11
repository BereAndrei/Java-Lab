package lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<String> in = Arrays.asList("aa", "bb","aa","cc","bb","aa","cc","bb","aa","cc");
        System.out.println(eliminDuplicates(in));
        System.out.println(countStartingWith(in, 'a'));
        System.out.println(sortAsc(in));
        System.out.println(sortDesc(in));

    }



    public static List<String> eliminDuplicates(List<String> lista){
        return lista.stream().distinct().collect(Collectors.toList());
    }


    public static int countStartingWith(List<String> lista, char startsWith){
        return (int) lista.stream().filter(a->a.charAt(0)==startsWith).count();
    }

    public static List<String> sortAsc(List<String> lista){
        return lista.stream().sorted().collect(Collectors.toList());
    }

    public static List<String> sortDesc(List<String> lista){
        return lista.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
