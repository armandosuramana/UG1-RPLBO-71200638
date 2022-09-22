import com.ug4.soal1.Driver;
import com.ug4.soal1.Passenger;

import java.util.ArrayList;

public class Bus {
    private String name;
    private String driver;
    private int CAPACITY = 25;
    private final ArrayList<Passenger>passenger = new ArrayList<>();
    private int usedCapacity;
    private final double fares  = 10000;
    private double profit;
    private  String[] ROUTE;

    public Bus(String name, Driver driver) {
        this.name = name;
        this.driver = String.valueOf(driver);
    }

    public String getName() {
        return name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public double getFares() {
        return fares;
    }

    public double getProfit() {
        return profit;
    }

    public String[] getROUTE() {
        return ROUTE;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
    public  boolean checkPassangerBalance(Passenger penumpang){
        boolean status = false;
        if(penumpang.getBalance() > getFares() && penumpang.getBalance() > 0){

        }
        return  status;

    }
    public void topBalance(double jumlah,Passenger penumpang){
        if (jumlah > 0)
            penumpang.setBalance(jumlah);

    }
    public void takePassanger(Passenger penumpang){

    }
    public void dropPassanger(String tujuan, Passenger penumpang ){
        if (tujuan == penumpang.getDestiny()){
            passenger.clear();
        }
    }
    public  void proceedOrder(String order, Passenger penumpang){

    }
    public String cancelOrder(Passenger penumpang){
        return penumpang.getName();
    }

}
