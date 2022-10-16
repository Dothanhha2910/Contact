import java.util.Arrays;

public class AirLine {
    private Person[] seats;

    public AirLine() {
        this.seats = new Person[11];
    }

    public void setSeats(Person person, int index){
        this.seats[index] = new Person(person);
    }

    public Person getSeats(int index) {
        return new Person(this.seats[index]);
    }

    public String toString() {
        String reservation = "";
        for (int i = 0; i < this.seats.length; i++) {
            if (this.seats[i] != null){
                reservation += this.seats[i].toString();
            } else {
                reservation += "\nSpot " + (i + 1) + " is available\n";
            }
        }
        return reservation;
    }

    public void createReservation(Person person) {

        while (this.seats[person.getSeatNumber() - 1] != null){
            System.out.println("Hi " + person.getName() + ", the spot No. " + person.getSeatNumber() + 
            " is already taken. Please choose another one. Thanks for your understanding!");
            person.setSeatNumber(person.chooseSeat());
            
        }
        seats[person.getSeatNumber() - 1] = new Person(person);
        
    }
}
   
