//PROJECT FOR CALCULATING STUDENT GRADE
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner gc = new Scanner(System.in);
        //input number of subjects from user
        System.out.println("Enter number of subjects: ");
        int numSubjects = gc.nextInt();
        //create an array to store marks of subjects
        int[] Marks = new int[numSubjects];
        float TotalMarks = 0;
       //input marks for subjects
        for (int i = 0; i <numSubjects; i++) {
            System.out.println("Enter the marks obtained (out of 100): "+i);
            Marks[i]=gc.nextInt();
          TotalMarks=  TotalMarks+Marks[i];
        }
        //calculate the average percentage
        float Averagepercentage=(float) TotalMarks/(numSubjects*100)*100;
        //grade of student according to avergae percentage
        char Grade;
        if(Averagepercentage>=90){
            Grade='A';
        }
       else if(Averagepercentage>=80){
            Grade='B';
        }
      else if(Averagepercentage>=70){
            Grade='C';
        }
        else if(Averagepercentage>=60){
            Grade='D';

        }
        else if(Averagepercentage>=50){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("-------------------------");
        System.out.println("Total Marks:- "+TotalMarks);
        System.out.println("Average Percentage:- "+Averagepercentage+"%");
        System.out.println("Grade:- "+Grade);
    }
}