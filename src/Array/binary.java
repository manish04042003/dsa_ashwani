package Array;

public class binary {
    public static void main(String[] args) {
        int[] arr = {1,4};
        int tar = 4 ;
        int s = 0 ;
        int l = arr.length -1 ;
        int m = l/2;

        while(s<=l){
            if(tar>arr[m]){
                s =m + 1 ;
                m = ((l-s)/2) + s;
            } else if (tar<arr[m]) {
                l = m - 1 ;
                m = ((l-s)/2) + s;
            } else{
                System.out.println(m);
                int as = m;
                int al = m ;
                while (as>=0 && arr[as]==tar){
                    as--;
                    System.out.println(as);
                }
                while (al<arr.length && arr[al]==tar){
                    al++;
                    System.out.println(al);
                }
                System.out.println(as+" "+al);
                return;
            }
        }

    }
}
