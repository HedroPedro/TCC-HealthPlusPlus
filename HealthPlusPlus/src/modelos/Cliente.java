package modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String endereco;
    private String CPF;
    
    public Cliente(){}

    public Cliente(int codigo, String nome, String telefone, String endereco, String CPF) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", CPF=" + CPF + '}';
    }
    
    public Cliente(String nome, String telefone, String endereco, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CPF = CPF;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public boolean estaCertoCPF(){
            char[] cpfTeste = CPF.replaceAll("\\D", "").toCharArray();
            int[] resultados = {0, 0};
            if(cpfTeste[0] == cpfTeste[1] && cpfTeste[1] == cpfTeste[2] && cpfTeste[2] == cpfTeste[3] 
                    && cpfTeste[3] == cpfTeste[4] && cpfTeste[4] == cpfTeste[5] && cpfTeste[5] == cpfTeste[6]
                    && cpfTeste[6] == cpfTeste[7] && cpfTeste[7] == cpfTeste[8] && cpfTeste[8] == cpfTeste[9]
                    && cpfTeste[9] == cpfTeste[10])
                return false;
                        else{
                        int soma = 0;
                    for(int i = 10; i > 1; i--){
                        soma += (Integer.parseInt(String.valueOf(cpfTeste[10-i])) * i);
                    }
                    int resto1 = (soma * 10) % 11;
                    if(resto1 == 10)
                        resultados[0] = 0;
                    else
                        resultados[0] = resto1;
                    int soma1 = 0;
                    for(int i = 11; i > 1; i--){
                        soma1 += (Integer.parseInt(String.valueOf(cpfTeste[11-i])) * i);
                    }
                    int resto2 = (soma1 * 10) % 11;
                    if(resto2 == 10)
                        resultados[1] = 0;
                    else
                        resultados[1] = resto2;
            }
            boolean confirmaCPF = (String.valueOf(resultados[0]).equals(String.valueOf(cpfTeste[9]))) && (String.valueOf(resultados[1]).equals(String.valueOf(cpfTeste[10])));
        return confirmaCPF;
    }
    
    public boolean estaCertoTelefone(){
        char[] telefoneFormat = telefone.replaceAll("\\D", "").toCharArray();
        
        if(telefoneFormat.length != 11){
            return false;
        }
        else if(telefoneFormat[0] == telefoneFormat[1] && telefoneFormat[1] == telefoneFormat[2] && telefoneFormat[3] == telefoneFormat[4]
                && telefoneFormat[4] == telefoneFormat[5] && telefoneFormat[5] == telefoneFormat[6] && telefoneFormat[6] == telefoneFormat[7]
                && telefoneFormat[7] == telefoneFormat[8] && telefoneFormat[8] == telefoneFormat[9] && telefoneFormat[9] == telefoneFormat[10]){
            return false;
        }
        
        return true;
    }
}
