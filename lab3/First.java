package lab3;
import javax.management.StringValueExp;
import java.util.Scanner;

public class First {

    public static void elementeComune(String[] lista1, String[] lista2){
        for(String e1:lista1)
            for(String e2:lista2)
                if (e1.equals(e2))
                    System.out.println(e1);
    }

    public static void fibbonaci(Integer first, Integer second, Integer stopAt){
        if(first ==0)
            System.out.println("0\n1");
        Integer sum = first+second;
        if(sum<=stopAt) {
            System.out.println(sum);
            fibbonaci(second, sum, stopAt);
        }
    }




    public static void main(String[] args){
        String[] list1 = {"Ana", "Mere", "Pere"};
        String[] list2 = {"Cere", "Ana", "Prune"};
        System.out.println("Elemente comune:");
        elementeComune(list1,list2);
        System.out.println("\n\n");
        int flag = 1;
        int[] num={7,9,13,11,22,54};
        System.out.println("Numere prime:");
        for(int i=0;i<num.length;i++){
            flag = 1;
            for(int j=2;j<=(num[i]/2);j++){
                if(num[i]%j==0)
                    flag = 0;
            }
            if(flag == 1 && num[i]>1) {
                System.out.print(num[i]);
                System.out.print(' ');
            }
        }
        System.out.println("\n\n");

        System.out.println("Fibbonaci:");
        Integer fibbonaciStopAt;

        Scanner sc = new Scanner(System.in);
        fibbonaciStopAt = sc.nextInt();
        fibbonaci(0,1,fibbonaciStopAt);

        System.out.println("\n\n");
        System.out.println("Introduceti cuvantul pentru a verifica daca este palindrom: ");

        String isPalindrom;
        String remember;
        StringBuilder temp = new StringBuilder();
        isPalindrom = sc.next();
        remember = isPalindrom;
        isPalindrom = isPalindrom.toLowerCase();
        temp.append(isPalindrom);

        if(isPalindrom.equals(String.valueOf(temp.reverse()))) {
            System.out.print(remember);
            System.out.println(" este palindrom.");
        }




    }


}


