package moneycalculator.Model;
public class Currency {
    public String code;
    public String symbol;
    public String name;

    public Currency(String code, String symbol, String name) {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    } 

}
