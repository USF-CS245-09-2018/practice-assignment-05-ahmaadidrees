public class MergeSort implements SortingAlgorithm {


        //public int[] arr1= new int[(n+1)/2];
        //public int[] arr2= new int[n]

        public void sort(int arr[] )
        {
            mergesort(arr , 0,  arr.length-1 );
        }
        public void mergesort(int arr[], int left,  int right)
        {
            int midpoint =  ( left + right ) / 2 ;

            if  ( left == right )
                return ;

            mergesort(arr, left, midpoint );
            mergesort(arr, midpoint +1, right);

            merge(arr  , left , midpoint , right) ;
        }
        //public int[] arrayLeftSplit(int arr[]){
          //  int n= arr.length;
         //   int[] arr1 = new int[(n+1)/2];
         //   int i=0;
           // while(i<arr1.length){
           //     arr1[i]=arr[i];
          //  }
           // return arr1;

       // }

        //public int[] arrayRightSplit(int arr[]){
           // int n= arr.length;
            //int[] arr2 = new int[n/2];
            //int i=0;
           // while(i<arr2.length){
                //arr2[i]=arr[i];
            //}
            //return arr2;
       // }
        public void  merge(int arr[],   int left, int midpoint, int right)

            int size1 = midpoint-left+1 ;
            int size2 = right - midpoint ;

            int[] tempArr1= new int [size1];
            int[] tempArr2= new int [size2];


            for (int i1=0, i2=left ; i1<tempArr1.length; i1++, i2++)
            {
                tempArr1[i1]=arr[i2] ;

            }
            for (int i3=0, i4=midpoint+1; i3<tempArr2.length; i3++, i4++){
                tempArr2[i3]=arr[i4] ;
            }

            int index1 = 0 ;
            int index2 = 0 ;
            int index3 = left  ;

            while( index1 <  size1 && index2 < size2)
            {
                if (tempArr1[index1] < tempArr2[index2] )
                {
                    arr[index3]=tempArr1[index1];
                    index1++;
                    index3++;
                }

                else
                {
                    arr[index3]=tempArr2[index2];
                    index2++;
                    index3++;
                }


            } //while


            if(index1>=size1)
            {
                for(  ; index2 < size2 ; index2++, index3++){
                    arr[index3] = tempArr2[index2] ;
                }
            } else if(index2>=size2){

                for( ; index1< size1; index1++, index3++){
                    arr[index3]= tempArr1[index1];
                }
            }




        }

	        //public void print1( int[] arr1)
	       // {
//
	         //   for( int i1=0 ;i1 < arr1.length ; i1++)
	        //        System.out.println( arr1[i1] ) ;
	       // }
	       // public static void main( String args[] )
	       // {
	       //     int arr1[] = { 12 , 13 , 6 , 5 } ;
	       //     Test m1 = new Test()  ;
	       //     m1.sort( arr1) ;
	       //     m1.print1( arr1 ) ;
	       // }


}
