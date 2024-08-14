public class Character  {
       
  private String name;
  private char geschlecht;
  private int hp;
  private int damage;
  private int armor;
  
  
  
  public Character (String name, char geschlecht, int hp, int damage, int armor) {
    
    this.name = name;
    this.hp = hp;
    this.geschlecht = geschlecht;
    this.damage = damage;
    this.armor = armor;
    
  }
  
  
  
  public String getName() {
    return name; 
  }
  
  public void setName(String name) {
    this.name = name; 
  }
  
  public char getGeschlecht() {
    return geschlecht;
  }
  
  public void setGeschlecht (char geschlecht) {
    this.geschlecht = geschlecht; 
  }
  
  public int getHp() {
    return hp; 
  }
  
  public void setHp(int hp) {
    this.hp = hp; 
  }
  
  public int getDamage() {
    return damage; 
  }
  
  public void setDamage(int damage) {
    this.damage = damage; 
  }
  
  public int getArmor(){
    return armor; 
  }
  
  public void setArmor(int armor) {
    this.armor = armor; 
  }
}
