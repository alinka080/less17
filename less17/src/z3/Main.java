package z3;

public class Main {
    public static void main(String[] args){
        FindRepeats findRepeats = new FindRepeats();
        String text = "abc abc dsd fgcc";
        String substring ="abc";
        int result = findRepeats.numberOfRepeats(text,substring);
        System.out.println("Количество вхождений:" + result);
    }
}