import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLongestSubstringTest {
    private FindLongestSubstring findLongestSubstring;

    private final String str = "abcabcbb";
    private final String str1 = "bbbb";
    private final String str2 = "pwwkew";

    @BeforeEach
    void setUp(){
        findLongestSubstring = new FindLongestSubstring();
    }

    @Test
    void testThatMethod_lengthOfLongestSubstringWorks_forFirstString(){
        int result = findLongestSubstring.lengthOfLongestSubstring(str);
        assertEquals(result, 3);

    }
    @Test
    void testThatMethod_lengthOfLongestSubstringWorks_forSecondString(){
        int result = findLongestSubstring.lengthOfLongestSubstring(str1);
        assertEquals(result, 1);

    }
    @Test
    void testThatMethod_lengthOfLongestSubstringWorks_forThirdString(){
        int result = findLongestSubstring.lengthOfLongestSubstring(str2);
        assertEquals(result, 3);

    }

}


