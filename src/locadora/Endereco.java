
package locadora;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;
    
    public static Endereco criar(){
        Leitura input = new Leitura();
        
        System.out.println("Digite o nome da rua: ");
        String rua = input.lerString();
        System.out.println("Digite o numero da casa: ");
        int numero = input.lerInt();
        System.out.println("Digite o cep: ");
        String cep = input.lerString();
        System.out.println("Digite a cidade: ");
        String cidade = input.lerString();
        System.out.println("Digite o Estado: ");
        String estado = input.lerString();
        
        return new Endereco(rua,numero,cep,cidade,estado);
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", cep=" + cep + 
                ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    
    
    public Endereco(String rua, int numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Endereco(){
        
    }
    
}
