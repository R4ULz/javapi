package teste;
import javax.swing.JOptionPane;

public class testezinho {
    
    public static void main(String[] args) {
       Cliente c1 = new Cliente();
        
       int i, j;
       i = JOptionPane.showConfirmDialog(null, "Você gostaria de iniciar um cadastro?", "cadastro", JOptionPane.YES_NO_OPTION);
       
       if(i == 0){
           String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
           c1.setNome(nome);
           
           String login = JOptionPane.showInputDialog(null, "digite");
           
           if(c1.getNome().equals(login)){
               
               JOptionPane.showMessageDialog(null, "oi nenem");
           }else{
               JOptionPane.showMessageDialog(null, "nao deu nenem");
           }
           /*String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
           c1.setCpf(cpf);
           String telefone = JOptionPane.showInputDialog("Digite o seu telefone:");
           c1.setTelefone(telefone);
           String email = JOptionPane.showInputDialog("Digite o seu email:");
           c1.setEmail(email);
           j = JOptionPane.showConfirmDialog(null, "Cadastro efetuado com sucesso, gostaria de ver suas informações?", "Teste", JOptionPane.YES_NO_OPTION);
           
           if(j == 0){
               JOptionPane.showMessageDialog(null, c1.getNome()+"\n " + c1.getCpf() + "\n " + c1.getEmail() +"\n "+ c1.getTelefone());
               
           }else{
               System.exit(0);
           }*/  
       }else{
           System.exit(0);
       }
    }
}
