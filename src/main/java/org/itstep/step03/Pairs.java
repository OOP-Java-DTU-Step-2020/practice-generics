package org.itstep.step03;

import java.util.Iterator;

///**
// * Iterable collection of Pair objects.
// *
// * @author Michael S. Kirkpatrick and Nathan Sprague
// * @version V1, 8/2017
// */
//public class Pairs<K, V> implements Iterable<Pair<K, V>> {
//
//    /* Declare a fixed-size array (maximum 10 elements) of Pair objects */
//
//    /**
//     * Create a collection that will store items added as pairs.
//     */
//    public Pairs() {
//    }
//
//    /**
//     * Create a new Pair and add it to the collection if there's space.
//     *
//     * @param first  The first object.
//     * @param second The second object.
//     */
//    public boolean addPair(K first, V second) {
//        return true;
//    }
//
//
//    @Override
//    public Iterator<Pair<K, V>> iterator() {
//        return new PairIterator();
//    }
//
//    /*
//     * Implement an Iterator here based on the API documentation at
//     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
//     * specified
//     */
//    private class PairIterator implements Iterator<Pair<K, V>> {
//
//        @Override
//        public boolean hasNext() {
//            throw new UnsupportedOperationException();
//        }
//
//        /**
//         * Return the next Pair in the iterator.
//         */
//        @Override
//        public Pair<K, V> next() {
//            throw new UnsupportedOperationException();
//        }
//
//        /**
//         * Remove the previous Pair returned by next() from the LinkedList.
//         */
//        @Override
//        public void remove() {
//            throw new UnsupportedOperationException();
//        }
//    }
//}
