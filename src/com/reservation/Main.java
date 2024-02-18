package com.reservation;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws ParseException {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<>();
        buses.add(new Bus(1,true,5));
        buses.add(new Bus(2,true,2));
        for(Bus i:buses){
            i.display();
        }
        int ch=1;
        Scanner scan=new Scanner(System.in);
        while(ch==1){
            System.out.println("Enter 1 to book 2 to exit");
            ch=scan.nextInt();
            if(ch==1){
                System.out.println("Booking..");
                Booking booking=new Booking();
                if(booking.isavailable(buses,bookings)){
                    bookings.add(booking);//bookings arraylist
                    System.out.println("Booking success");
                }else{
                    System.out.println("Sry bus is full");
                }
            }
        }
    };
}
