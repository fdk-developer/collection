import org.w3c.dom.ls.LSOutput;

public class Pedido {

    private Integer numero;
    private String descricao;
    private double valor;

    //public Pedido() {
    //}

    public Pedido(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("{ 'id': %s, 'descricao': %s, 'valor': %s }", this.numero, this.descricao, this.valor);
    }


}
