
public class player1 extends player{
    private int health;
    private boolean armour;

    public player1(String name,String weapon,int health,boolean armour){
        super(name,weapon,health);
        this.health = health;
        this.armour = armour;
    }
    @Override
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health <=0) this.health=0;
            System.out.println("--------------------------------------------------");
            System.out.println("Armour is on.Got hit by gun 1.Health is reduced by 20."+"New health is "+this.health);

        }
        if(!armour){
            this.health -= 30;
            if(this.health <=0) this.health=0;
            System.out.println("--------------------------------------------------");
            System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 20."+"New health is "+this.health);
         }
    if(this.health==0){
        System.out.println("--------------------------------------------------");
        System.out.println(getName() +" is dead");
 }
}
@Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <=0) this.health=0;
            System.out.println("--------------------------------------------------");
            System.out.println("Armour is on.Got hit by gun 1.Health is reduced by 20."+"New health is "+this.health);

        }
        if(!armour){
            this.health -= 50;
            if(this.health <=0) this.health=0;
            System.out.println("--------------------------------------------------");
            System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 20."+"New health is "+this.health);
         }
    if(this.health==0){
        System.out.println("--------------------------------------------------");
        System.out.println(getName() +" is dead");
}
    }
}
