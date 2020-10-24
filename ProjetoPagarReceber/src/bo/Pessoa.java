package bo;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String fone1;
    private String fone2;
    private String endereco;        //cep

    
    public Pessoa() {
    }

    public Pessoa(int id, String nome, String email, String fone1, String fone2, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.endereco = endereco;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    
    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }
 
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco ) {
        this.endereco = endereco; 
    }

    
    @Override
    public String toString() {
        return this.id + "|"
                + this.nome + "|"
                + this.email + "|"
                + this.fone1 + "|"
                + this.fone2 + "|"
                + this.endereco + "|"; 
    }
}
