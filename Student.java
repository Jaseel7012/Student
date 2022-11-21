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

        System.out.println("Enter the  number \n 1-add \n 2-display \n 3-delete \n 4-search 5-exit");
        Scanner scn=new Scanner(System.in);
        switch (scn.nextInt()){

        }
    }
}
