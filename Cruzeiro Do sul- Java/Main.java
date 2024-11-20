

import javax.swing.*;

public class Main {
    /* O Codigo abaixo dentro do método main cria a janela do menu em uma thread separada
    * do EDT "Event Dispach Thread" que resumidamente é a responsavel por processar os eventos
    * de interface do usuario. Com essa implementação a interface do usuario fica mais reponsiva e
    * confiavél para lidar com os dados dos usuarios. */

   public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run (){
                new Menu().setVisible(true);
            }
        }); 
   }
}