package teste;

import javax.swing.JOptionPane;

public class Cliente {
    public String Nome;
    private String Cpf;
    private String Telefone;
    private String Email;

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
   

    
}
