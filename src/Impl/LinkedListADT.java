package Impl;
import ADTs.ListADT;

public class LinkedListADT<T> implements ListADT<T> {
    private ListNode<T> head;
    private ListNode<T> tail;

    private int size;

    public LinkedListADT(){
        head = tail = null;
        size = 0;
    }

    public void addFront(T item){
        ListNode<T> newNode = new ListNode<>(item);

        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public void addBack(T item){
        ListNode<T> newNode = new ListNode<>(item);

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    @Override
    public T get(int index) {
        if(!isEmpty()){
            if(index > size-1 || index < 0){
                throw new IndexOutOfBoundsException();
            }else{
                ListNode<T> temp = head;
                int count = 0;
                while(count != index){
                    temp = temp.next;
                    count++;
                }
                return temp.data;
            }
        }
       return null;
    }

    @Override
    public void remove(T item) {
        if (head == null) {
            return;
        }

        if (head.data.equals(item)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        ListNode<T> prev = head;
        ListNode<T> curr = head.next;

        while (curr != null) {
            if (curr.data.equals(item)) {
                prev.next = curr.next;
            if (curr == tail) {
                    tail = prev;
                }
                size--;
                return;
            }
    prev = curr;
    curr = curr.next;
        }
    }

    @Override
    public void set(int index, T item) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public boolean contains(T item) {
        ListNode<T> temp = head;

        while(temp != null){
            if(temp.data == item){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public void print() {
        if(head != null){
            ListNode<T> temp = head;

            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
