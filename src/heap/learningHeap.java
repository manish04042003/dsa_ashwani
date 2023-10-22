package heap;

public class learningHeap {

    public static void main(String[] args) {
        heap h1 = new heap();
        h1.insert(10);
        h1.insert(20);
        h1.insert(100);
        h1.insert(30);
        h1.insert(34);
        h1.insert(345);
        h1.print();



    }
}

class heap{

    int[] arr = new int[100];
    int index = 1 ;

    public void insert(int n){
        arr[index] = n;
        checkheap(index);
        index++;
    }

    public void checkheap(int p){
        while(p>1){
            if (arr[p/2]<arr[p]){
                swap(p/2,p);
                p=p/2;
            }else break;

        }
    }

    public void delete(){
        swap(1,index-1);
        index --;
        checkheap(index/2);
    }

    public void swap(int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2]=temp;
    }

    public void sort(){
        while(index >1){
            delete();
        }
        for (int i =1 ; i <7;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(index);

    }


    public void print(){
        for (int i =1 ; i < index;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
