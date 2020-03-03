/**
 * Αυτό αποτελεί ένα εξελιγμένο κομπιουτεράκι.
 * Προσφέρει μαθηματικές υπηρεσίες όπως:
 * 1.
 * 2.
 * 3.
 * 4.
 * 
 * @author (Νικόλαος Λαζαρίδης) 
 * @version (1.0 - 24/1/2020)
 */
public class ProblemSolver
{
    boolean  katastasi;  // δηλώνει την κατάσταση της συσκευής (ανοιχτή/κλειστή)

    /**
     * Κατασευαστής αντικειμένων της κλάσης ProblemSolver
     */
    public ProblemSolver()
    {

        katastasi  = false; // αρχικά θέλουμε η συσκευή μας να είναι κλειστή
    }

    /**
     * Ανοίγει τη συσκευή
     * 
     */
    public void Anoikse()
    {
        if (katastasi == false)
        {
            katastasi = true;
        }
        else
        {
            System.out.println("Η συσκευή είναι ήδη ανοιχτή!");
        }
    }

    /**
     * Κλείνει τη συσκευή
     */
    public void Kleise()
    {
        if (katastasi == true)
        {
            katastasi = false;
        }
        /*else
        {
        System.out.println("Η συσκευή είναι ήδη κλειστή!");
        }
         */
    }

    /**
     *  Υπολογίζει το Μ.Ο. 3 ακεραίων αριθμών
     *  
     *  @param AM ο αριμθμός μητρώου
     *  @param EX το εξάμηνο φοίτησης
     *  @param AMKA το AMKA του φοιτητή
     */
    public void averageThreeIntegers(int ΑΜ, int ΕΧ, int ΑΜΚΑ) 
    {
        if (katastasi == true)
        {
            double average=0; 
            average=(ΑΜ+ΕΧ+ΑΜΚΑ)/3.0; 
            System.out.println("The average is :"+average); 
        }
        else
        {
            System.out.println("Η συσκευή είναι κλειστή");
        }   

    }

    /** 
     * 
     * Επιλύει την α-βάθμια εξίσωση
     */
    public void firstDegreeEquation(double a, double b) 
    {
        if (katastasi == true)
        {
            // εδω θα αντιγραψω τον κωδικα επιλυσης α-βαθμιας
        }
        else
        {
            System.out.println("Η συσκευή είναι κλειστή");
        }

    }

    /** 
     * Μετατρέπει έναν δυαδικό αριθμό σε δεκαδικό
     * 
     * @param n o δυαδικός προς μετατροπη αριθμος
     * @return ο δεκαδικός αριθμός
     */
    public  int convertBinaryToDecimal (long n)
    {
        if (katastasi ==true)
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
        else
        {
            System.out.println("Η συσκευή είναι κλειστή");
             return 0;
        }

    }

    public   long convertDecimalToBinary(long n)
    {

        if (katastasi  == true)
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
            System.out.println("Η συσκευή είναι κλειστή");
            return -1;   
        }

    }
    
    public long add2Bin(long n1, long n2)
    {
        return convertDecimalToBinary(convertBinaryToDecimal(n1) + convertBinaryToDecimal(n2));
        
    
    }
}
