package z2;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "Я помню чудное мгновенье:",
                "   Передо мной явилась ты,   ",
                "",
                "   ",
                " Как мимолётное виденье,",
                " ",
                "Как гений чистой красоты.",
                ""
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder p = new StringBuilder();
        forEach: for (String line: poem) {
            if (!line.isBlank()) {
                p.append(line.trim()).append("\n");
            }
        }
        return p.toString().trim();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
