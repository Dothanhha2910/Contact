import java.util.Arrays;
import java.util.Scanner;

public class Person {
    static Scanner scan = new Scanner(System.in);

    private String name;
    private String nationality;
    private String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber, String[] passport) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth; 
        this.seatNumber = seatNumber; 
        this.passport = Arrays.copyOf(passport, passport.length);
    }

    public Person (Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth; 
        this.dateOfBirth = source.dateOfBirth; 
        this.seatNumber = source.seatNumber; 
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public String toString() { 
        return "\n--Reservation information of " + this.name + "--\n"
            +   "Name: " + this.name + "\n"
            +   "Nationality: " + this.nationality + "\n"
            +   "Date of birth" + this.dateOfBirth + "\n"
            +   "Passport: " + Arrays.toString(this.passport) + "\n"
            +   "Seat number:" + this.seatNumber + "\n";
    }

    public int chooseSeat(){
        System.out.print("Please choose your seat: ");
        int seat = scan.nextInt();
        while (seat > 11 || seat < 2){
            System.out.println("\nSorry, there are only 11 seats. System will return you a valid seat number\nPlease wait... \n");
            seat = (int) (Math.random() * 12);
            System.out.print("Success!, your seat number is: " + seat + "\n");
        }
        return seat;
    }

    public String[] applyPassport() {
       
        System.out.println("Your name: ");
        String name = scan.nextLine();
        System.out.println("Your nationality: ");
        String nationality = scan.nextLine();
        System.out.println("Your date of birth: ");
        String dateOfBirth = scan.nextLine();
        return new String[] {name, nationality, dateOfBirth};
    }

    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getdateOfBirth(){
        return this.dateOfBirth;
    }
    public String[] getPassport(){
        return this.passport;
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setPassport(String[] passport){
        this.passport = Arrays.copyOf(passport, passport.length);
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
}
