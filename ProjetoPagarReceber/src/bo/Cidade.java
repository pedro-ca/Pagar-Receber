package bo;

public class Cidade {
    private int id;
    private String nomecid;
    private String UfCid;

    
    public Cidade() {
    }
    
    public Cidade(int id, String nomecid, String UfCid) {
        this.id = id;
        this.nomecid = nomecid;
        this.UfCid = UfCid;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNomecid() {
        return nomecid;
    }

    public void setNomecid(String nomecid) {
        this.nomecid = nomecid;
    }

    
    public String getUfcid() {
        return UfCid;
    }

    public void setUfcid(String UfCid) {
        this.UfCid = UfCid;
    }
    
    
    @Override
    public String toString() {
        return this.id + "|"
                + this.nomecid + "|"
                + this.UfCid + "|";
    }
}
