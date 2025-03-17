// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -

//Approach:
// Split the given string into words and check if its length matches the pattern.
// Use a HashMap to map characters to words and a HashSet to track unique words.
// If a mapping conflict occurs, return false; otherwise, return true.

import java.util.*;

public class word_pattern {
    public boolean wordPattern(String pattern, String s) 
    {
        char[] ch = pattern.toCharArray();
        String[] words = s.split(" ");
        if(ch.length!=words.length)
        {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                if(!words[i].equals(map.get(ch[i])))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(words[i]))
                {
                    return false;
                }
                set.add(words[i]);
                map.put(ch[i],words[i]);
            }
        }
        return true;
    }
}
