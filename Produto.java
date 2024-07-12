
public class Produto {
    //declarações de campos de instância
    private String nomeProduto;
    private double valorProduto;
    private int qtdeEstoque;
    private int codItem;
    private boolean estaAtivo = true;

    //construtor padrão
    public Produto (){
    	
    }

    //contrutor com parâmetros de instância
    public Produto (String nomeProduto, double valorProduto, int qtdeEstoque, int codItem, boolean estaAtivo){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.qtdeEstoque = qtdeEstoque;
        this.codItem = codItem;
        this.estaAtivo = estaAtivo;
    }

    //métodos de acesso e modificadores
    public String getNomeProduto (){
        return nomeProduto;
    }

    public void setNomeProduto (String nomeProduto){
    	this.nomeProduto = nomeProduto;
    }

    public double getValorProduto (){
        return valorProduto;
    }

    public void setValorProduto (double valorProduto){
    	this.valorProduto = valorProduto;
    }

    public int getQtdeEstoque (){
        return qtdeEstoque;
    }

    public void setQtdeEstoque (int qtdeEstoque){
    	this.qtdeEstoque = qtdeEstoque;
    }

    public int getCodItem (){
        return codItem;
    }

    public void setCodItem (int codItem){
    	this.codItem = codItem;
    }

    public boolean getEstaAtivo (){
        return estaAtivo;
    }

    public void setEstaAtivo (boolean estaAtivo){
        this.estaAtivo = estaAtivo;
    	/*if (qtdeEstoque > 0) {
    		estaAtivo = true;
    	} else {
    		estaAtivo = false;
    	}*/
    }
    
    public double getInventaryValue () {
    	return getValorProduto() * getQtdeEstoque();
    }

    @Override
    public String toString() {
        return  "Item: " + getNomeProduto() +
        		"; Código: " + getCodItem() + 
                "; Valor: $" + getValorProduto() + 
                "; Quantidade: " + getQtdeEstoque() + 
                "; Valor do estoque: " + getInventaryValue() + 
                "; Status do produto: " + (getQtdeEstoque() > 0 ? "Ativo" : "Descontinuado");
    }
}