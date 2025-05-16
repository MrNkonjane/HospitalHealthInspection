public class HospitalHealthInspection
{
    public static void main(String [] args)
    {
        int [][] inspNum = { {4, 8, 6},
                                      {5, 4, 2},
                                      {4, 2, 8}};
        
        String [] position = {"HOSPITAL 1: -->", "HOSPITAL 2: -->", "HOSPITAL 3: -->"};
        System.out.println("************************"); 
        System.out.println("HEALTH INSPECTION REPORT"); 
        System.out.println("************************");                         
        System.out.println("\t\t " + "JAN" + "\t\t" + "FEB" + "\t\t" + "MAR" + "\t\t" + "AVG" );
        displayReport(position, inspNum);
        System.out.println("************************");
        System.out.println("MONTHLY TOTALS"); 
        System.out.println("************************"); 
        String [] monthlyTotals =  {"HOSPITAL 1:", "HOSPITAL 2:", "HOSPITAL 3:"};
        displayResults(monthlyTotals, inspNum);
        System.out.println("************************");
    }
    
    private static void displayReport(String [] position, int [][] inspNum)
    {
        double sum = 0;
        for(int x = 0; x <position.length; x++)
        {
            System.out.print(position[x] + "\t ");
            sum = 0;
            for(int y = 0; y < 3; y++)
            {
                System.out.print(inspNum[x][y] + "\t\t");
                sum += inspNum[x][y];
            }
            double avarage = sum / inspNum.length;
            //double rounded = Math.round(avarage * 10000)/10000.0;
            System.out.printf("%.2f" + "\n",avarage);
        }
    }
    
    private static void displayResults(String [] monthlyTotals,  int [][]inspNum)
    {
        double total = 0;
        for(int x = 0; x < monthlyTotals.length; x++)
        {
            System.out.print(monthlyTotals[x] + "\t ");
            total = 0;
            for(int y = 0; y < 3; y++)
                      total += inspNum[x][y];
            System.out.println(total);
        }
    }
}
