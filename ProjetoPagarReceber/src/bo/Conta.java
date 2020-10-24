package bo;

public class Conta {
   private int id;
   private String dtEmissao;
   private String hrEmissao; 
   private String valorEmitido;
   private String dtVencimento; 
   private String numNF;
   private String numParcela; 
   private String observacao; 
   
   public Conta(){
   }

    public Conta(int id, String dtEmissao, String hrEmissao, String valorEmitido, String dtVencimento, String numNF, String numParcela, String observacao) {
        this.id = id;
        this.dtEmissao = dtEmissao;
        this.hrEmissao = hrEmissao;
        this.valorEmitido = valorEmitido;
        this.dtVencimento = dtVencimento;
        this.numNF = numNF;
        this.numParcela = numParcela;
        this.observacao = observacao;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    
    public String getHrEmissao() {
        return hrEmissao;
    }

    public void setHrEmissao(String hrEmissao) {
        this.hrEmissao = hrEmissao;
    }

    
    public String getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(String valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    
    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    
    public String getNumNF() {
        return numNF;
    }

    public void setNumNF(String numNF) {
        this.numNF = numNF;
    }

    
    public String getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(String numParcela) {
        this.numParcela = numParcela;
    }

    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
   
   @Override
    public String toString() {
        return this.id + "|"
            + this.dtEmissao + "|"
            + this.hrEmissao + "|"
            + this.valorEmitido + "|"
            + this.dtVencimento + "|" 
            + this.numNF + "|"
            + this.numParcela + "|"
            + this.observacao + "|";
    }
}



