package locadora;

import java.util.InputMismatchException;

public class Ultilitario {

    public boolean validarCEP(String cep) {
        return false;
    }

    public static boolean validarCpf(String sAux) {

        if (sAux.length() == 11) {
            int d1, d2;
            int digito1, digito2, resto;
            int digitoCPF;
            String nDigResult;
            d1 = d2 = 0;
            digito1 = digito2 = resto = 0;
            for (int nCount = 1; nCount < sAux.length() - 1; nCount++) {
                digitoCPF = Integer.valueOf(sAux.substring(nCount - 1, nCount)).intValue();
//--------- Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante. 
                d1 = d1 + (11 - nCount) * digitoCPF;
//--------- Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior. 
                d2 = d2 + (12 - nCount) * digitoCPF;
            };
//--------- Primeiro resto da divisão por 11. 
            resto = (d1 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior. 
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }
            d2 += 2 * digito1;
//--------- Segundo resto da divisão por 11. 
            resto = (d2 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior. 
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }
//--------- Digito verificador do CPF que está sendo validado. 
            String nDigVerific = sAux.substring(sAux.length() - 2, sAux.length());
//--------- Concatenando o primeiro resto com o segundo. 
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
//--------- Comparar o digito verificador do cpf com o primeiro resto + o segundo resto. 
            return nDigVerific.equals(nDigResult);
        }
        return false;
    }

    public static boolean validarCnpj(String sAux) {
//-------- Rotina para CNPJ        
        if (sAux.length() == 14) {
            int soma = 0, aux, dig;
            String cnpj_calc = sAux.substring(0, 12);
            char[] chrCnpj = sAux.toCharArray();
//--------- Primeira parte 
            for (int i = 0; i < 4; i++) {
                if (chrCnpj[i] - 48 >= 0 && chrCnpj[i] - 48 <= 9) {
                    soma += (chrCnpj[i] - 48) * (6 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chrCnpj[i + 4] - 48 >= 0 && chrCnpj[i + 4] - 48 <= 9) {
                    soma += (chrCnpj[i + 4] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
//--------- Segunda parte 
            soma = 0;
            for (int i = 0; i < 5; i++) {
                if (chrCnpj[i] - 48 >= 0 && chrCnpj[i] - 48 <= 9) {
                    soma += (chrCnpj[i] - 48) * (7 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chrCnpj[i + 5] - 48 >= 0 && chrCnpj[i + 5] - 48 <= 9) {
                    soma += (chrCnpj[i + 5] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
            return sAux.equals(cnpj_calc);
        }
        return false;
    }


    public boolean validarEstado(String uf) {
        
        
        return false;

    }
}
