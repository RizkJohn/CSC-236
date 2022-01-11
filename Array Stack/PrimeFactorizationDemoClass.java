package lab4_1;

public class PrimeFactorizationDemoClass {
	public static void main(String [] args) {
		ArrayStackDataStrucClass<Integer> factorStack = new ArrayStackDataStrucClass<Integer>(50);

        int n[] = new int[]{3960, 1234, 222222, 13780};
        int i = 0;
        
        System.out.println("Factor Stack Elements:\n");
        while (i <= 3)
        {
            try
            {
                int d = 2;
                while (n[i] > 1)
                {
                    if (n[i] % d == 0)
                    {
                        factorStack.push(d);
                        n[i] = n[i] / d;
                    } else
                        d++;
                }
            } catch (StackOverflowException e) {
                System.out.println(e.toString());
               }
            
            
            System.out.print("Prime Factors are: ");
            
            while (!factorStack.isEmptyStack())
            {
                System.out.print(factorStack.peek());
                factorStack.pop();
                if (!factorStack.isEmptyStack())
                    System.out.print(" * ");
            }
            System.out.println();
            i++;
        }
		
	}

}
