//Definindo em qual pacote o projeto atual se encontra
package empire20;

//Importando as tecnologias que o projeto usará
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Definindo que a classe GeradorDeAtributs irá herdar as caracteristicas do JFrame
public class GeradorDeAtributos extends JFrame{
    
    //Declarando as variáveis
    JLabel lblNome, lblForca, lblDestreza, lblConstituicao, lblInteligencia, lblSabedoria,
            lblCarisma, lblTendencia, lblHP, lblMana, lblArma, lblDano;
    JTextField txtNome;
    JLabel lblNumForca, lblNumDestreza, lblNumConstituicao, lblNumInteligencia, lblNumSabedoria,
            lblNumCarisma, lblNumTendencia, lblNumHP, lblNumMana, lblNumArma, lblNumDano;
    JButton btnGerarAtributos, btnMinimizar, btnSair;
    // -------------------------------------------------------------------------
    //Declarando a classe construtor
    public GeradorDeAtributos(){
    // -------------------------------------------------------------------------
        //Título da janela
        super ("Gerador de atributos");
        //Instanciando a classe container
        Container tela = getContentPane();  
        //Código para mudar a cor de fundo -> tela.setBackground(Color.yellow);
        //Configurando o layout
        setLayout(null);
        //Definindo o ícone
        ImageIcon icone = new ImageIcon("icone.png");
        setIconImage(icone.getImage());
    // -------------------------------------------------------------------------
        //Definindo o conteúdo dos atributos e seus tamanhos
        lblNome = new JLabel("Nome:");
        lblForca = new JLabel("Força:"); lblNumForca = new JLabel("");
        lblDestreza = new JLabel("Destreza:"); lblNumDestreza = new JLabel("");
        lblConstituicao = new JLabel("Constituição:"); lblNumConstituicao = new JLabel("");
        lblInteligencia = new JLabel("Inteligência:"); lblNumInteligencia = new JLabel("");
        lblSabedoria = new JLabel("Sabedoria:"); lblNumSabedoria = new JLabel("");
        lblCarisma = new JLabel("Carisma:"); lblNumCarisma = new JLabel("");
        lblTendencia = new JLabel("Tendência:"); lblNumTendencia = new JLabel("");
        lblHP = new JLabel("HP:"); lblNumHP = new JLabel("");
        lblMana = new JLabel("Mana:"); lblNumMana = new JLabel("");
        lblArma = new JLabel("Arma:"); lblNumArma = new JLabel("");
        lblDano = new JLabel("Dano:");lblNumDano = new JLabel("");
        txtNome = new JTextField (60);
        btnGerarAtributos = new JButton ("Gerar Atributos");
        btnMinimizar = new JButton("Minimizar");
        btnSair = new JButton("Sair");
    // -------------------------------------------------------------------------
        //Definindo a posição dos elementos na tela
        lblNome.setBounds(50,50,250,20); txtNome.setBounds(100,50,195,20);
        lblForca.setBounds(50,90,250,20); lblNumForca.setBounds(140,90,50,20);
        lblDestreza.setBounds(50,115,250,20); lblNumDestreza.setBounds(140,115,50,20);
        lblConstituicao.setBounds(50,140,250,20); lblNumConstituicao.setBounds(140,140,50,20);
        lblInteligencia.setBounds(50,165,250,20); lblNumInteligencia.setBounds(140,165,50,20);
        lblSabedoria.setBounds(50,190,250,20); lblNumSabedoria.setBounds(140,190,50,20);
        lblCarisma.setBounds(50,215,250,20); lblNumCarisma.setBounds(140,215,50,20);
        lblTendencia.setBounds(50,240,250,20); lblNumTendencia.setBounds(140,240,150,20);
        lblHP.setBounds(50,265,250,20); lblNumHP.setBounds(140,265,50,20);
        lblMana.setBounds(50,290,250,20); lblNumMana.setBounds(140,290,50,20);
        lblArma.setBounds(50,315,250,20); lblNumArma.setBounds(140,315,200,20);
        lblDano.setBounds(50,340,250,20); lblNumDano.setBounds(140,340,50,20);
        btnGerarAtributos.setBounds(50,370,245,20);
        btnMinimizar.setBounds(60,410,90,20);
        btnSair.setBounds(195,410,90,20);
    // -------------------------------------------------------------------------
        //Definindo as ações contidas dentro do botão
        btnGerarAtributos.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Declarando as variáveis dos atributos do personagem
                int NumForca, NumDestreza, NumConstituicao, NumInteligencia, NumSabedoria, NumCarisma, NumTendencia, NumMana, NumArma, NumDano;        
                //Sorteando a força do personagem
                NumForca = 1+ (int)(Math.random()*10);
                lblNumForca.setText(""+NumForca);
            // -----------------------------------------------------------------
                //Sorteando a destreza do personagem
                NumDestreza = 1+ (int)(Math.random()*10);
                lblNumDestreza.setText(""+NumDestreza);
            // -----------------------------------------------------------------    
                //Sorteando a constituição do personagem
                NumConstituicao = 1+ (int)(Math.random()*10);
                lblNumConstituicao.setText(""+NumConstituicao);
            // -----------------------------------------------------------------
                //Sorteando a inteligência do personagem
                NumInteligencia = 1+ (int)(Math.random()*10);
                lblNumInteligencia.setText(""+NumInteligencia);
            // -----------------------------------------------------------------
                //Sorteando a sabedoria do personagem
                NumSabedoria = 1+ (int)(Math.random()*10);
                lblNumSabedoria.setText(""+NumSabedoria);
            // -----------------------------------------------------------------
                //Sorteando o carisma do personagem
                NumCarisma = 1+ (int)(Math.random()*10);
                lblNumCarisma.setText(""+NumCarisma);              
            // -----------------------------------------------------------------
                //Sorteando a tendência do personagem
                NumTendencia = 1+ (int)(Math.random()*8);              
                switch(NumTendencia){
                case 1:
                  lblNumTendencia.setText("Leal e Bom");
                  break;
                case 2:
                  lblNumTendencia.setText("Caótico e Bom");
                  break;
                case 3:
                  lblNumTendencia.setText("Bom e Neutro");
                  break;
                case 4:
                  lblNumTendencia.setText("Leal e Neutro");
                  break;
                case 5:
                  lblNumTendencia.setText("Caótico e Neutro");
                  break;
                case 6:
                  lblNumTendencia.setText("Mau e Neutro");
                  break;
                case 7:
                  lblNumTendencia.setText("Caótico e Mal");
                  break;
                case 8:
                  lblNumTendencia.setText("Leal e Mal");
                  break;
                default:
                  lblNumTendencia.setText("Erro no Switch da Tendência");
                }                           
            // -----------------------------------------------------------------
                //Definindo a vida do personagem
                switch(NumConstituicao){
                case 1:
                  lblNumHP.setText("18");
                  break;
                case 2:
                  lblNumHP.setText("22");
                  break;
                case 3:
                  lblNumHP.setText("26");
                  break;
                case 4:
                  lblNumHP.setText("30");
                  break;
                case 5:
                  lblNumHP.setText("34");
                  break;
                case 6:
                  lblNumHP.setText("38");
                  break;
                case 7:
                  lblNumHP.setText("42");
                  break;
                case 8:
                  lblNumHP.setText("46");
                  break;
                case 9:
                  lblNumHP.setText("50");
                  break;
                case 10:
                  lblNumHP.setText("54");
                  break;
                default:
                  lblNumHP.setText("Erro no Switch do HP");
                }
            // -----------------------------------------------------------------
                //Calculando a mana do personagem
                NumMana = NumConstituicao+NumSabedoria+10;
                lblNumMana.setText(""+NumMana);               
            // -----------------------------------------------------------------
                //Sorteando a arma do personagem
                NumArma = 1+ (int)(Math.random()*34);
                switch(NumArma){
                case 1:
                  lblNumArma.setText("Adaga");
                  break;
                case 2:
                  lblNumArma.setText("Espada Curta");
                  break;
                case 3:
                  lblNumArma.setText("Espada Longa");
                  break;
                case 4:
                  lblNumArma.setText("Espada Grande");
                  break;
                case 5:
                  lblNumArma.setText("Katar");
                  break;
                case 6:
                  lblNumArma.setText("Sabre");
                  break;
                case 7:
                  lblNumArma.setText("Rapiera");
                  break;
                case 8:
                  lblNumArma.setText("Cimitarra");
                  break;
                case 9:
                  lblNumArma.setText("Claymore");
                  break;
                case 10:
                  lblNumArma.setText("Machadinha");
                  break;
                case 11:
                  lblNumArma.setText("Machado de Batalha");
                  break;
                case 12:
                  lblNumArma.setText("Machado Pesado");
                  break;
                case 13:
                  lblNumArma.setText("Clava");
                  break;
                case 14:
                  lblNumArma.setText("Martelo Leve");
                  break;
                case 15:
                  lblNumArma.setText("Martelo de Guerra");
                  break;
                case 16:
                  lblNumArma.setText("Martelo Pesado");
                  break;
                case 17:
                  lblNumArma.setText("Maça Leve");
                  break;
                case 18:
                  lblNumArma.setText("Maça Pesada");
                  break;
                case 19:
                  lblNumArma.setText("Mangual");
                  break;
                case 20:
                  lblNumArma.setText("Picareta Simples");
                  break;
                case 21:
                  lblNumArma.setText("Picareta de Guerra");
                  break;
                case 22:
                  lblNumArma.setText("Bastão");
                  break;
                case 23:
                  lblNumArma.setText("Lança");
                  break;
                case 24:
                  lblNumArma.setText("Tridente");
                  break;
                case 25:
                  lblNumArma.setText("Foice");
                  break;
                case 26:
                  lblNumArma.setText("Alabarda");
                  break;
                case 27:
                  lblNumArma.setText("Glaive");
                  break;
                case 28:
                  lblNumArma.setText("Estilingue");
                  break;
                case 29:
                  lblNumArma.setText("Zarabatana");
                  break;
                case 30:
                  lblNumArma.setText("Arco Simples");
                  break;
                case 31:
                  lblNumArma.setText("Arco Composto");
                  break;
                case 32:
                  lblNumArma.setText("Arco de Guerra");
                  break;
                case 33:
                  lblNumArma.setText("Besta de Mão");
                  break;
                case 34:
                  lblNumArma.setText("Besta Pesada");
                  break;
                default:
                  lblNumArma.setText("Erro no Switch da Arma");
                }
            // -----------------------------------------------------------------
                //Sorteando o dano do personagem
                NumDano = 1+ (int)(Math.random()*20);
                switch(NumDano){
                case 1:
                  lblNumDano.setText("1d6");
                  break;
                case 2:
                  lblNumDano.setText("1d6+2");
                  break;
                case 3:
                  lblNumDano.setText("1d6+4");
                  break;
                case 4:
                  lblNumDano.setText("1d8");
                  break;
                case 5:
                  lblNumDano.setText("1d8+2");
                  break;
                case 6:
                  lblNumDano.setText("1d10");
                  break;
                case 7:
                  lblNumDano.setText("1d12");
                  break;
                case 8:
                  lblNumDano.setText("1d12+2");
                  break;
                case 9:
                  lblNumDano.setText("2d8");
                  break;
                case 10:
                  lblNumDano.setText("2d8+2");
                  break;
                case 11:
                  lblNumDano.setText("2d10");
                  break;
                case 12:
                  lblNumDano.setText("2d10+2");
                  break;
                case 13:
                  lblNumDano.setText("2d10+4");
                  break;
                case 14:
                  lblNumDano.setText("2d10+8");
                  break;
                case 15:
                  lblNumDano.setText("3d10+1");
                  break;
                case 16:
                  lblNumDano.setText("3d10+3");
                  break;
                case 17:
                  lblNumDano.setText("3d10+5");
                  break;
                case 18:
                  lblNumDano.setText("3d12+1");
                  break;
                case 19:
                  lblNumDano.setText("3d12+3");
                  break;
                case 20:
                  lblNumDano.setText("3d12+4");
                  break;
                default:
                  lblNumDano.setText("Erro no Switch do Dano");
                }
        }});
        //Definindo a ação de minizar a janela
        btnMinimizar.addActionListener(
                new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     setExtendedState(ICONIFIED);
                 }
                }
        );
        //Definindo a ação do botão sair
        btnSair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
    // -------------------------------------------------------------------------
        //Adicionando os componentes na tela
        tela.add(lblNome); tela.add(txtNome);
        tela.add(lblForca); tela.add(lblNumForca);
        tela.add(lblDestreza); tela.add(lblNumDestreza);
        tela.add(lblConstituicao); tela.add(lblNumConstituicao);
        tela.add(lblInteligencia); tela.add(lblNumInteligencia);
        tela.add(lblSabedoria); tela.add(lblNumSabedoria);
        tela.add(lblCarisma); tela.add(lblNumCarisma);
        tela.add(lblTendencia); tela.add(lblNumTendencia);
        tela.add(lblHP); tela.add(lblNumHP);
        tela.add(lblMana); tela.add(lblNumMana);
        tela.add(lblArma); tela.add(lblNumArma);
        tela.add(lblDano); tela.add(lblNumDano);
        tela.add(btnGerarAtributos);
        tela.add(btnMinimizar);
        tela.add(btnSair);
    // -------------------------------------------------------------------------    
        //Definindo o tamanho da tela
        setSize(350,500);      
        //Definindo para a tela aparecer
        setVisible(true);
        //Centralizando a tela
        setLocationRelativeTo(null);
        //Definindo para a tela não poder ser redimencionada
        setResizable(false);
    }
}