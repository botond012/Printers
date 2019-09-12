/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cobra
 */
  public final   class PrinterRepairmen {
  private String name; 
  private  int x,y, base_fee, travel_fee;
  private  int xpos,ypos;
  private  double distance;
  private  double price;

  
                            
                  
    //konstructor ures
public PrinterRepairmen(){};
    //létrehozo konstructor két koordináta, name, base fee, travel fee,
public PrinterRepairmen(String name, int x,int xpos, int y,int ypos, int base_fee, int travel_fee)
{
    
    this.name=name;
    this.x=x;
    this.y=y;
    this.xpos=xpos;
    this.ypos=ypos;
    this.base_fee=base_fee;
    this.travel_fee=travel_fee;
    this.CalcDistance();
    this.CalcPrise();
}

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

 
    public void setPrice(double price) {
        this.price = price;
    }
  public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }




void CalcDistance () {
  this.setDistance(Math.sqrt(((this.xpos-this.x)*(this.xpos-this.x))+((this.ypos-this.y)*(this.ypos-this.y))));
  }
void CalcPrise (){
  this.setPrice((this.getDistance()*this.travel_fee)+this.base_fee);
                  
  }

}

