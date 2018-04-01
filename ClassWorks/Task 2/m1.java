 class TestArray {

   public static void main(String[] args) {
      int[] myList = {5,6,1,2,2};

      // Вывести на экран все элементы массива
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
		 
      }
	  myList[2]=2;
	  myList[3]=3;
	  myList[4]=0;
	  System.out.println ( myList[i]);
	  
   }
}