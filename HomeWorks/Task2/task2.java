import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int de;
         int ost;

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Even numbers");
            System.out.println("2. Sum of ennered numbers");
            System.out.println("3. Sum of digits number");
            System.out.println("4. Exit");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
					System.out.println("Enter the couple numbers");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
					System.out.println("Result");
                if (b>=a)
                {
                    while ( b>=a)
                     {
                       if (b % 2==0)
                       {
                        System.out.println("Number");
                        System.out.println(b);
                        b=b-1;
                       }
                        else
                      { b=b-1;
                      }
                     }
                }
                 
                 else 
                 {
                    while ( b<=a)
                     {
                       if (a % 2==0)
                       {
                        System.out.println("Number");
                        System.out.println(a);
                        a=a-1;
                       }
                        else
                        { a=a-1;
                        }
                      
                     }
                     
                 
                 }
                 break;
                }
                case 2: {
                     System.out.println("Enter the number");
                    int a = scanner.nextInt();
                    int sum=0;
                    System.out.println("Enter the quantity of number equal:" + a);
                    
                    while (a!=0)
                    { int chislo = scanner.nextInt();
                     sum=chislo+sum;
                     a=a-1;
                    }
                    System.out.println("Sum of  numbers:" );
                    System.out.println(sum);
                    break;
                }
                case 3: {
                    System.out.println("Enter the number");
                    int a = scanner.nextInt();
                    int b;
                    int sum=0;
                    while(a!=0)
                    { 
                      b=a%10;
                      sum=sum+b;
                      a=a/10;
                    
                    }
                    System.out.println(sum);
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}