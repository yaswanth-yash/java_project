public class player2 extends player {
   private int health;
    private boolean vehicle;


    public player2(String name,String weapon,int health,boolean vehicle){
        super(name, weapon, health);
        this.health = health;
        this.vehicle = vehicle;

    }
    @Override
    public void damageByGun1(){
        if(vehicle){
            this.health -=10;
            if(this.health <=0) this.health=0;
            System.out.println("---------------------------------------------------");
            System.out.println("on vehicle.Health is reduced by 10.New health is"+this.health);
        }
        if(!vehicle){
            this.health -=30;
            if(this.health <=0) this.health=0;
            System.out.println("---------------------------------------------------");
            System.out.println("off vehicle.Health is reduced by 30.New health is"+this.health);
        }
        if(this.health==0){
            System.out.println("----------------------------------------------------");
            System.out.println(getName()+"is dead");
        }
    }
     @Override
    public void damageByGun2(){
        if(vehicle){
            this.health -=20;
            if(this.health <=0) this.health=0;
            System.out.println("---------------------------------------------------");
            System.out.println("on vehicle.Health is reduced by 20.New health is"+this.health);
        }
        if(!vehicle){
            this.health -=50;
            if(this.health <=0) this.health=0;
            System.out.println("---------------------------------------------------");
            System.out.println("off vehicle.Health is reduced by 50.New health is"+this.health);
        }
        if(this.health==0){
            System.out.println("----------------------------------------------------");
            System.out.println(getName()+"is dead");

    
}
 }
}
