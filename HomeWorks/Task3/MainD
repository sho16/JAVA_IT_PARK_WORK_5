import java.util.Random;
 
public class MainD
{
    private static final int rowCounter = 4;
    private static final int columnCounter = 4;
    private static int sum=0; 
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
			sum=sum+array[i][rowCounter-1-i];
        }
		
		System.out.println("Сумма побочной диагонали :"+sum);
		
		
      
    }
}
