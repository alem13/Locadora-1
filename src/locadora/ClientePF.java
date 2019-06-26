
package locadora;

public class ClientePF extends Cliente {
    private String cpf;
    
    public static ClientePF criar(){
        Leitura input = new Leitura();
        Ultilitario ult = new Ultilitario();
        
        System.out.println("Nome do Cliente: ");
        String setNome = input.lerString();
        System.out.println("Telefone do Cliente: ");
        String setFone = input.lerString();
        System.out.println("Endereço Cliente: ");
        Endereco end1 = Endereco.criar();
        System.out.println("Cpf do Cliente: ");
        String cpf = input.lerString();
        
        do{
            System.out.println("Error !! CPF Invalido.");
            System.out.println("Cpf do Cliente: ");
            cpf = input.lerString();
            
        }while(ult.validarCpf(cpf));
        
        return new ClientePF(setNome, setFone, end1, cpf);
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public ClientePF(String nome,String fone,Endereco end,String cpf){
        super(nome,fone,end);
        this.cpf= cpf;
    }
    public ClientePF(String cpf){
        this.cpf = cpf;
    }
    public ClientePF(){
        
    }
    

}
