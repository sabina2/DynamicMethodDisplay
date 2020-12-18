package com.Loading;
class Phone{
    void call(){
        System.out.println("Starts Calling");
    }
    void Showtime(){
        System.out.println("Time is eight AM");
    }
}

class SmartPhone extends Phone{
    void call(){
        System.out.println("Call through SmartPhone");
    }
    void music(){
        System.out.println("Starts playing music");
    }
}
public class Main {

    public static void main(String[] args) {
	Phone p1=new SmartPhone();
	p1.call();
	p1.Showtime();
	//p1.music();            // Not allowed
     //p1.call();             // From Phone class Not Allowed
    }
}
