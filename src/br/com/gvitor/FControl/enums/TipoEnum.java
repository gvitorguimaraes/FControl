package br.com.gvitor.FControl.enums;

public enum TipoEnum {
    
    SAIDA("Saída"),
    ENTRADA("Entrada");

    private String valor;

    TipoEnum(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
