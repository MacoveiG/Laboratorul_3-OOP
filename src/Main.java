public class Main {
    public static void main(String[] args) {

        //Exemplu polimorfizm
        Comparare comparare = new Comparare();
        System.out.println(comparare.Max(5, 6));
        System.out.println(comparare.Max(5.44, 6.1));
        System.out.println(comparare.Max('c', 'd'));

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
        Carte carte1 = new Carte("Mihai", "Eminescu", "Amintiri", 1980, 90);
        System.out.println(carte1.toString() + "\tEste de marime " + carte1.Marime() + "!");
        carte1.setNrFoi(500);
        System.out.println(carte1.toString() + "\tEste de marime " + carte1.Marime() + "!");
        carte1.setNrFoi(5000);
        System.out.println(carte1.toString() + "\tEste de marime " + carte1.Marime() + "!");
    }
}
