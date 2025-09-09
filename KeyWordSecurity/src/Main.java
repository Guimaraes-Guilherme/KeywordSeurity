import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Password Security");

        // Inicia na tela Home
        abrirTelaHome();
        window.show();
    }

    // Tela Inicial
    private void abrirTelaHome() {
        Label titulo = new Label("Password Security");

        Button gerarBtn = new Button("Gerar Senha");
        gerarBtn.setOnAction(e -> abrirTelaGerar());

        Button guardarBtn = new Button("Guardar Senha");
        guardarBtn.setOnAction(e -> abrirTelaGuardar());

        Button visualizarBtn = new Button("Visualizar Senhas");
        visualizarBtn.setOnAction(e -> abrirTelaVisualizar());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(titulo, gerarBtn, guardarBtn, visualizarBtn);

        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
    }

    // Tela Gerar Senha
    private void abrirTelaGerar() {
        Label label = new Label("Gerador de Senha");

        TextField campoSenha = new TextField();
        campoSenha.setEditable(false);

        Button gerar = new Button("Clique aqui para gerar senha");
        gerar.setOnAction(e -> campoSenha.setText(PasswordGenerator.generate(12, true, true, true)));

        CheckBox copiar = new CheckBox("Copiar");

        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> abrirTelaHome());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(label, campoSenha, gerar, copiar, voltarBtn);

        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
    }

    // Tela Guardar Senha
    private void abrirTelaGuardar() {
        Label label = new Label("Guardar Senha");

        TextField nomeApp = new TextField();
        nomeApp.setPromptText("Nome do aplicativo/site");

        TextField senha = new TextField();
        senha.setPromptText("Senha");

        Button guardar = new Button("Guardar");
        guardar.setOnAction(e -> {
            // Aqui depois vamos salvar em arquivo ou banco
            System.out.println("Salvo: " + nomeApp.getText() + " -> " + senha.getText());
        });

        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> abrirTelaHome());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(label, nomeApp, senha, guardar, voltarBtn);

        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
    }

    // Tela Visualizar Senhas
    private void abrirTelaVisualizar() {
        Label label = new Label("Senhas Salvas");

        ListView<String> lista = new ListView<>();
        lista.getItems().addAll("Exemplo: Gmail -> senha123", "Netflix -> senha321");

        Button voltarBtn = new Button("Voltar");
        voltarBtn.setOnAction(e -> abrirTelaHome());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(label, lista, voltarBtn);

        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
