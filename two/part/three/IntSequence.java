package com.netcracker.tasks.two.part.three;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }
    int next();

    static IntSequence of(int ... values) {

        return new IntSequence() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < values.length;
            }
            @Override
            public int next() {
                return values[index++];
            }
        };
    }

//    static IntSequence constant(int n) {
//        return new IntSequence() {
//            @Override
//            public boolean hasNext() {
//                return true;
//            }
//            @Override
//            public int next() {
//                return n;
//            }
//        };
//    }
    static IntSequence constant(int n) {
        return () -> n;
    }

    static void printSequence(IntSequence seq) {
        while (seq.hasNext()) {
            System.out.println(seq.next());
        }
    }
}
