package Impl;

public class ListNode<T> {
    T data ;
    ListNode<T> next;

    public ListNode(T value){
        data = value;
        next = null;
    }
}
