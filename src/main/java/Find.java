import java.util.ArrayList;

public class  Find implements Interface{
    private   final ArrayList <PrinterRepairmen> list;

    public  Find(ArrayList <PrinterRepairmen> list) {
        this.list = list;
    }
 
    /**
     Megkeresi a legjobb a legolcsobb árat ami inicializálódáskor kiderül.
     */
    
    @Override
   public  void FindTheBest(){
         double  bestprice =  this.list.get(0).getPrice();
        int bestpricepos=0;      
        for (PrinterRepairmen i : list)
        {      System.out.println("A Neve " + i.getName() +" \tX " + i.getX()+" \tY " + i.getY() + "\t NyomdaX " + i.getXpos()+" NyomdaY "+i.getYpos()+"A Távolság: "+ i.getDistance() + " Ár " +i.getPrice() );    
          
            if (i.getPrice()<bestprice)
            {bestprice = i.getPrice();
                bestpricepos=list.indexOf(i);
            }
        }
      
         System.out.println("A legjobb választás: "+ list.get(bestpricepos).getName()+ " Ennyi pénzért " + list.get(bestpricepos).getPrice()  );
        
    }
}
