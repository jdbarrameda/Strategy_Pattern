public class Main {
    public static void main(String[] args) {
        
        AttackStrategy knightAttack = new SwingSword();
        DefenseStrategy knightDefense = new Shield(); // Or use Dodge / CreateMagic based on specific needs
        Character knight = new Character("Knight", knightAttack, knightDefense);
        
        AttackStrategy wizardAttack = new CastSpell();
        DefenseStrategy wizardDefense = new CreateMagic();
        Character wizard = new Character("Wizard", wizardAttack, wizardDefense);
    
        AttackStrategy archerAttack = new ShootArrow();
        DefenseStrategy archerDefense = new Dodge();
        Character archer = new Character("Archer", archerAttack, archerDefense);
        
    
        knight.attack();  
        knight.defend();  

        wizard.attack();  
        wizard.defend();  

        archer.attack();  
        archer.defend();  
    }
}
