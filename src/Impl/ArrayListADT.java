package Impl;
import ADTs.ListADT;

import java.util.Arrays;

public class ArrayListADT<T> implements ListADT<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T[]array;

    public ArrayListADT(int capacity){
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public ArrayListADT(){
        this(DEFAULT_CAPACITY);
    }




    public void add(T item) {

        if (array.length == size){
          doubleSizeArray();
        }

        array[size] = item;
        size++;
    }

    private void doubleSizeArray(){
        T[] arr = (T[]) new Object [array.length*2];

        for(int i = 0 ; i < array.length ; i++){
            arr[i] = array[i];
        }

        array = arr;
    }


    public void add(int index, T item) {
        if (array.length == size){
            doubleSizeArray();
        }
        indexOutOfBoundsCheck(index);

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = item;
        size++;
    }

    private void indexOutOfBoundsCheck (int index){
        if(index < 0 || index >= array.length){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public T get(int index) {
        indexOutOfBoundsCheck(index);

        return array[index];
    }

    @Override
    public void remove(T item) {
       int index = findIndex(item);
       for(int i = index; i < array.length-1 ; i++){
           array[i] = array[i+1];
       }
       array[array.length -1] = null;
        size--;
    }


    private int findIndex(T item){
        for(int i = 0 ; i < array.length ; i++){
            if( array[i] == item){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(int index, T item) {
        indexOutOfBoundsCheck(index);
        array[index] = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T item) {
        int n = array.length;
        for (T t : array) {
            if (t == item) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        for(int i = 0; i < size ; i++){
            System.out.println(array[i]);
        }
    }
}
