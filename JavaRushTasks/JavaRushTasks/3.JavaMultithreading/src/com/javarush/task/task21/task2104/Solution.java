package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
            if (n == null) return false;
            if (n == this)  return true;
//            if(n.getClass() != this.getClass()) return  false;
            if (!(n instanceof Solution)) return false;
            Solution sol = (Solution) n;
//            if (first == null || sol.first == null || last == null || sol.last == null) return  false;
//            return first.equals(sol.first) && last.equals(sol.last);

            if (sol.first == null && first == null && sol.last == null && last == null) return true;
            if ((sol.first == null && first != null) || (sol.last == null && last != null)) return  false;
            if (sol.first == null && sol.last.equals(last)) return true;
            if (sol.last == null && sol.first.equals(this.first)) return true;
            return first != null && first.equals(sol.first) && last.equals(sol.last);


    }


    public int hashCode() {
        return (31 * ((first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0)));
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println((new Solution("Donald1", "Duck")).equals(new Solution("Donald1", "Duck")));
//        System.out.println((new Solution("Donald", "Duck")).hashCode());
//        System.out.println((new Solution("Donald", "Duck")).hashCode());
        System.out.println(s.contains(new Solution("Donald", "Duck")));

    }
}
