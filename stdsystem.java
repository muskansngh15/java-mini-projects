import java.util.*;
class task1
{
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int avg,i;
    void read()
    {
        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the marks (out of 100): ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        avg=(sum/n)*100;
    }
    void display()
    {
        System.out.println("Total Marks: "+sum);
        System.out.println("Average percentage: "+avg);
        System.out.println("Grades: ");
        if(avg>=90)
            System.out.println("O Grade");
        else if(avg>=80 && avg<90)
            System.out.println("A+ Grade");
        else if(avg>=70 && avg<80)
            System.out.println("A Grade");
        else if(avg>=60 && avg<70)
            System.out.println("B+ Grade");
        else
            System.out.println("Needs Improvement");
    }
    public static void main(String args[])
    {
        task1 obj=new task1();
        obj.read();
        obj.display();
    }
}
