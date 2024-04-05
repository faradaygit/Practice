package com.ufa;

import java.util.HashMap;

public class TestString {
    public static void main(String[] args) {
        // 1. ArrayList vs LinkedList
        // 2. List vs Set
        // 3. Map -> HashMap -> equals()/HashCode()
        // key must be immutable

        // Collections
        // Concurrency
        // SQL Linux Docker Spring
        // Algorithms, code.

        HashMap<A, Object> map = new HashMap<>(0);
        A a = new A(1);
        map.put(a, 3);
        a.i = 2;
        Object o = map.get(new A(1));
        Object o2 = map.get(new A(2));
        System.out.println(o);
        System.out.println(o2);
    }


    static class A {
        Integer i;

        A(Integer i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;
            if (o instanceof A) {
                return this.i.equals(((A) o).i);
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            // 2^32
            return i;
        }
    }
}
