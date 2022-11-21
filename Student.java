import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int ad_num;
    String name;
    String address;
    String clgname;

    public Student(int ad_num, String name, String address, String clgname) {
        this.ad_num = ad_num;
        this.name = name;
        this.address = address;
        this.clgname = clgname;
    }

    public int getAd_num() {
        return ad_num;
    }

    public void setAd_num(int ad_num) {
        this.ad_num = ad_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClgname() {
        return clgname;
    }

    public void setClgname(String clgname) {
        this.clgname = clgname;
    }

    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
        System.out.println("Enter the  number \n 1-add \n 2-display \n 3-delete \n 4-search 5-exit");
        Scanner scn=new Scanner(System.in);
        switch (scn.nextInt()){
            case 1:
                System.out.println("Enter Student Num");
                Scanner sc=new Scanner(System.in);
                int sc_int=sc.nextInt();
                System.out.println("Enter Student Name");
                Scanner sc1=new Scanner(System.in);
                String sc_name=sc1.next();
                System.out.println("Enter Student Address");
                Scanner sc2=new Scanner(System.in);
                String sc_address=sc2.next();
                System.out.println("Enter college name");
                Scanner sc3=new Scanner(System.in);
                String sc_clg=sc3.next();
                Student s1=new Student(sc_int,sc_name,sc_address,sc_clg);
                Student s2=new Student(102,"fgd","house","vhsc");
                s.add(s1);
                s.add(s2);
            case 2:
                s.forEach(d-> System.out.println("Admission code ..:"+d.ad_num+"\nStudent Name   :"+d.name+"\nAddress  :" +
                        d.address+"\nCollege Name  :"+d.clgname));
                break;
            case 3:
                System.out.println("Admission number for delete");
                Scanner scn1=new Scanner(System.in);
                try {
                    if(s.contains(scn1.nextInt())){
                        if(s.get(0).ad_num==scn1.nextInt()){

                        }
                    }
                    else {
                        System.out.println("Its not included");
                    }
                }catch (Exception e){
                    System.out.println("Invalid");
                }
            break;
           // case 4:








        }
    }
}
