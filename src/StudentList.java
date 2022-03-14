
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
public class StudentList {
    Student[] list;
    int count;
    String newName;
    float newLabMark;
    float newPEMark;
    public StudentList()
    {
        list=new Student[100];
        count=0;
    }
    //hàm này để thêm 1 sv mới vào list
    public boolean addStudent(Student s)
    {
        if(count>=100) return false;
        list[count]=s;
        count++;
        return true;
    }
    public void displayAll()
    {
        for(int i=0; i<count;i++)
            list[i].outputStudent();
    }
    //hàm này chỉ xuất thông tin của Sv SE
    public void displaySEStudent()
    {
        for(int i=0; i<count; i++)
        {
            //SV tại vị trí i có kiểu là SE_Student
            if(list[i] instanceof SE_Student)
                list[i].outputStudent();
        }
    }
    public void displaySBStudent()
    {
        for(int i=0; i<count; i++)
        {
            if(list[i] instanceof SB_Student)
                list[i].outputStudent();
        }
    }
    //hàm này tìm labMark lớn nhất
    public float getLabMax()
    {
        float max = 0;
        for(int i=0; i<count; i++)
            if(list[i] instanceof SE_Student)
                if(max<((SE_Student)list[i]).LabMark)
                    max=((SE_Student)list[i]).LabMark;
        return max;
    }
    //hàm này để đếm số SV có điểm labMark >=5
    public int countLab()
    {
        int countLab=0;
        for (int i=0; i<count; i++)
            if(list[i] instanceof SE_Student)
                if((((SE_Student)list[i]).LabMark)>=5)
                    countLab++;
        System.out.println("No of Student (LabMark upto 5): "+countLab);
                    
        return countLab;
    }
    //hàm này để xuất các SV có skill theo yêu cầu
    //ví dụ: input là "excel" thì sẽ xuất sv có skill excel
    public void displaySkill()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Skill:");
        String requireSkill = sc.nextLine();
        for(int i=0; i<count;i++)
            if(((SB_Student)list[i]).Skill.equals(requireSkill))
                System.out.println(list[i].toString());
    }
    //hàm này để đếm số SV có điểm PE <=5 và LabMark <5
    public int countFail()
    {
        int countFail=0;
        for (int i=0; i<count; i++)
            if(list[i] instanceof SE_Student)
                if((((SE_Student)list[i]).LabMark)<5&&(((SE_Student)list[i]).PEMark)<=5)
                    countFail++;
        System.out.println("No of Student Fail: "+countFail);
        return countFail;
    }
    //hàm này để update thông tin của sv khi biết rollnum
    public int find(int rollnum)
    {
        for(int i=0; i<count; i++)
        {
            if(list[i].getRollNum()==rollnum)
                return i;
        }
        return -1;
    }
    public boolean updateStudent(int rollnum)
    {
        //tìm vị trí student có rollnum theo yêu cầu
        //kiểm tra list tại trí là SE hay SB
        //nếu là SE thì gọi setter: setName, setLabMark...
        //nếu là SB thì gọi setter: setName, setSkill...
        int pos=find(rollnum);
        int i=0;
        if(pos>=0)
        {
            {
                if(list[i] instanceof SE_Student)
                {
                    Scanner sc= new Scanner (System.in);
                    System.out.println("Input new name");
                    String newname=sc.nextLine();
                    sc=new Scanner(System.in);
                    System.out.println("Input new Lab mark");
                    float newlabmark=sc.nextFloat();
                    sc=new Scanner(System.in);
                    System.out.println("Input new PE mark");
                    float newpemark=sc.nextFloat();
                    list[i].setName(newname);
                    ((SE_Student)list[i]).setLabMark(newlabmark);
                    ((SE_Student)list[i]).setPEMark(newpemark);
                    return true;
                }
                if(list[i] instanceof SB_Student)
                {
                    Scanner sc= new Scanner (System.in);
                    System.out.println("Input new Name");
                    String newname=sc.nextLine();
                    sc=new Scanner(System.in);
                    System.out.println("input new Math mark");
                    float newmathmark=sc.nextFloat();
                    sc=new Scanner(System.in);
                    System.out.println("Input new Skill");
                    String newskill=sc.nextLine();
                    list[i].setName(newname);
                    ((SB_Student)list[i]).setMathMark(newmathmark);
                    ((SB_Student)list[i]).setSkill(newskill);
                }
            }return true;
        } 
        return false;
    }
    //hàm này để xóa 1 sv khi biết rollnum
    public boolean removeStudent(int rollnum)
    {
        int pos=find(rollnum);
        if(pos<0) return false;
        for (int i=pos; i<count; i++)
            {
            list[i]=list[i+1];
            }
        count--;
        return true;
    }
    
}
