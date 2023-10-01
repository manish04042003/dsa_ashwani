package leaningStack;

import java.util.Scanner;

class implimentstack{
    int arr[];
    int top;
    implimentstack(int l){
        arr = new int[l];
        top = -1;
    }

    public void push(int value){
        if (top==arr.length){
            System.out.println("Stack Is Full");
            return;
        }
        top ++;
        arr[top]= value;

    }
    public int pop(){
        if (size()==0){
            System.out.println("Sack is empty");
            return -1;
        }
        int temp = arr[top];
        arr[top] = 0;
        top--;
        return temp;
    }

    public int size(){
        return top+1;
    }

    public int top(){
        return arr[top];
    }

    public void display(){
        if (top<0){
            System.out.println("Stack is Empty");

        }else {
            for(int data: arr){
                System.out.print(data + " ");
            }
        }
    }
}
public class implimentStackfromArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Stack");
        int arrLenght = sc.nextInt();
        implimentstack mystck = new implimentstack(arrLenght);

        mystck.push(3);
        mystck.push(9);
        mystck.push(5);
        mystck.push(4);

        int popval = mystck.pop();
        System.out.println(popval + "pop Value ");

        int topval = mystck.top();
        System.out.println(topval + "pop Value ");

        mystck.display();





    }
}
