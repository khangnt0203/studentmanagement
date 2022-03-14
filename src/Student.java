import java.util.Scanner;

/**
 *
 * @author Khang
 */
public class Student {
    int RollNum;
    String name;
    
    //default constructor
    public Student()
    {
        RollNum=0;
        name="";
    }
    
    //constructor with parameters
    public Student (int RollNum, String name)
    {
        this.RollNum=RollNum;
        this.name=name;
    }
    int getRollNum()
    {
        return RollNum;
    }
    String getName()
    {
        return name;
    }
    void setRollNum(int newRollNum)
    {
        if(newRollNum>=0)
            RollNum=newRollNum;
    }
    void setName (String newName)
    {
        if(!newName.equals(""))
            name=newName;
    }
    void inputStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input RollNum: ");
        RollNum=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("Input Name: ");
        name=sc.next ();
    }
    void outputStudent()
    {
        System.out.print(""+RollNum);
        System.out.print(" - "+name);
    }

    
    
}
