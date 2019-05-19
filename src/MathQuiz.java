import java.util.Scanner;
public class MathQuiz {
    Scanner scanner = new Scanner(System.in);

    public void mathQuiz(){
        int counter=0;
        System.out.println("Proszę o rozwiązanie 3 zadań ");

        if(question1()){
            counter++;
            System.out.println("Prawidłowa odpowiedź");
        }else{
            System.out.println("Nieprawidłowa odpowiedź");
        }
        if(question2()){
            counter++;
            System.out.println("Prawidłowa odpowiedź");
        }else{
            System.out.println("Nieprawidłowa odpowiedź");
        }
        if(question3()){
            counter++;
            System.out.println("Prawidłowa odpowiedź");
        }else{
            System.out.println("Nieprawidłowa odpowiedź");
        }
        System.out.println("Udzielono poprawnych odpowiedzi:" +counter +"/3");

    }

    private boolean question1(){
        int wynikMnozenia;
        System.out.println("Jaki jest wynik mnożenia 3*5 ?");
        Scanner scanner = new Scanner(System.in);
        wynikMnozenia = scanner.nextInt();

        switch (wynikMnozenia){
            case 15:
                return true;
             default:
                return false;
        }
    }
    private boolean question2(){
        int poleKwadratu;
        System.out.println("Jakie jest pole kwadratu o boku 12 ?");
        Scanner scanner = new Scanner(System.in);
        poleKwadratu = scanner.nextInt();

        if(poleKwadratu==144){
            return true;
        }else{
            return false;
        }

    }
    private boolean question3(){
        int pierwiastek;
        System.out.println("Jaki jest pierwiastek z liczby 15129 ?");
        pierwiastek = scanner.nextInt();

        switch (pierwiastek){
            case 123:
                return true;
            default:
                return false;
        }

    }

}
