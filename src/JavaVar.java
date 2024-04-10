
public class JavaVar 
{
// datatypes
// class level vars or variables

    public static void main(String[] args) throws Exception 
    {
        // datatype varName [=value]; 
        int games = 3; 
        double allowance = 40.50;
        long battlepass; 
        // We define battlepass
        // We assign a value to battle pass
        battlepass = 15;
        // Give values to the variables for amount of battle passes that I can buy and the total cost of battle passes
        int tcost = 45;
        int amount = 2;
        

        // Print out our vars or variable values along with a string that explains our values
        System.out.println("Number of games I own = " + games);
        System.out.println("My monthly allowance = " + allowance);
        System.out.println("The cost of a single battle pass = " + battlepass);
        
        //With our current Allowance, how many battle passes will we be able to buy?
        System.out.println("With my allowance, I would be able to buy " + amount + "battlepasses");

        //What is the total cost of battle passes
        System.out.println("The total cost of" + games + " battlepasses would be " + tcost);

    }
}
