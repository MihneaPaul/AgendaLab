import java.util.Scanner;

/**
 * Created by Mihnea on 02.04.2017.
 */
public class MainAgenda {

    static String[] agendaPersoane = new String[150]; //e variabila GLOBALA acum. In metode, se numeste LOCALE.

    public static void main(String[] args){
        agendaPersoane[0] = "Mihnea";
        agendaPersoane[1] = "Razvan";
        agendaPersoane[2] = "David";
        agendaPersoane[3] = "Andra";
        runProgram();

    }

    public static void Meniu(){
//        System.out.println("\n");
        System.out.print("1 - Afisare;      ");
        System.out.print(" 2 - Adaugare;      ");
        System.out.print(" 3 - Modificare;      ");
        System.out.print(" 4 - Stergere;      ");
        System.out.print(" 5 - Cautare;      ");
        System.out.println(" 7 - Terminare;      \n");
    }

    public static void runProgram(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            Meniu();
            int optiune = scanner.nextInt();
            if(optiune == 7) {
                break;
            }
            else if(optiune == 1){
                Afisare();
                System.out.println("\n");
            }
            else if(optiune == 2){
                Adaugare();
                System.out.println("");
            }
            else if(optiune == 3) {
                Modificare();
                System.out.println("");
            }
            else if (optiune == 4) {
                Stergere();
                System.out.println("");
            }
            else if(optiune == 5) {
                searchCore();
                System.out.println("");
            }
        }
    }

    public static void Afisare() {

        for(int i=0;i<agendaPersoane.length;i++){
            if(!(agendaPersoane[i] == null))
            System.out.print(agendaPersoane[i] + ", ");
            ;

        }
    }

    public static void Adaugare(){
        System.out.println("Please enter a new person name: ");
        Scanner scanner = new Scanner(System.in);
        String newEntryInAgenda = scanner.nextLine();
        for(int i=0;i<agendaPersoane.length;i++){
            if(agendaPersoane[i] == null){
                agendaPersoane[i] = newEntryInAgenda;
                break;
            }
        }
    }

    public static void Modificare(){
        System.out.println("Please enter person's name from agenda: ");
        Scanner scanner = new Scanner(System.in);
        String personNameInAgenda = scanner.nextLine();
        if(!Cautare(personNameInAgenda)) {
            System.out.println("There is no entry in the agenda with the given name ! Sorry :( . Try again.");
        }
        else {
            System.out.println("Enter the new name: ");
            String newName = scanner.nextLine();
            for (int i = 0; i < agendaPersoane.length; i++) {
                if (personNameInAgenda.equals(agendaPersoane[i])) {
                    agendaPersoane[i] = newName;
                }
            }

        }
    }

    public static void searchCore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to search for: ");
        String name = sc.nextLine();


            System.out.println("1 - Find first occurence \n");
            System.out.println("2 - Find all occurences \n");
            int optiune = sc.nextInt();
            if (optiune == 1) {
                if(!Cautare(name)){
                    System.out.println("There is no entry in the agenda with the given name ! Sorry :( . Try again.");
                }
                else{
                    System.out.println(name + " was found !");
                }
            }
            if (optiune == 2) {
                int howManyWereFound = CautareAll(name);

                if(howManyWereFound != 0) {
                    System.out.println(name + " appears " + howManyWereFound + " times.");
                }
                else {
                    System.out.println("There is no entry in the agenda with the given name ! Sorry :( . Try again.");
                }
            }
    }

    public static boolean Cautare(String name){
        for(int i=0;i<agendaPersoane.length;i++){
            if(name.equals(agendaPersoane[i])) return true;
        }
        return false;

    }

    public static int CautareAll(String name){
        int nrNames = 0;

        for(int i=0;i<agendaPersoane.length;i++){
            if(name.equals(agendaPersoane[i])){
                nrNames++;
            }
        }

//        System.out.println(name + " appears " + nrNames + " times.");

        return nrNames;
    }

    private static void Stergere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you want to delete: ");
        String name = scanner.nextLine();
        if(!Cautare(name)) {
            System.out.println("There is no entry in the agenda with the given name.");

        }
        else {
            for(int i=0;i<agendaPersoane.length;i++) {
                if(name.equals(agendaPersoane[i])){
                    agendaPersoane[i]=null;
                }
            }
        }
    }
}