package teste;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Testando {

    public static void main(String[] args) {
        Login l1 = new Login();   
        int i, j, k;
        
        i = JOptionPane.showConfirmDialog(null, "você gostaria de realizar um cadastro?","Cadastrar", JOptionPane.YES_NO_OPTION );
        
        if(i == 0){
            if(i == 0){
            String nomeCadastro = JOptionPane.showInputDialog(null, "Digite seu nome:","Cadastro", 3);
            l1.setNome(nomeCadastro);
            String usuarioCadastro = JOptionPane.showInputDialog(null, "Digite seu nome de usuário:","Cadastro", 3);
            l1.setLogin(usuarioCadastro);
            String senhaCadastro = JOptionPane.showInputDialog(null, "Digite sua senha:","Cadastro", 3);
            l1.setSenha(senhaCadastro);
            String emailCadastro = JOptionPane.showInputDialog(null, "Digite seu email:","Cadastro", 3);
            l1.setEmail(emailCadastro);
            
            j = JOptionPane.showConfirmDialog(null, "Você gostaria de fazer login?", "Login", JOptionPane.YES_NO_OPTION);
            
            if(j == 0){
                String usuarioLogin = JOptionPane.showInputDialog(null, "Usuário","Login", 3);
                String senhaLogin = JOptionPane.showInputDialog(null, "Senha","Login", 3);
                
                if ((l1.getUsuario().equals(usuarioLogin)) && (l1.getSenha().equals(senhaLogin))){
                    JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
                    
                    UIManager.put("OptionPane.cancelButtonText", "Sair"); 
                    UIManager.put("OptionPane.noButtonText", "teste"); 
                    UIManager.put("OptionPane.yesButtonText", "Ver múltiplos");
                    
                    k = JOptionPane.showConfirmDialog(null, "O que gostaria de fazer a seguir? ","teste", JOptionPane.YES_NO_CANCEL_OPTION);
                    
                    if(k == 0){
                        int cont = 1, numero;
                        
                        String str_numero;
                        
                        str_numero = JOptionPane.showInputDialog(null, "Você gostaria de ver os multiplos de qual número? (de 1 a 10)");
                        numero = Integer.parseInt(str_numero);
                        
                        int multi = numero;
                        do{
                            JOptionPane.showMessageDialog(null, multi);
                            cont++;
                            multi = numero * cont;   
                        }while(cont <= 10);                   
                        
                        
                        
                    }else if(k == 1){
                        JOptionPane.showMessageDialog(null, "teste");
                    }
                    else{                       
                        
                        JOptionPane.showMessageDialog(null, "Tudo bem, espero te ver em breve!!");
                        
                    }
                    
                }else{
                     JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!!","" ,JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
                System.exit(0);
            }
             
        }else{
            System.exit(0);
        }
        
    }
    
    }
    
    }