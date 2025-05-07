package Task_3;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Caffee {
    Table[] tables = new Table[10];
    Queue<Guest> queue = new LinkedList<>();
    Queue<Guest> queueForReserved = new LinkedList<>();

    public Caffee(){
        for(int i = 0; i < tables.length; i++){
            tables[i] =  new Table(false, false, i);
        }

    }

    public void reserveTable(Guest guest,int tableId){
        if(tables[tableId].isReserved || tables[tableId].isOccupied){
            System.out.println("Table " + tableId + " is already reserved. Call Niko");
            return;
        }
        guest.setTableId(tableId);
        guest.setHasReservation(true);
        tables[tableId].isReserved = true;
    }

    public void addGuest(Guest guest){

        if(guest.hasReservation){
            queueForReserved.add(guest);
            return;
        }
        queue.add(guest);
    }
    public void seatGuests(){

        while(!queueForReserved.isEmpty()){
            Guest guest = queueForReserved.poll();
            Table table = tables[guest.getTableId()];
            table.isOccupied = true;
            table.isReserved = false;
            guest.setHasReservation(false);
            System.out.println("[Reservation queue]Table " + table.getId() + " is occupied " + "by " + guest.getName());
            guest.setTableId(-1);
        }
        while(!queue.isEmpty()){
            Guest guest = queue.poll();
            Table freeTable = Arrays.stream(tables).filter(t -> !t.isOccupied && !t.isReserved).findFirst().orElse(null);
            freeTable.isOccupied = true;
            System.out.println("[Default queue]Table " + freeTable.getId() + " is occupied " + "by " + guest.getName());
        }
    }
}
