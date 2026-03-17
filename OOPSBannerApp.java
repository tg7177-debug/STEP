/**
* OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
*
* This use case extends UC5 by implementing a modular approach to generate each
* letter's pattern through dedicated methods. This enhances code reusability and
* maintainability by separating pattern generation logic from the main display logic.
*
* @author Tanvi Gupta
* @version 6.0
*/

// Extend the User Story 5 to display the OOPS banner using a modular approach...
// Key Requirements:...
// Hint:...
public class OOPSBannerApp 
{
    public static String[] getOPattern()
    {
        return new String [] {
            "   ***   "," **   ** ","**     **","**     **","**     **"," **   ** ","   ***   "};
    }
    public static String[] getPPattern()
    {
        return new String [] {
            " ** **  "," **   **"," **   **", " ** **  "," **     "," **     "," **     "};
    }
    public static String[] getSPattern()
    {
        return new String [] {
            "   ***** "," **      ","**       ","  *****  ","      ** "," **   **","  ***** "};
    }
    public static void main(String[] args) 
    {
        String[] opattern = getOPattern();
        String[] ppattern = getPPattern();
        String[] spattern = getSPattern();
        for(int i=0;i<opattern.length;i++)
            System.err.println(opattern[i] + " "+ opattern[i]+" " + ppattern[i]+ " "+ spattern[i] );
    }
}