import java.util.*;

public class ChangeBack{
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter an amount of money that you would you like change back for: \n");
        double Change = read.nextDouble();
        System.out.println("Q D N\n");


        // I worked with the tutor last night on this, but we still weren't able to get it to work.
        // I've tried many different variations and ways of doing it, but this is the one that I currently have.
        double QRemainder = Change;
        double DRemainder;
        double NRemainder;
        boolean ChangeisFulfilled = false;
        double QuarterVal = 0.25;
        double DimeVal = 0.10;
        double NickelVal = 0.05;
        int Quarters = 0;
        int Dimes = 0;
        int Nickels = 0;
        
        Quarters = (int) (Change/ QuarterVal);
            do
            {
                //ChangeisFulfilled = false;
                //QRemainder = Change;
                QRemainder = (float) (Change - (Quarters * QuarterVal));
                //System.out.print(Quarters + " ");
                Dimes = (int) ((QRemainder + 0.01) / DimeVal);
                do
                {
                    
                    DRemainder = (float) (QRemainder - (Dimes * DimeVal));
                    //if (Quarters > 0){
                    
                    //}
                    //System.out.print(Dimes + " ");

                    Nickels = (int) ((DRemainder + 0.01) / NickelVal);
                    //do
                    //{
                        
                        NRemainder = (float) (DRemainder - (Nickels * NickelVal));
                        
                        //System.out.print(Nickels + "\n");
                        System.out.print(Quarters + " " + Dimes + " " + Nickels + "\n");
                        //Nickels--;
                        //ChangeisFulfilled = true;
                    //} while((Nickels > 0));
                    Dimes--;
                } while((Dimes >= 0));           
                Quarters--;
                if (Quarters <= 0){
                    Quarters = 0;
                }
            } while ((Quarters >= 0) && (Dimes >= -1));
        
        read.close();
    }
}