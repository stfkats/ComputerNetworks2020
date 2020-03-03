
/**
 * Γράψτε μια περιγραφή της κλάσης ProblemSolver εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class BinaryToDecimalCalculator
{

    private boolean status ; // αυτή η μεταβλητή δείχνει την κατάσταση της συσκευής
    private double lcd;

    /**
     * Κατασευαστής αντικειμένων της κλάσης ProblemSolver
     */
    public BinaryToDecimalCalculator()
    {
        status = false; //    η αρχική κατάσταση είναι κλειστό!
        lcd= 0; // η αρχική οθονη δειχνει 0
    }

    /**
     * asdasdasdasd
     */
    public void turnOn()
    {
        if (status == false)
        {
            status = true;
        }
    }

    /**
     * asdasdasdasd
     */
    public void turnOff()
    {
        if (status == true)  // αν ειναι ανοιχτο να το κλεισει
        {
            status = false;
        }
    }

    public void averageThreeIntegers(int num1, int num2, int num3)
    {
        if (status == true)
        {
            // εαν η συσκευη ειναι ανοιχτη κανε τα παρακατω
            double average=0; 
            average=(double)(num1+num2+num3)/3; 
            System.out.println("The average is  :"+average); 
        }
        else
        {
            System.out.println("Η συσκευή είναι κλειστή!");  
        }
    }

    public  long convertDecimalToBinary(long n)
    {
        if (status == true)
        {
            long binaryNumber = 0;
            long remainder ;
            long i = 1;
            int step = 1;
            long num = n;

            while (n!=0)
            {
                remainder = n % 2;
                System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
                n /= 2;
                binaryNumber += remainder * i;
                i *= 10;
            }
            System.out.printf("%d in decimal is %d in binary\n" , num, binaryNumber );
            return binaryNumber;
        }
        else
        {
            System.out.println("Η συσκευή είναι κλειστή!");  
        }
        return 0;
    }

    public int convertBinaryToDecimal (long n)
    {

        int decimalNumber = 0; // κρατάει το αποτέλεσμα των υπολογισμών κάθε επανάληψης -το τελικό αποτέλεσμα
        int i= 0;  // δειχει τη θέση του αριθμού από το λιγοτερο σημαντικό ψηφίο για την ύψωση στη δύναμη του 2      
        int step = 1; // κρατάει το βήμα κάθε επανάληψης 
        long remainder ; // το ψηφίο που εξετάζουμε σε κάθε επανάληψη (
        long num = n; // κρατάει την αρχική τιμή της παραμέτρου (n)

        while (n!=0)
        {
            remainder = n % 10;  // παίρνει το τελευταίο ψηφίο του n διαιρώντας με το 10 (υπόλοιπο)
            if ((remainder ==0) || (remainder == 1))  // αν το ψηφιο δεν ειναι 0 ή 1 τοτε ο αριθμος δεν ειναι δυαδικος
            {
                n /= 10; //διαιρούμε με το 10 για να πάρουμε τον αριθμό που προκύπτει για την επόμενη επανάληψη
                decimalNumber += remainder * Math.pow(2,i); // προσθέτουμε στο προηγούμενο αποτέλεσμα το remainder * 2^i
                System.out.printf("Step %d: %d/10, Remainder = %d. Quotient = %d, decimal = %d\n", step++, n*10, remainder, n, decimalNumber);
                ++i; // Η θέση υψωσης σε δύναμη αυξάνεται στον επόμενο αριθμό
            }
            else{
                System.out.println("This is not a binary number...exiting");
                return 0;
            }
        }
        System.out.printf("%d in  binary is %d in decimal\n", num, decimalNumber);
        return decimalNumber;

    }

    public long addTwoBin(long n1, long n2)
    {
        long dec1 = convertBinaryToDecimal(n1);
        long dec2 = convertBinaryToDecimal(n2);
        long sum = dec1 + dec2;
        long result = convertDecimalToBinary(sum);
        System.out.printf("Το άθροισμα των %d + %d είναι %d", n1, n2, result);
        return result;
        
        
        
    }
}
