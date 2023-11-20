package lab7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args){
    //problema1_var2();
    //List<String> inputs = Arrays.asList("sadasdASDSADSA", "dsasadadDSADDSADA", "dsasdadfdSADFASDDAdsasds");
    //    System.out.println(lowerOfList(inputs));
        List<Integer> sum = Arrays.asList(1,2,3,4,2,2,3,3,3,4,5,5,6,6,6);
        System.out.println(eliminCopy(sum));
        System.out.println(sumaPareImpare2(sum));

    }
    //media aritmetica a listei de nr intregi
    public static void problema1_var1() {
        List<Integer> numereIntregi = Arrays.asList(3,6, 8, 43, 65, 23, 76);
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n-> {
            sum.set(sum.get() + n);});
        System.out.println(sum.get().floatValue()/numereIntregi.size());
    }

    public static void problema1_var2() {
        List<Integer> numereIntregi = Arrays.asList(3,6, 8, 43, 65, 23, 76);
        System.out.println(numereIntregi.stream().mapToDouble(i -> i.doubleValue()).average().orElse(0.0));

    }

    private static AtomicReference<Integer> getSum(AtomicReference<Integer> sum) {
        return sum;
    }

    public static List<String> upperOfList(List<String> strings){
        strings.forEach(e->{
            strings.set(strings.indexOf(e),e.toUpperCase());
        });
        return strings;
    }

    public static List<String> lowerOfList(List<String> strings){
        return strings.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());

    }

    public static List<Integer> sumaPareImpare(List<Integer> numere){
        List<Integer> suma = Arrays.asList(0, 0);
        numere.forEach(nr -> {
            if(nr%2 ==0)
                suma.set(0, suma.get(0) + nr);
            else suma.set(1, suma.get(1) + nr);
        });
        return suma;
    }

    public static List<Integer> sumaPareImpare2(List<Integer> numere){
        List<Integer> suma = Arrays.asList(0, 0);
        suma.set(0,numere.stream().filter(nr -> nr%2 ==0).reduce(0, (subtotal, nr) -> subtotal + nr));
        suma.set(1,numere.stream().filter(nr -> nr%2 ==1).reduce(0, (subtotal, nr) -> subtotal + nr));
        return suma;
    }

    public static List<Integer> eliminCopy(List<Integer> lista){
        List<Integer> result = new ArrayList<>();
            lista.forEach(e ->{
                if(!result.contains(e))result.add(e);
            });
        return result;
    }

}
