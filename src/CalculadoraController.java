import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import operacoes.Divisao;
import operacoes.Multiplicacao;
import operacoes.Soma;
import operacoes.Subtracao;

public class CalculadoraController {

    @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField inputAcc;

    @FXML
    private Button botaoMais;

    @FXML
    private Button botaoMenos;

    @FXML
    private Button botaoVezes;

    @FXML
    private Button botaoDividido;

    @FXML
    private TextField output;

    private Divisao div = new Divisao();
    private Multiplicacao mult = new Multiplicacao();
    private Soma sum = new Soma();
    private Subtracao sub = new Subtracao();

    double[] tryGetInputs(){
        double res[] = new double[3];

        try {
            res[0] = Double.parseDouble(inputA.getText());
            res[1] = Double.parseDouble(inputB.getText());
        } catch (Exception e) {
            output.setText("Entradas incorretas!");
            throw(e);
        }

        try {
            res[2] = Double.parseDouble(inputAcc.getText());
        } catch (Exception e) {
            res[2] = 2;
        }

        return res;
    }

    @FXML
    void dividir(ActionEvent event) {
        double inputs[] = tryGetInputs();

        output.setText(Double.toString(this.div.executar(inputs[0], inputs[1], (int)inputs[2])));
    }

    @FXML
    void multiplicar(ActionEvent event) {
        double inputs[] = tryGetInputs();

        output.setText(Double.toString(this.mult.executar(inputs[0], inputs[1], (int)inputs[2])));
    }

    @FXML
    void somar(ActionEvent event) {
        double inputs[] = tryGetInputs();

        output.setText(Double.toString(this.sum.executar(inputs[0], inputs[1], (int)inputs[2])));
    }

    @FXML
    void subtrair(ActionEvent event) {
        double inputs[] = tryGetInputs();

        output.setText(Double.toString(this.sub.executar(inputs[0], inputs[1], (int)inputs[2])));
    }

}
