package day28_MultiDimensionalArray;

public class ArrayPractice4 {

    public static void main(String[] args) {
        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat","Aliya","Bektemir","Pedro"};
        //      index numbers:      0        1         2        3          4        5       6           7

        int[] employeeSalary = {100000, 110000, 105000, 120000, 125000,125000,125000,100000};
        // index numbers:         0       1       2        3       4        5       6   7

        int max = employeeSalary[0];
        for (int each : employeeSalary){
            if (each > max){
                max = each;
            }
        }

        System.out.println(max);

        for (int i =0 ; i <= employeeNames.length-1;i++){
            if(max==employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }





    }
}
