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

    Input tryGetInputs(){
        Input res = new Input(); 

        try {
            res.a = Double.parseDouble(inputA.getText());
            res.b = Double.parseDouble(inputB.getText());
        } catch (Exception e) {
            output.setText("Entradas incorretas!");
            throw(e);
        }

        try {
            res.precisao = Integer.parseInt(inputAcc.getText());
        } catch (Exception e) {
            res.precisao = 2;
        }

        return res;
    }

    @FXML
    void dividir(ActionEvent event) {
        Input i = tryGetInputs();

        output.setText(Double.toString(this.div.executar(i.a, i.b, i.precisao)));
    }

    @FXML
    void multiplicar(ActionEvent event) {
        Input i = tryGetInputs();

        output.setText(Double.toString(this.mult.executar(i.a, i.b, i.precisao)));
    }

    @FXML
    void somar(ActionEvent event) {
        Input i = tryGetInputs();

        output.setText(Double.toString(this.sum.executar(i.a, i.b, i.precisao)));
    }

    @FXML
    void subtrair(ActionEvent event) {
        Input i = tryGetInputs();

        output.setText(Double.toString(this.sub.executar(i.a, i.b, i.precisao)));
    }

}
