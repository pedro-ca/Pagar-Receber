package bo;

public class Recebimento {
    private int id;
    private String dtRecebimento;
    private String hrRecebimento;
    private String valorRecebimento;
    private String observacao;
    
    
    public Recebimento(){
    }

    public Recebimento(int id, String dtRecebimento, String hrRecebimento, String valorRecebimento, String observacao) {
        this.id = id;
        this.dtRecebimento = dtRecebimento;
        this.hrRecebimento = hrRecebimento;
        this.valorRecebimento = valorRecebimento;
        this.observacao = observacao;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDtRecebimento() {
        return dtRecebimento;
    }

    public void setDtRecebimento(String dtRecebimento) {
        this.dtRecebimento = dtRecebimento;
    }

    
    public String getHrRecebimento() {
        return hrRecebimento;
    }

    public void setHrRecebimento(String hrRecebimento) {
        this.hrRecebimento = hrRecebimento;
    }


    
    public String getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(String valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
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
                + this.dtRecebimento + "|"
                + this.hrRecebimento + "|"
                + this.valorRecebimento + "|"
                + this.observacao + "|";
    }
}
