
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khang
 */
public class SE_Student extends Student {
    float LabMark;
    float PEMark;
    
    //default constructor
    public SE_Student()
    {
        //RollNum=0;
        //name="";
        super();
        LabMark=0;
        PEMark=0;
    }
    public SE_Student(int RollNum, String name, float LabMark, float PEMark)
    {
//        this.RollNum=RollNum;
//        this.name=name;
        super(RollNum,name);
        this.LabMark= LabMark;
        this.PEMark=PEMark;
    }
    float getLabMark()
    {
        return LabMark;
    }
    float getPEMark()
    {
        return PEMark;
    }
    void setLabMark(float newLabMark)
    {
        if(newLabMark>=0 && newLabMark<=10)
            LabMark=newLabMark;
    }
    void setPEMark(float newPEMark)
    {
        if(newPEMark>=0 && newPEMark<=10)
            PEMark=newPEMark;
    }
    void inputStudent()
    {
        Scanner sc=new Scanner(System.in);
        super.inputStudent();
        System.out.println("Input Lab mark: ");
        LabMark=sc.nextFloat();
        System.out.println("Input PE mark: ");
        PEMark=sc.nextFloat();    
    }
    void outputStudent()
    {
        super.outputStudent(); //gọi hàm có trong class cha để xuất RollNum và name
        System.out.print(" - "+LabMark);
        System.out.print(" - "+PEMark);
        System.out.println(" - "+((LabMark+PEMark)/2));
        if((LabMark+PEMark)/2>=5)
            System.out.println("Status: Passed");
        else
            System.out.println("Stutus: Failed");
    }
}