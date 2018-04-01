import java.util.Random;
 
public class MainC
{
    private static final int rowCounter = 3;
    private static final int columnCounter = 4;
 
    public static void main(String args[])
    {
        Random random = new Random();
        int array[][] = new int[rowCounter][columnCounter];
        for(int i = 0; i < rowCounter; i++)
        {
            for(int j = 0; j < columnCounter; j++)
            {
                array[i][j] = random.nextInt(10);
				
				System.out.print(array[i][j]+ "\t");
            }
			
			System.out.println();
			
        }
		
		System.out.println("Минимумы по строкам:");
		
		
       for(int i = 0; i < rowCounter; i++)
        {
            int minimum = array[i][0];
            for(int j = 1; j < columnCounter; j++)
            {
              if(array[i][j] < minimum)
               {
                   minimum = array[i][j];
               }
            }
            System.out.println(minimum);
        }
    }
}