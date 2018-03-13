public abstract class Creature implements Generic{

    public Creature(String name, String race, int level, int life, int spell, int strenght, int agility, int skill, int intelligence, int charisma) {
        this.name = name;
        this.race = race;
        this.level = level;
        this.life = life;
        this.spell = spell;
        this.strenght = strenght;
        this.agility = agility;
        this.skill = skill;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
        private String name;
	private String race;
	private int level;
	private int life;
	private int spell;
	private int strenght;
	private int agility;
	private int skill;
	private int intelligence;
	private int charisma;

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    
    public float atack(){
        return 0;
    }
    public float defend(){
        return 0;
    }
    
    public boolean alive(){
        
        return true;
    }
    
    public void losesLife(){
    
    }
    
    public void revitalize(){
    
    }
    
    public abstract float rest();

    public String toString(){
        return "a"; //to treat
   }
    
    public void call(){
    
    }
    
 }