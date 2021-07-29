package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador; // 1 principio do page objects, ter um atributo da classe que seja webdriver

    public LoginPage(WebDriver navegador) { // 2 tenha um construtor da classe que pegue um navegador de fora e joga aqui
        this.navegador = navegador;
    }

    public LoginPage informarOUsuario(String usuario) {
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys(usuario);

        return this; // fluent pages
    }

    public LoginPage informarASenha(String senha) {
        navegador.findElement(By.cssSelector("label[for='senha']"));
        navegador.findElement(By.id("senha")).sendKeys(senha);

        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeLogin() {
        navegador.findElement(By.cssSelector("button[name='action']")).click();

        return new ListaDeProdutosPage(navegador);
    }
}
