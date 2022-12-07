import java.util.*;

public class FindLongestSubstring {


    private int spyStart = 0;

    // Method One
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


    System.out.println(Arrays.toString(charCheck));
    System.out.println(Arrays.toString(charCount));
    int maxIndex = findMaxIndex(charCount);
    return charCount[maxIndex] + 1;
}

    private Boolean checkOccurrence(String[] arr, String str){
        for (int i = spyStart; i < arr.length; i++) {
            if (Objects.equals(arr[i], str)) {
                return true;
            }
        }
        return false;
    }

    // method two
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

    public int lengthOfLongestSubstring(String s) {

        int previousSubstringLength = 0;
        StringBuilder currentSubString = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(currentSubString.toString().indexOf(s.charAt(i)) == -1){
                currentSubString.append(s.charAt(i));
            }else{
                if(currentSubString.length()>previousSubstringLength){
                    previousSubstringLength = currentSubString.length();
                }
                int index = currentSubString.toString().indexOf(s.charAt(i));
                currentSubString = new StringBuilder(currentSubString.substring(index + 1, currentSubString.length()) + s.charAt(i));
            }
        }
        return Math.max(currentSubString.length(), previousSubstringLength);
    }


    public static void main(String[] args) {
        FindLongestSubstring findLongestSubstring = new FindLongestSubstring();
        String str = "dvdf";
        int res = findLongestSubstring.lengthOfLongestSubstring(str);
        System.out.println(res);
    }

}
