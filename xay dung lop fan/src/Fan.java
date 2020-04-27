public class Fan {
    public static final int SLOW=1,MEDIUM=2,FAST=3;
    private int speed= SLOW;
    private boolean on=false;
    private double radius=5.0;
    private String color = "blue";

    public Fan(){

    }
    public String fanInfo(){
        return "Fan speed is "+this.speed+" fan radius: "+this.radius+" fan color: "+this.color;
    }
    public String toString(){
        if(this.on){
            return this.fanInfo() + " fan is on";
        }else{
            return this.fanInfo()+ " fan is off";
        }
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setOn(){
        this.on=true;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getStatus(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

}
