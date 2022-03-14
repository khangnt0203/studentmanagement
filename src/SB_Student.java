
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
public class SB_Student extends Student{
    float MathMark;
    String Skill;
    
    public SB_Student()
    {
        super();
        MathMark=0;
        Skill="";
    }
    
    public SB_Student(int RollNum, String name, float MathMark, String Skill)
    {
        super(RollNum,name);
        this.MathMark= MathMark;
        this.Skill= Skill;
    }
    
    float getMathMark()
    {
        return MathMark;
    }
    
    String getSkill()
    {
        return Skill;
    }
    
    void setMathMark(float newMathMark)
    {
        if (newMathMark >= 0 && newMathMark <=10)
            MathMark = newMathMark;
    }
    
    void setSkill(String newSkill)
    {
        if (!Skill.equals(""))
            Skill=newSkill;
    }
    
    void inputStudent()
    {
        Scanner sc=new Scanner(System.in);
        super.inputStudent();
        System.out.println("Input Math Mark: ");
        MathMark=sc.nextFloat();
        System.out.println("Input Skill: ");
        Skill=sc.next();
        
    }
    
    void outputStudent()
    {
        super.outputStudent();
        if(!Skill.equals(""))
        {
            if(MathMark+MathMark*0.1<=10)
                MathMark+=MathMark;
            else
                MathMark=10;
        }
        System.out.print(" - "+MathMark);
        System.out.println(" - "+Skill);
        if(MathMark>=5)
            System.out.println("Status: Passed");
        else
            System.out.println("Status: Failed");
    }

    @Override
    public String toString() {
        return name+" - "+Skill; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
