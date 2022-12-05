import java.util.*;

public class FindLongestSubstring {
    private int spyStart = 0;
public int lengthOfLongestSubString(String str) {
    int count = 0;
    String[] chars = str.split("");
    int[] charCount = new int[str.length()];
    String[] charCheck = new String[str.length()];

        for (int j = 0, k = 0; j < str.length(); j++,k++) {
            if (checkOccurrence(charCheck, chars[j])){
                k = 0;
                spyStart = j;
            }
            charCount[j] = k;
            charCheck[j] = chars[j];
        }
    int maxIndex = findMaxIndex(charCount);
    System.out.println(Arrays.toString(charCount));

    String[] result = new String[maxIndex+1];
    boolean endTraverse = true;

    while(endTraverse){
        result[maxIndex] = charCheck[maxIndex];
        if (charCount[maxIndex]==0)endTraverse = false;
        maxIndex--;
    }

    // count letters
    for (String s : result) {
        if (s != null) count++;
    }
    return count;
}

private Boolean checkOccurrence(String[] arr, String str){
    for (int i = spyStart; i < arr.length; i++) {
        if (Objects.equals(arr[i], str)) {
            return true;
        }
    }
    return false;
}

private int findMaxIndex(int[] arr) {
    int max = arr[0];
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max){
            max = arr[i];
            maxIndex = i;
        }
    }
    return maxIndex;
}


    public static void main(String[] args) {
        FindLongestSubstring findLongestSubstring = new FindLongestSubstring();
        String str = "bbbb";
        int res = findLongestSubstring.lengthOfLongestSubString(str);
        System.out.println(res);
    }

}
