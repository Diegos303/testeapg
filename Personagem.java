public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

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

        }
        
    }
    void comer() {
        if (fome>=1) {
            System.out.println(nome + " comendo.....");
            fome = fome - 1;

        }
        else {
            System.out.println(nome + " Sem fome........");
        }
        

    }


    
}