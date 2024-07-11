
public class Produto {
    //declarações de campos de instância
    private String nomeProduto;
    private double valorProduto;
    private int qtdeEstoque;
    private int codItem;

    //construtor padrão
    public Produto (){

    }

    //contrutor com parâmetros de instância
    public Produto (String nome, double valor, int qtdeEstoque, int codigo){
        this.nomeProduto = nome;
        this.valorProduto = valor;
        this.qtdeEstoque = qtdeEstoque;
        this.codItem = codigo;
    }

    //métodos de acesso e modificadores
    public String getNomeProduto (){
        return nomeProduto;
    }

    public void setNomeProduto (){

    }

    public double getValorProduto (){
        return valorProduto;
    }

    public void setValorProduto (){

    }

    public int getQtdeEstoque (){
        return qtdeEstoque;
    }

    public void setQtdeEstoque (){

    }

    public int getCodItem (){
        return codItem;
    }

    public void setCodItem (){

    }

    @Override
    public String toString() {
        return  "Item: " + getNomeProduto() + 
                "; Quantidade: " + getQtdeEstoque() + 
                "; Código: " + getCodItem() + 
                "; Valor: " + getValorProduto();
    }
}