
import java.util.ArrayList;


public class NewMain {

    public static void main(String[] args) {
      
      // a Travel fee és a base fee hasrautes szerű beállítása nem felel meg a kapitalista ideológiáknak ....
        int x= (int) ((Math.random() * 50)-25);
         int y= (int) ((Math.random() * 50)-25);
        Location location= new Location(x,y);
        ArrayList<PrinterRepairmen> list = new ArrayList<> ();

        // Adatbazisból kérném le ezeket az adatokat
      
          /// A test kedvéért csak random létrehoztam 10 nyomdászt
        

         
        list.add(new  PrinterRepairmen("Józsi Nyomdaszervize" ,1,location.getX(),10,location.getY(),10000,11));
        list.add(new  PrinterRepairmen("Laci Nyomdaszervize" ,-2,location.getX(),-10,location.getY(),9950,11));
        list.add(new  PrinterRepairmen("Béla Nyomdaszervize" ,-3,location.getX(),5,location.getY(),9500,12));
        list.add(new  PrinterRepairmen("Julcsi Nyomdaszervize" ,4,location.getX(),-5,location.getY(),10010,13));
        list.add(new  PrinterRepairmen("Gizi Nyomdaszervize" ,12,location.getX(),7,location.getY(),9940,13));
        list.add(new  PrinterRepairmen("Kati Nyomdaszervize" ,-1,location.getX(),-7,location.getY(),9970,14));
        list.add(new  PrinterRepairmen("Erzsi Nyomdaszervize" ,6,location.getX(),3,location.getY(),9430,14));
        list.add(new  PrinterRepairmen("Bandi Nyomdaszervize" ,-6,location.getX(),-3,location.getY(),9680,13));
        list.add(new  PrinterRepairmen("Zoli Nyomdaszervize" ,-9,location.getX(),15,location.getY(),9990,12));
        list.add(new  PrinterRepairmen("Marcsa Nyomdaszervize" ,-5,location.getX(),6,location.getY(),10000,11));
       
        
        System.out.println("X:  "+x +"Y:  "+y );
        Find find = new Find(list) ;    
        find.FindTheBest();
        }
    
}
