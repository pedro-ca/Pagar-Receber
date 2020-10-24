package bo;

public class Pagamento {
    private int id;
    private String dtPagamento;
    private String hrRecebimento;
    private String valorPagamento;
    private String observacao;
    
    
    public Pagamento() {
    }

    public Pagamento(int id, String dtPagamento, String hrRecebimento, String valorPagamento, String observacao) {
        this.id = id;
        this.dtPagamento = dtPagamento;
        this.hrRecebimento = hrRecebimento;
        this.valorPagamento = valorPagamento;
        this.observacao = observacao;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    
    public String getHrRecebimento() {
        return hrRecebimento;
    }

    public void setHrRecebimento(String hrRecebimento) {
        this.hrRecebimento = hrRecebimento;
    }

    
    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    

    @Override
    public String toString(){
        return this.id + "|"
                + this.dtPagamento + "|"
                + this.hrRecebimento + "|"
                + this.valorPagamento + "|"
                + this.observacao + "|";
    }
}
