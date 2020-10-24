package bo;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String InscEstadual;
    private String contato;

    
    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String InscEstadual, String contato, String cpf, String rg, int id, String nome, String email, String fone1, String fone2, String endereco) {
       super(id, nome, email, fone1, fone2, endereco);
       this.cnpj = cnpj;
       this.InscEstadual = InscEstadual;
       this.contato = contato; 
    }

    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    public String getInscEstadual() {
        return InscEstadual;
    }

    public void setInscEstadual(String InscEstadual) {
        this.InscEstadual = InscEstadual;
    }

    
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + this.cnpj + "|" 
                + this.InscEstadual + "|"
                + this.contato + "|"; 
    }
    
    
    // public boolean verificaCnpj(String cnpj) {   }
}