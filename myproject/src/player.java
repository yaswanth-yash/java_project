
public class player{
    private String name;
    private String weapon;
    private int health;

    public player(String name,String weapon,int health) {
        this.name= name;
        this.weapon= weapon;
        this.health=health;
        
    }
public void damageByGun1(){
    this.health -=30;
    if(this.health<=0){
        this.health=0;
    }
    System.out.println("--------------------------------------------------");
  System.out.println("got hit by gun1.Health is reduced by 30"+".New health is "+this.health);
  if(this.health==0){
    System.out.println("--------------------------------------------------");
      System.out.println(getName()+" is dead");

  }
}
public void damageByGun2() {
    this.health -=50;
    if(this.health<=0){
        this.health=0;
    }
    System.out.println("--------------------------------------------------");
  System.out.println("got hit by gun2.Health is reduced by 50"+".New health is "+this.health);
  if(this.health==0){
    System.out.println("--------------------------------------------------");
      System.out.println(getName()+" is dead");

    }
}
public void damagebygun3(){
    this.health -=60;
    if(this.health<=0){
        this.health=0;
    }
    System.out.println("--------------------------------------------------");
    System.out.println("got hit by gun3.Health is reduced by 60"+".New health is "+this.health);
    if(this.health==0){
      System.out.println("--------------------------------------------------");
        System.out.println(getName()+" is dead");
        else{
            System.out.println("--------------------------------------------------");
            System.out.println(getName()+" is Alive");
        }

    }
}

public String getName(){
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getweapon(){
    return weapon;
}
public void setweapon(String weapon) {
    this.weapon = weapon;
    }
 public int getHealth() {
     return health;
     }   
public void setHealth(int health) {
    this.health = health;
    }     
}