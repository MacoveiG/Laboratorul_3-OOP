import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Exemplu polimorfizm
        Comparare comparare = new Comparare();
        System.out.println(comparare.max(5, 6));
        System.out.println(comparare.max(5.44, 6.1));
        System.out.println(comparare.max('c', 'd'));

        //Exemplu de abstractizare cu interfata
        System.out.println("\n-------------------------------------\n");
        User user1 = new User("Mm", "Gg", 10);
        System.out.print(user1.toString());
        if (user1.isAdult()) System.out.println("\tIs adult!");
        else System.out.println("\tIs not adult!");
        user1.setAge(20);
        System.out.print(user1.toString());
        if (user1.isAdult()) System.out.println("\tIs adult!");
        else System.out.println("\tIs not adult!");

        //Exemplu de abstractizare cu class abstract
        System.out.println("\n-------------------------------------\n");

        Carte carte = new Carte("Mihai Eminescu", "Amintiri", "Unic", 1980, 90);

        Jurnal jurnal = new Jurnal("Qwerty", "ABC", "Unic", 2020, 133);

        Enciclopedie enciclopedie = new Enciclopedie("Qwer", "Australia", "Unic", 2019, 1000);

        List<CarteForm> carteFormList = List.of(carte, jurnal, enciclopedie);
        carteFormList.forEach(carteForm -> {
            System.out.println(carteForm);
            System.out.println("\t\tMarimea: "+ carteForm.marime());
        });
    }
}
