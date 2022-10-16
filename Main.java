import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] passport = new String[3];

        Person quang = new Person(passport[0], passport [1], passport [2], 0, passport);
        passport = quang.applyPassport();
        quang.setPassport(passport);        

        for (int i = 0; i < passport.length; i++){
            switch(i){
                case 0: quang.setName(passport[i]);
                case 1: quang.setNationality(passport[i]); 
                case 2: quang.setdateOfBirth(passport[i]);
            }

        }
        quang.setSeatNumber(quang.chooseSeat());
        Person ha = new Person(quang);
        Person traxanh = new Person(passport[0], passport [1], passport [2], 2, passport);


        quang.setName("Quang cute");
        quang.setNationality("Cute nhứt");
        quang.setSeatNumber(quang.seatNumber - 1);
        quang.setPassport(passport);        

        AirLine china = new AirLine();
        china.createReservation(ha);
        china.createReservation(quang);
        china.createReservation(traxanh);

        System.out.println(china);

        


    }

    
}
