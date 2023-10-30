package lab4;

public class First {
    public static String mijloc(String cuvant) {
        if (cuvant.length() % 2 == 0)
            return String.valueOf(cuvant.charAt(cuvant.length() / 2 - 1)) +
                    String.valueOf(cuvant.charAt(cuvant.length() / 2));
        else
            return String.valueOf(cuvant.charAt(cuvant.length() / 2));
    }


    public static void main(String[] args) {
        System.out.println(mijloc("3501"));
        System.out.println(mijloc("350"));
    }
}
