///**
// * Created by Mihnea on 01.04.2017.
// */
//import java.util.Scanner;
//public class Main {
//
//    static String[] agendaPersoane = new String[2]; //e variabila GLOBALA acum. In metode, se numeste LOCALE.
//    static int index;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Hello World");
////        afisare();
////        adaugare("Ionel");
////        afisare();
////        adaugare("Vlad");
////        afisare();
////        modificare("Ionel", "Daniel"); //daca pun ionelasda, nu il gaseste si afiseaza tot Ionel si Vlad
////        afisare();
////        stergere("Ionel");
////        afisare();
////        stergere("asda");
//        afisare();
//        int optiune = -1;
//        System.out.println("Afisare = 1; Adaugare = 2; Modificare = 3; Stergere = 4; Cautare = 5; Terminare = 7");
//        System.out.println("Alegeti ceva: ");
//        do { //userul vede un meniu si alege ceva.
////            index = 0;
//            optiune = scanner.nextInt();
//            //daca a ales iesire, se termina
//            //daca a ales afisare, se afiseaza etc.
//            if (optiune == 1)
//                afisare();
//            if (optiune == 2) {
//                System.out.println("Introduceti numele: ");
//                String nume = scanner.nextLine();
//                adaugare(nume);
//            }
//            if (optiune == 3) {
//                System.out.println("Introduceti vechiul nume: ");
//                String vechiulNume = scanner.nextLine();
//                String noulNume = scanner.nextLine();
//                modificare(vechiulNume, noulNume);
//            }
//            if (optiune == 4) {
//                String numeCautat = scanner.nextLine();
//                stergere(numeCautat);
//            }
//            if (optiune == 5) {
//            }
//            System.out.println("Alegeti ceva: ");
//        }
//        while (optiune != 7);
//
//
//    }
//
//    public static void afisare() {
//        System.out.println("---afisare---");
//        for (int i = 0; i < agendaPersoane.length; i++) {
//            if (agendaPersoane[i] != null)
//                System.out.println(agendaPersoane[i]);
//        }
//
//    }
//
//    public static void adaugare(String nume) { //adauga numele, pe o pozitie, intr-o lista initiala
//        if (index < agendaPersoane.length) {
//            agendaPersoane[index] = nume;
//            index++;
//        } else {
//            System.out.println("Gata");
//            for (int i = 0; i < agendaPersoane.length; i++) {
//                if (agendaPersoane[i] == null) {
//                    agendaPersoane[i] = nume;
//                    break;
//                }
//            }
//        }
//    }
//
//    public static void modificare(String vechiulNume, String noulNume) {
//
//        int gasit = cautare(vechiulNume);
//        if (gasit != -1) {
//            System.out.println("Introduceti noul nume: ");
//
//            agendaPersoane[gasit] = noulNume;
//        } else {
//            System.out.println("Nu a fost gasit numele.");
//
//        }
//
//    }
//
//    public static void stergere(String nume) {
//
//        int gasit = cautare(nume);
//        if (gasit != -1) { //daca l-am gasit
//            agendaPersoane[gasit] = null;
//        }
//    }
//    public static void stergereToate(String nume) {
//
//        int[] gasite = cautarePozitii(nume);
//        for(int i=0;i<gasite.length;i++){
//            agendaPersoane[gasite[i]] = null;
//        }
//        }
//
//
//    public static int cautare(String nume) { //trebuie sa returneze pozitia
//        //daca exista sa modific, altfel sa-i zic ca nu exista => cautarea trebuie implementata prima data
//        int indexFound = -1;
//        for (int i = 0; i < agendaPersoane.length; i++) {
//            if (nume.equals(agendaPersoane[i]))
//                indexFound = i;
////            break;
//        }
//        return indexFound; //nu e bine sa se puna 2 returnuri intr-o metoda.
//    }
//
//    public static int cautarePozitii(String nume) {
//
//     //trebuie sa returneze pozitia
//        //daca exista sa modific, altfel sa-i zic ca nu exista => cautarea trebuie implementata prima data
//        int[] pozitiiGasite = new int[agendaPersoane.length];
//        int index = 0;
//        for (int i = 0; i < agendaPersoane.length; i++) {
//            if (nume.equals(agendaPersoane[i]))
//                pozitiiGasite[index] = i;
////            break;
//        }
//        return pozitiiGasite; //nu e bine sa se puna 2 returnuri intr-o metoda.
//
//    }
//}
//
