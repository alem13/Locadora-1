
package locadora;

public class Cliente {

    private String nome;
    private String fone;
    private Endereco end;
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getFone(){
        return fone;
    }
    public void setFone(String fone){
        this.fone=fone;
    }
    public Endereco getEnd(){
        return end;
    }
    public void setEnd(Endereco end){
        this.end=end;
    }

    public Cliente(String nome, String fone, Endereco end) {
        this.nome = nome;
        this.fone = fone;
        this.end = end;
    }
    
    public Cliente(){
        
    }
    
    
}
