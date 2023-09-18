package teste;
import javax.swing.JOptionPane;

public class testezinho {
    
    public static void main(String[] args) {
       Cliente c1 = new Cliente();
       Login l = new Login();
        
       int i, j, k;
       i = JOptionPane.showConfirmDialog(null, "Você gostaria de iniciar um cadastro?", "cadastro", JOptionPane.YES_NO_OPTION);
       
       String login = JOptionPane.showInputDialog("Login");
       l.setLogin(login);
       String senha = JOptionPane.showInputDialog("Senha:");
       l.setSenha(senha);
       
       if(i == 0){
           
           String login2 = JOptionPane.showInputDialog(null, "Digite o seu login:");
           String senha2 = JOptionPane.showInputDialog(null, "Digite a sua senha:");
           
           
           if(l.getLogin().equals(login2) && l.getSenha().equals(senha2)){
               j = JOptionPane.showConfirmDialog(null, "Cadastro efetuado com sucesso, gostaria de cadastrar clientes?", "O que gostaria de fazer?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
               
               if(j == 0){
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    c1.setNome(nome);
                    String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente:");
                    c1.setCpf(cpf);
                    String telefone = JOptionPane.showInputDialog("Digite o telefone: do cliente");
                    c1.setTelefone(telefone);
                    String email = JOptionPane.showInputDialog("Digite o email: do cliente");
                    c1.setEmail(email);
                    k = JOptionPane.showConfirmDialog(null, "Cadastro efetuado com sucesso, gostaria de ver suas informações?", "Teste", JOptionPane.YES_NO_OPTION);
           
                    if(k == 0){
                        JOptionPane.showMessageDialog(null, "Nome: " + c1.getNome()+"\n CPF: " + c1.getCpf() + "\n Email:" + c1.getEmail() +"\n Telefone:"+ c1.getTelefone());

                    }else{
                        System.exit(0);
                    } 
               }else{
                  System.exit(0); 
               }
           }else{
               JOptionPane.showMessageDialog(null, "Usuário ou senha errados!!");
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
