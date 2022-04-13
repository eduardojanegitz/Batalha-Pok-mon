package pookemon;

public final class ClassePokemon {
    //Atributos - os atributos são privadas pois estão encapsulados
     String nome;
     String tipo;
     double vida = 200; //a base de vida de qualquer pokémon é 200
     double defesa;
     double ataque;
     int level;

    //Construtor
    public ClassePokemon(String nome, String tipo, int level) { //quando eu crio um método com o mesmo nome da classe, eu estou criando um construtor
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        calculaAtributos(); //isso permite que somente sendo instanciado o pokemon, eu não precisaria chamar os métodos
        calculaLevel();

    }

    //Getter e Setter - como se fossem mini-métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

  

   
    

    
    //Métodos
    
    private void calculaLevel(){
         vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
    
    private void calculaAtributos(){
        switch(this.tipo){ //o this signifca que você está referenciando um atributo, e não uma variável
            case "Fogo":
                this.ataque = 100;
                this.defesa = 50;
                this.vida -= 20;
                break;
                
            case "Água":
                this.ataque = 50;
                this.defesa = 70;
                this.vida += 200;
                break;
                
            case "Terra":
                this.ataque = 120;
                this.defesa = 100;
                this.vida -= 150;
                break;
                
            case "Planta":
                this.ataque = 80;
                this.defesa = 70;
                this.vida -= 100;
                break;
        }

    }

   

   
}
    

    

    

