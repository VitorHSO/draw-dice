package empire20;

import javax.swing.JFrame;

public class Empire20 {

    public static void main(String[] args) {
       
        //Instanciando o gerador de atributos
        GeradorDeAtributos GDA = new GeradorDeAtributos();
        //Configurando as opções da tela (Minimizar, Ampliar e Fechar).
        GDA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
