package Array;

public class leetcode {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int max  = Integer.MIN_VALUE;
        int lmax  = Integer.MIN_VALUE;
        int maxi  = 0;
        int lmaxi = -1;
        for(int i =0 ; i < arr.length ; i++){
            if(max<arr[i] ){
                if (lmaxi>maxi){
                    if ((lmaxi-maxi-1)*lmax<(lmaxi-i-1)*lmax){
                        lmax  = max;
                        max = arr[i];
                        lmaxi = maxi;
                        maxi = i ;
                    }
                }else {
                    if ((maxi-lmaxi-1)*lmax<(i-lmaxi-1)*lmax){
                        lmax  = max;
                        max = arr[i];
                        lmaxi = maxi;
                        maxi = i ;
                    }
                }
            }

            if (lmax<arr[i]){
                if (lmaxi>maxi){
                    if((lmaxi-maxi-1)*lmax<(lmaxi-maxi-1)*arr[i]){
                        lmax = arr[i];
                        lmaxi = i ;
                    }
                }else {
                    if((lmaxi-maxi-1)*lmax<(lmaxi-maxi-1)*arr[i]){
                        lmax = arr[i];
                        lmaxi = i ;
                    }
                }
            }


        }

        if (lmaxi > maxi){
            System.out.println((lmaxi-maxi)*lmax);
        }else {
            System.out.println((maxi - lmaxi)*lmax);
        }



    }

}
