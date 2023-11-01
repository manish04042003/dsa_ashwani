package linkedlist;

import java.util.List;

public class implimention {

    static class Node{
        Node next ;
        int data;
        Node(int d){
            this.data = d;
            next = null;
        }
    }

    static class Linkedlist{
        Node head ;
        int Size;
        Node tail;
        Linkedlist(){
            this.Size = 0;
        }

        void addLast(int d){
            Node newNode = new Node(d);
            if (Size==0){
                head = newNode;
                tail = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            Size++;
        }

        void addFirst(int d){
            Node newNode = new Node(d);
            if (Size==0){
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = head;
                head  = newNode ;
            }
            Size ++;
        }

        void print(){
            Node temp = head;
            for (int i =1 ; i <= Size;i++){
                System.out.print(temp.data + " ");
                temp =  temp.next;
            }
            System.out.println(" ");
        }

        void deleteFirst(){
            if (Size==0){
                System.out.println("You dont Have Node in you LinkedList");
                return;
            }
            head = head.next;
            Size--;
        }

        int getFirst(){
            if (Size ==0){
                System.out.println("List is Empty");
                return -1;
            }else{
                return head.data;
            }
        }

        int getLast(){
            if (Size==0){
                System.out.println("List is Empty");
                return -1;
            }else{
                return tail.data;
            }
        }


        int getIndex(int i){
            if (i <0 || i >=Size){
                System.out.println("Invalid Argument");
                return -1;
            }else {
                Node temp = head;
                for (int j=1 ; j<= i; j++){
                    temp= temp.next;
                }
                return temp.data;
            }
        }

        void inserinto(int index,int data){
            if (index<0 || index>=Size){
                System.out.println("Invalid Argument");
                return;
            }
            if (index == 0){
                addFirst(data);
            }else if (index == Size-1){
                addLast(data);
            }else {
                Node newNode = new Node(data);
                Node temp = head;

                for (int i =0 ; i < index; i++){

                }
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        l.addFirst(100);
        l.addLast(4);
        l.addLast(10);
        l.addLast(23);
        l.addFirst(34);
        l.print();


        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getIndex(2));
        System.out.println(l.getFirst());
        System.out.println(l.getIndex(4));

    }
}


