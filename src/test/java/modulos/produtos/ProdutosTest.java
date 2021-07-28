package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Web do Módulo de Produtos")
public class ProdutosTest {

    @Test
    @DisplayName("Não é permitido registrar um produto com valor igual à zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero(){
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32(92)\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // maximizar janela
        navegador.manage().window().maximize();
        // Navegar para a página da lojinha web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");

        // fazer login
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys("admin");

        navegador.findElement(By.cssSelector("label[for='senha']"));
        navegador.findElement(By.id("senha")).sendKeys("admin");

        navegador.findElement(By.cssSelector("button[name='action']")).click();

        // tela de registro de produto

        // preencher dados do produto e o valor será = 0

        // submeter o formulário

        // validar mensagem de erro fora apresentada
    }
}
