package fr.oroger;

public class Facade {
    public Facade() {
    }

    public void bookTrip()
    {
        Flight f =  new Flight();
        f.bookTicket();

        Transfert t = new Transfert();
        t.bookCar();

        Hotel h = new Hotel();
        h.bookRoom();
    }
}
