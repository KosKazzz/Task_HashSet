import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    private HashSet<String>  hashSetForTest;

    public WordsChecker(String text){
        String[] textArray = text.split("\\P{IsAlphabetic}+");
        hashSetForTest = new HashSet<>();
        hashSetForTest.addAll(Arrays.asList(textArray));
    }
    public boolean hasWord(String word){
        return hashSetForTest.contains(word);
    }
}
