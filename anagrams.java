// Time Complexity : O(N * K log K)  (K log K for sorting each word, N words in total)
// Space Complexity : O(N + K)  (HashMap storing N keys with K-length strings)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. Sort each word to generate a unique key for anagram groups and use a HashMap to store them.  
// 2. If the sorted key exists, append the word to the corresponding list; otherwise, create a new list.  
// 3. Collect all grouped anagrams from the HashMap and return them as the final output.  

import java.util.*;

public class anagrams {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> op = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            String s =new String(ar);
            List<String> al  = new ArrayList<>();
            if(map.containsKey(s))
            {
                al = map.get(s);
                al.add(strs[i]);
            }
            else
            {
                al.add(strs[i]);
                map.put(s,al);
            }
        }    
        for(Map.Entry<String,List<String>> m : map.entrySet())
        {
            op.add(m.getValue());
        }
        return op;
    }
}