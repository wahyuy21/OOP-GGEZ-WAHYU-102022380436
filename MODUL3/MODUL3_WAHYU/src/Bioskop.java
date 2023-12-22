
public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int ROWS = 5;

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int SEATS_PER_ROW = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    protected int[][] seats;

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        this.seats = new int[ROWS][SEATS_PER_ROW];
        int seatCode = 0;
        for (int b=0;b<ROWS;b++){
            for(int k=0;k<SEATS_PER_ROW;k++){
                
                this.seats[b][k]=seatCode;
            }
        }
        this.seats[0][2]=1;
        this.seats[1][5]=1;
        this.seats[3][7]=1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop: ");
        for (int b=0;b<ROWS;b++){
            for(int k=0;k<SEATS_PER_ROW;k++){
                System.out.print(this.seats[b][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (this.seats[row][seat]==1){
            System.out.println("Bangku Kosong");
            this.seats[row][seat]=1;
            System.out.println("kursi"+row+","+seat+" berhasil di pesan"); 
        }
        else{
            System.out.println("bangku penuh");
        }
    }
}