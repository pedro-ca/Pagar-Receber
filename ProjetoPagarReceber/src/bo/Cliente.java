package bo;
public class Cliente extends Pessoa {
    private String cpf;
    private String rg;
    private String sexo;

    public Cliente() {
    }

    public Cliente(String cpf, String rg, String sexo, int id, String nome, String email, String fone1, String fone2, String endereco) {
        super(id, nome, email, fone1, fone2, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return super.toString() + this.cpf + "|" 
                + this.rg + "|"
                + this.sexo + "|"; 
    }
    
    
    //public boolean verificaCpf(String cpf) {} 
}
