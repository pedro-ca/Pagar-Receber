package bo;

public class Pagar extends Conta{
    
    public Pagar() {
    }  
    
    
    public Pagar(int id, String dtEmissao, String hrEmissao, String valorEmitido, String dtVencimento, String numNF, String numParcela, String observacao) {
        super(id, dtEmissao, hrEmissao, valorEmitido, dtVencimento, numNF, numParcela, observacao);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
