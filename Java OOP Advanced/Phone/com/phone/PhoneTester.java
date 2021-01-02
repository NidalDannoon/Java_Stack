package com.phone;
public class PhoneTester{

    public static void main(String[] args){
        IPhone x = new IPhone("X",80,"AT&T","tmttatm ttam");
        Galaxy m10 = new Galaxy("M10",75,"Verizon","ttam tamtamtam");
        x.displayInfo();
        System.out.println(x.ring());
        System.out.println(x.unlock());
        m10.displayInfo();
        System.out.println(m10.ring());
        System.out.println(m10.unlock());   
    }
}
