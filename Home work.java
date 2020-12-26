 // 1. create an array of double numbers with these numbers: 0.9, -6.5555, 3.24, 10.11, 20.35
           double[] arr_double = {0.9, -6.5555, 3.24, 10.11, 20.35};
           
 // 1.1. print the first element  
 // 1.2. print the last elemen
 // 1.3. print the middle element
         System.out.println(arr_double[0]);
         System.out.println(arr_double[4]);
         System.out.println(arr_double[2]);
       
  // 1.4. write a for loop which prints all the element in the array
          for (int index = 0; index < arr_double.length; index++) 
          System.out.println(arr_double[index]);
           
  //1.5. write a for loop which prints all the element in the array in reverse
         for (int index =arr_double.length-1; index >= 0; index--) 
         System.out.println(arr_double[index]);  
         
 // 1.6. use scanner to read a double number from the user. print all the elements in the array which are bigger than the user-number
         double[] arr_double = {0.9, -6.5555, 3.24, 10.11, 20.35};
         Scanner s = new Scanner(System.in);
         System.out.println(" Enter 5 numbers:");
         int [] user_array = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
         for ( int i =0; i < arr_double.length; i++){
                if (arr_double[i] > user_array[i]){
                 System.out.println(arr_double[i]);
                user_array[0]++;}
            }     
                
           
  // 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
  // 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
  // 2.2. copy all elements from A to B
        int[] num_array = {4, 10, 20, 40, 1000};
        int[] zero_array = {0, 0, 0, 0, 0};
           for ( int i =0; i < num_array.length; i++)
             zero_array[i] = num_array [i];
             zero_array[0] ++;
           for (int i = 0; i < zero_array.length; i++)
           System.out.println(zero_array[i]);
           
  // Etgar : 
        int[] num_array = { 1, 3, 5, 8, 8, 5, 3, 1};
        int a=0;
        for (int i = 0; i < num_array.length; i++) {
            for (int k = i + 1; k < num_array.length; k++) {
                if (num_array[i] == num_array[k]) {
                    a++;
                }
            }
        }
          if ( num_array.length == a*2 )
              System.out.println(" This is polindrom");
          else
              System.out.println(" This is  not polindrom");
   
           
