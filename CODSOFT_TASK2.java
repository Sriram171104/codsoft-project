/*CODSOFT PROJECT 2: STUDENT GRADE CALCULATOR PROGRAM USING JAVA */

import java.util.Scanner;

class studentdetails
{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("\t \t STUDENT GRADE CALCULATOR");
        System.out.println("Enter the no. of students:");
        int no_stud=scan.nextInt();
        System.out.println("Enter no. of subject");
        int no_sub=scan.nextInt();
        scan.nextLine();

        String[] name=new String[no_stud];
        int[][] mark=new int[no_stud][no_sub];
        int sum[]=new int[no_stud];
        double avg[]=new double[no_stud];
        char grade[]=new char[no_stud];

        for(int i=0;i< no_stud;i++)
        {    
            System.out.print("Student name "+ (i+1) +":");
            name[i]=scan.nextLine();
            System.out.println("\nEnter the student marks");
            sum[i]=0;
            for(int j=0;j<no_sub;j++)
            {
                System.out.print("Enter subject "+(j+1)+" mark:");
                mark[i][j]=scan.nextInt();

                sum[i]+=mark[i][j];
            }
            avg[i]=0;
            avg[i]=sum[i]/no_sub;   
            scan.nextLine();       
            System.out.println('\n');           
        }

        for(int i=0;i<no_stud;i++)
        {
            if(avg[i]>=90)
            {
                grade[i]='A';
            }
            else if(avg[i]>80 && avg[i]<90)
            {
                grade[i]='B';
            }
            else if(avg[i]>70 && avg[i]<80)
            {
                grade[i]='C';
            }
            else if(avg[i]>60 && avg[i]<70)
            {
                grade[i]='D';
            }
            else
            {
                grade[i]='E';
            }
        }    

        for(int i=0;i<no_stud;i++)
        {
             
            System.out.println("\t\t Student name: "+name[i]);
            System.out.println("Total mark secured: "+sum[i]);
            System.out.println("Average : "+avg[i]);
            System.out.println("Grade:  "+grade[i]);
        }
    }      
}
