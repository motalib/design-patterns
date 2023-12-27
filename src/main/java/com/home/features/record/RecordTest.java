package com.home.features.record;

import java.util.Iterator;

public class RecordTest {

    record Range(int start, int end) implements Iterable<Integer> {
        Range {
            if (end < start) {
                throw new IllegalArgumentException("begin should be less than end");
            }
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<>() {
                int index = start;

                @Override
                public boolean hasNext() {
                    return index < end;
                }

                @Override
                public Integer next() {
                    return index++;
                }
            };
        }
    }


    public static void main(String[] args) {
        Range range = new Range(0, 5);
        System.out.println(range);

        for (int value : range) {
            System.out.println(value);
        }
    }
}
