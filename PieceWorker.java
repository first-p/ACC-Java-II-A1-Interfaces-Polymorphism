public class PieceWorker extends Employee {
    private double wage;

    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
       double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage <= 0.0) //validate
            throw new IllegalArgumentException(
                    "Wage must be greater than 0.0");
        this.wage = wage;

        if (pieces < 0) //validate
            throw new IllegalArgumentException(
                    "Pieces made must be >= 0");
        this.pieces = pieces;
    }

    //set number of pieces made
    public void setPiecesMade(int pieces){
        if (pieces < 0) //validate
            throw new IllegalArgumentException(
                    "Pieces made must be >= 0");
        this.pieces = pieces;
    }
    //return number of pieces made
    public int getPiecesMade() { return pieces;}

    //set wage
    public void setWage(double wage) {
        if (wage <= 0.0 )
            throw new IllegalArgumentException(
                    "Wage must be greater than 0");
        this.wage = wage;
    }
    //return wage
    public double getWage() {return wage;}

    // calculates earnings, overrides abstract method earning in Employee
    @Override
    public double earnings(){
        return getWage() * getPiecesMade();
    }
} //end class PieceWorker

