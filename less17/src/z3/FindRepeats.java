package z3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        int index = 0;
        StringBuilder t = new StringBuilder(text);
        while ((index = t.indexOf(substring)) != 1) {
            count++;
            t.delete(0,index + substring.length());
        }
        return count;
    }
}
