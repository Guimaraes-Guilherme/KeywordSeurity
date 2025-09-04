import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Password Security");

        // Botões da tela inicial
        Button gerarBtn = new Button("Gerar Senha");
        Button guardarBtn = new Button("Guardar Senha");
        Button visualizarBtn = new Button("Visualizar Senhas");

        gerarBtn.setOnAction(e -> abrirTelaGerar());
        guardarBtn.setOnAction(e -> abrirTelaGuardar());
        visualizarBtn.setOnAction(e -> abrirTelaVisualizar());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(gerarBtn, guardarBtn, visualizarBtn);

        Scene homeScene = new Scene(layout, 400, 300);
        window.setScene(homeScene);
        window.show();
    }

    private void abrirTelaGerar() {
        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> start(window));

        VBox layout = new VBox(20);
        layout.getChildren().add(voltarBtn);

        Scene gerarScene = new Scene(layout, 400, 300);
        window.setScene(gerarScene);
    }

    private void abrirTelaGuardar() {
        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> start(window));

        VBox layout = new VBox(20);
        layout.getChildren().add(voltarBtn);

        Scene guardarScene = new Scene(layout, 400, 300);
        window.setScene(guardarScene);
    }

    private void abrirTelaVisualizar() {
        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> start(window));

        VBox layout = new VBox(20);
        layout.getChildren().add(voltarBtn);

        Scene visualizarScene = new Scene(layout, 400, 300);
        window.setScene(visualizarScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
