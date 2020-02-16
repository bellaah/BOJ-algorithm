import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.acmicpc.net/problem/9996
 */
public class boj_9996 {
    public final static String MATCH_STRING = "DA";
    public final static String NOT_MATCH_STRING = "NE";
    public static String regex = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());
        String[] fileNameArray = new String[caseNum];
        String pattern = br.readLine();
        boolean isMatched = false;

        regex = makeRegularExpression(pattern);

        for (int caseIdx = 0; caseIdx < caseNum; caseIdx++) {
            fileNameArray[caseIdx] = br.readLine();
            isMatched = isMatchedFileName(fileNameArray[caseIdx]);
            printCaseResult(isMatched);
        }
    }

    public static String makeRegularExpression(String pattern) {
        return "^" + pattern.replace("*", "[a-z]*") + "$";
    }

    public static boolean isMatchedFileName(String fileName) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileName);

        return matcher.find();
    }

    public static void printCaseResult(boolean isMatched) {
        System.out.println(isMatched ? MATCH_STRING: NOT_MATCH_STRING);
    }

}
