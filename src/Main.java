//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean stringaPariDispari (String str) {
        int lunghezza = str.length();
        if (lunghezza % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean annoBisestile (int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(annoBisestile(1900));


    }
}