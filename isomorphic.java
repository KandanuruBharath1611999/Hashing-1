// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. Use a HashMap to store character mappings from `s` to `t` and a HashSet to track mapped characters.  
// 2. If a character in `s` is already mapped, check if it maps to the correct character in `t`.  
// 3. If a new character in `s` maps to an already used character in `t`, return false; otherwise, store the mapping.  

import java.util.*;

public class isomorphic 
{
    public boolean isIsomorphic(String s, String t) {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sch.length;i++)
        {
            if(map.containsKey(sch[i]))
            {
                if(tch[i]!=map.get(sch[i]))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(tch[i]))
                {
                    return false;
                }
                map.put(sch[i],tch[i]);
                set.add(tch[i]);
            }
        }
        return true;
    }
}
