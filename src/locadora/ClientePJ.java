
package locadora;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String nomeMotorista;
    
    public static ClientePJ criar(){
        Leitura input = new Leitura();
        Ultilitario ult = new Ultilitario();
        
        
        System.out.println("Nome do Cliente: ");
        String setNome = input.lerString();
        System.out.println("Telefone do Cliente: ");
        String setFone = input.lerString();
        System.out.println("Endereço Cliente: ");
        Endereco end1 = Endereco.criar();
        System.out.println("CNPJ do Cliente: ");
        String cnpj = input.lerString();
        System.out.println("Nome do Motorista : ");
        String nomeMotorista = input.lerString();
        
        do{
            System.out.println("Erro !! CNPJ invalido.");
            System.out.println("CNPJ do Cliente: ");
            cnpj = input.lerString();   
        }while(ult.validarCnpj(cnpj));
        
        return new ClientePJ(cnpj, nomeMotorista, setNome, setFone, end1);
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public String getNomeMotorista(){
        return this.nomeMotorista;
    }
    public void setNomeMotorista(String nomeMotorista){
        this.nomeMotorista = nomeMotorista;
    }

    public ClientePJ(String cnpj, String nomeMotorista, String nome, String fone, Endereco end) {
        super(nome, fone, end);
        this.cnpj = cnpj;
        this.nomeMotorista = nomeMotorista;
    }

    public ClientePJ(String cnpj, String nomeMotorista) {
        this.cnpj = cnpj;
        this.nomeMotorista = nomeMotorista;
    }

    public ClientePJ(){
        
    }
    
}
