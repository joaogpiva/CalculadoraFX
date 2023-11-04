package operacoes;

public class Divisao extends Operacao {
    public Divisao(){
        super("/");
    }

    @Override
    public double executar(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return x / y;
    }

    @Override
    public double executar(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return this.truncarValor(x / y, 2);
    }

    @Override
    public double executar(double x, double y, int precisao) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return this.truncarValor(x / y, precisao);
    }  
}
