public class Calculator {

    private Double number1;
    private Double number2;

    public void setNumbers(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double getNumber1() {
        return this.number1;
    }

    public Double getNumber2() {
        return this.number2;
    }

    public Double addition() {
        return getNumber1() + getNumber2();
    }

    public Double subtraction() {
        return getNumber1() - getNumber2();
    }

    public Double multiplication() {
        return getNumber1() * getNumber2();
    }

    public Double division() {
        return getNumber1() / getNumber2();
    }

}
