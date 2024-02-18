package com.reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    int busno;
    String name;
    Date date;
    Booking() throws ParseException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter bus number: ");
        busno=scan.nextInt();
        System.out.println("Enter passanger name: ");
        name=scan.next();
        System.out.println("Enter date in dd-mm-yyyy");
        String dateto=scan.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
        date=dateformat.parse(dateto);
    };

    public boolean isavailable(ArrayList<Bus> buses,ArrayList<Booking> bookings){
        int capacity=0;
        for(Bus B:buses){
            if(B.getBusno()==busno){
                capacity=B.getCapacity();
            }

        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                booked++;//booking nu oru arraylist la add aairukum adhula poi edhana count irukunu check pannum idhu adhukaprm capacity odacheck [ani ans ssollum

            }
        }
        return booked < capacity;
    };
}
