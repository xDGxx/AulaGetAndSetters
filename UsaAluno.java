
package aula2.diogo;

import javax.swing.JOptionPane;

public class UsaAluno {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        //caixa de dialogo requisitando o nome
        String nome1 = JOptionPane.showInputDialog(null,"Digite o nome");
        a1.setNome(nome1);
        
        double n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite sua primeira nota")
        );
        a1.setP1(n1);
        
        double n2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite sua segunda nota")
        );
        a1.setP2(2);
        
        double ado = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite ado:")
        );

        a1.setAdo(ado);
        
        a1.setMedia();
        
        JOptionPane.showMessageDialog(null, a1.getNome() + "\n" + a1.getMedia() );
    }
 
}
