
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
public class Tester {
    public static void main(String[] args)
    {
        StudentList obj= new StudentList();
        Scanner sc= new Scanner (System.in);
        int choice;
        do
        {
            System.out.println("1. Add SE Student");
            System.out.println("2. Add SB Student");
            System.out.println("3. Display All");
            System.out.println("4. Display SE Student");
            System.out.println("5. Display SB Student");
            System.out.println("6. Find Max LabMark of SE_Student");
            System.out.println("7. Num of Student has LabMark>=5");
            System.out.println("8. Display Student by Skill");
            System.out.println("9. Num of Student Failed(by PE and Lab): ");
            System.out.println("10. Update Student");
            System.out.print("Input Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    Student s= new SE_Student();
                    s.inputStudent();
                    if(obj.addStudent(s))
                        System.out.println("Added");
                    else
                        System.out.println("Add fail");
                    break;
                case 2:
                    Student s2= new SB_Student();
                    s2.inputStudent();
                    if(obj.addStudent(s2))
                        System.out.println("Added");
                    else
                        System.out.println("Add fail");
                    break;
                case 3:
                    obj.displayAll();
                    break;
                case 4:
                    obj.displaySEStudent();
                    break;
                case 5:
                    obj.displaySBStudent();
                    break;
                case 6:
                    float max=obj.getLabMax();
                    System.out.println("Lab mark MAX: "+max);
                    break;
                case 7:
                    obj.countLab();
                    break;
                case 8:
                    obj.displaySkill();
                    break;
                case 9:
                    obj.countFail();
                    break;
                case 10:
                    int rollnum;
                    System.out.println("Input Roll Num: ");
                    rollnum=sc.nextInt();
                    if(obj.updateStudent(rollnum))
                        System.out.println("Updated");
                    else
                        System.out.println("Not found");
                    break;
                case 11:
                    break;
                    
            }
        }while(choice<=11);
    }
    
}
