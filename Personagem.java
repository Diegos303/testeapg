public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    Personagem(String nome,int energia, int fome,int sono) {
        this(energia,fome,sono);
        this.nome = nome;

    }

    Personagem(int energia, int fome, int sono) {
        if (energia >=0 && energia <=10) {
            this.energia = energia;
        }
        if (fome >=0 && fome <=10) {
            this.fome = fome;
        }
        if(!(sono < 0 || sono > 10)) {
            this.sono = sono; 
        }
    }

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome +" caçando.......");
            energia = energia - 2;

        }
        else {
            System.out.println(nome + " sem energia para caçar");

        }
        sono = Math.min(sono + 1,10);
        fome = Math.min(fome + 1, 10);
        


    }
    void dormir() {
        if (sono>=1) {
            System.out.println(nome + " dormindo....");
            sono = sono - 1;
            energia = Math.min(energia+1,10);

        }
        
    }
    void comer() {
        if (fome>=1) {
            System.out.println(nome + " comendo.....");
            fome = fome - 1;
            energia= Math.min(energia + 1,10);

        }
        else {
            System.out.println(nome + " Sem fome........");
        }
        

    }


    
}