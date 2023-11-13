package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args){
            /*/  Triangle triangle = new Triangle(5);
            Square square = new Square( 6);

            triangle.desen();
            square.desen();
            /*/

            List<Book> listaDeCarti = new ArrayList<>();
            List<String> listaDeStrings = new ArrayList<>();


            listaDeCarti.add(new Book("Book1", "Author1", "1234123"));
            listaDeCarti.add(new Book("Book2", "Author2", "123412341231234"));
            listaDeCarti.add(new Book("Book3", "Author3", "1789012341234312790"));

            Book book1 = listaDeCarti.get(1);

            listaDeCarti.contains(book1);

            listaDeCarti.forEach(element ->{
                System.out.println(element.getName());
            });

            List<String> list = listaDeCarti.stream()
                    .filter(e -> e.getISBN().length() > 10)
                    .map(e -> e.getAuthor())
                    .collect(Collectors.toList());

        }

}
