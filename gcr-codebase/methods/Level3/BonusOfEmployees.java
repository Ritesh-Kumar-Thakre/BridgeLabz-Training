import java.util.*;
public class BonusOfEmployees{
    public static void main(String[] args){
        double[][] employeeData = getSalaryAndService();
        double[][] updatedData=calculateBonusAndNewSalary(employeeData);
        calculateAndDisplayTotals(employeeData , updatedData);
    }

    // method to generate salary and years of service
    public static double[][] getSalaryAndService(){
        int employees=10;
        double data[][] = new double[employees][2];
        for(int i=0;i<employees;i++){
            data[i][0]=(int)(Math.random()*90000)+10000;
            data[i][1]=(int)(Math.random()*10)+1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] data){
        int employees = data.length;
        double result[][]=new double[employees][2];
        for(int i=0;i<employees;i++){
            double salary=data[i][0];
            double service = data[i][1];
            double bonus;
            if(service>5){
                bonus = salary*0.05;
            }
            else{
                bonus=salary*0.02;
            }
            result[i][0]=bonus;
            result[i][1]=salary+bonus;
        }
        return result;
    }

    // Method to calculate totals and print result
    public static void calculateAndDisplayTotals(double[][] oldData,double[][] newData){
        double totalOldSalary=0;
        double totalBonus =0;
        double totalNewSalary=0;
        System.out.println("Emp\tOldSalary\tService\tBonus\tNewSalary");
        for(int i=0;i<oldData.length;i++){
            totalOldSalary += oldData[i][0];
            totalBonus+=newData[i][0];
            totalNewSalary = totalNewSalary + newData[i][1];
            System.out.println(
                (i+1)+"\t"+
                (int)oldData[i][0]+"\t\t"+
                (int)oldData[i][1]+"\t"+
                (int)newData[i][0]+"\t"+
                (int)newData[i][1]
            );
        }
        System.out.println("\nTotal Old Salary : "+(int)totalOldSalary);
        System.out.println("Total Bonus Paid : "+(int)totalBonus);
        System.out.println("Total New Salary : "+(int)totalNewSalary);
    }
}
