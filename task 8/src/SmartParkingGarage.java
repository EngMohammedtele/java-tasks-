import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//MOHEDSAID
public class SmartParkingGarage {
    public static void main(String[] args){
        Queue<String>  waiting_vehicles =new LinkedList<>();
        Stack<String> parked_vehicles =new Stack<>();
        int  parking_capacity=10;
        int options=0;
        int  parked_counter=0;
        int  departed_counter=0;
        do{
            IO.println("\n===== Parking System =====");
            IO.println("1. Add Vehicle to Waiting Queue");
            IO.println("2. Park Next Vehicle ");
            IO.println("3. Remove Parked Vehicle");
            IO.println("4.  View Next Waiting Vehicle");
            IO.println("5.  View Last Parked Vehicle ");
           IO.println("6.  Display Waiting Queue ");
            IO.println("7.  Display Parked Vehicles  ");
            IO.println("8.  Search Vehicle  ");
            IO.println("9.  Display Garage Statistics  ");
            IO.println("10. Clear Waiting Queue  ");
            IO.println("11. Clear Parking Garage  ");
           IO.println("12.  Exit");

            String input1=IO.readln("enter number of option");
            int option=new Integer(input1);

            switch (option) {
                case 1:
                    System.out.println(" add Vehicle");
                    String input2 = IO.readln("enter vehicle number.");
                    if (waiting_vehicles.isEmpty()) {
                        IO.println("it is empty");
                    } else {


                        if (!waiting_vehicles.contains(input2)) {
                            IO.println("It does not already exist");
                        }else{
                            waiting_vehicles.offer(input2);
                            IO.println("vehiacl addedd successfully");
                        }
                    }
                    break;

                case 2:
                    IO.println(" Park Next Vehicle");
                    if(parked_vehicles.size()>=parking_capacity){
                        IO.println("Garage is full.");
                    }else {
                        IO.println("Space available");
                    }

                    String vehical = waiting_vehicles.poll();
                    parked_vehicles.push(vehical);
                    parked_counter++;
                    IO.println("the parked vehicle" + vehical);
                    IO.println(" counter is" + parked_counter);
                    break;


                case 3:
                    IO.println("Remove Parked Vehicle" );
                    IO.println("the removed vehicle" + parked_vehicles.pop());
                    departed_counter++;
                    if(!waiting_vehicles.isEmpty()){
                        String next_vehical=waiting_vehicles.poll();
                        IO.println("Automatically parked:" + parked_vehicles.push(next_vehical));
                    }
                    break;

                case 4:
                    IO.println("Next Waiting Vehicle ");
                    IO.println("the next vehicle waiting" + waiting_vehicles.peek());
                    break;

                case 5:
                    IO.println("Last Parked Vehicle");
                    IO.println(parked_vehicles.peek());
                    break;

                case 6:
                    IO.println("Total waiting vehicles");
                    if(waiting_vehicles.isEmpty()){
                        IO.println("No vehicles are waiting. ");
                    }else {
                        IO.println("Waiting vehicle numbers  " + waiting_vehicles);
                        IO.println("Total waiting vehicles" + waiting_vehicles.size());

                    }
                    break;

                case 7:
                    IO.println("Display Parked Vehicles");
                    IO.println("Vehicles from newest parked to oldest" + parked_vehicles.reversed());
                    IO.println("• Current occupied spaces  " + parked_vehicles.peek());
                    int remainingSpaces = parking_capacity - parked_vehicles.size();
                    IO.println("Remaining parking spaces  " + remainingSpaces);
                    break;

                case 8:
                    String input5=IO.readln(" enter vehicle number to search ");
                    if(parked_vehicles.contains(input5)){
                        IO.println( input5 + " is in parked vehicles");
                    }else if(waiting_vehicles.contains(input5)){
                        IO.println(input5 + "is in waiting vehicles");
                    }else{
                        IO.println(input5 + "Not found ");
                    }
                    break;

                case 9:
                    IO.println("\n===== Garage Statistics =====");

                    IO.println("Maximum Capacity: " + parking_capacity);
                    IO.println("Current Parked Vehicles: " + parked_vehicles.size());
                    IO.println("Waiting Vehicles: " + waiting_vehicles.size());
                    IO.println("Available Spaces: " + (parking_capacity - parked_vehicles.size()));
                    IO.println("Total Vehicles Parked Today: " + parked_counter);
                    IO.println("Total Vehicles Departed Today: " + departed_counter);
                    IO.println("Total Vehicles Processed: " + (parked_counter + departed_counter));

                    double occupancy = (parked_vehicles.size() * 100.0) / parking_capacity;
                    System.out.printf("Garage Occupancy Percentage: %.2f%%\n", occupancy);
                    break;

                case 10:
                    IO.println("Clear Waiting Queue ");
                    if(waiting_vehicles.isEmpty()){
                        IO.println("the queue is empty");
                    }else{
                        String input6= IO.readln(" do you wan to clear the waiting queue (Y/N)");
                        if(input6.equalsIgnoreCase("y")){
                            waiting_vehicles.clear();
                            IO.println("All waiting vehicles have been removed.");
                        }else{
                            IO.println("Operation cancelled.");
                        }
                        break;
                    }
                case 11:
                    IO.println("Clear Parking Garage ");
                    if(parked_vehicles.isEmpty()){
                        IO.println("the queue is empty");
                    }else{
                        parked_vehicles.clear();
                        IO.println("Parking garage cleared successfully");
                    }
                    break;

                case 12:
                    IO.println("Thank you for using Smart Parking Garage.");
                    break;
            }
        } while(options!=11);
        IO.println("prgram terminate");
    }
}