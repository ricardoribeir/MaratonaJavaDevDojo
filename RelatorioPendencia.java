/*
Crie um algoritimo que possua variaveis para salvar os seguintes dados:
Nome, endereço e telefone de uma pessoa.
Imprima essas variaveis da seguinte forma:
O <nome> domiciliado no endereço <endereço> e telefone <telefone> não possui
nenhum tipo de pendência.
 */

public class RelatorioPendencia {
    public static void main (String [] args){
        String nome = "Ricardo";
        String endereco = "r. Antônio Teixeira Lacerda s/n";
        String telefone = "9999-9999";
        System.out.println(nome + " domiciliado no endereço " + endereco + " e telefone " + telefone + " não possui nenhuma pendência.");
    }
}
