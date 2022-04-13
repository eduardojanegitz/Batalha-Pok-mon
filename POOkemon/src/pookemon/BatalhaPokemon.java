
package pookemon;



public class BatalhaPokemon {
     ClassePokemon poke = new ClassePokemon("Charizard", "Fogo", 200);
    ClassePokemon outro = new ClassePokemon("Blastoise", "Água", 130);
    
    
   
    
    public void iniciarBatalha(){
        if(poke.vida > outro.vida){
            TelaCharizard charizard = new TelaCharizard();
            charizard.setVisible(true);
        } else {
            TelaBlastoise blastoise = new TelaBlastoise();
            blastoise.setVisible(true);
        }
    }
}
