import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

  public String baseUrl = "http://www2.policiamilitar.sp.gov.br/ocorrenciaweb";
  public String logradouroCasa = "Rua Felipe Camarão";
  public String numero = "207";
  public String reclamacao = ""; //Descrever a reclamação aqui

  @org.junit.Test
  public void residenciasFestas() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    WebDriver navigator = new ChromeDriver();
    navigator.manage().window().maximize();
    navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys("Cicero Oliverio");
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys("33874389820");
    navigator.findElement(By.id("rg")).sendKeys("420308696");
    navigator.findElement(By.id("email")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("emailVerifique")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("ddd")).sendKeys("11");
    navigator.findElement(By.id("telefone")).sendKeys("975697393");
    navigator.findElement(By.id("botaoCadastroProximo")).click();

    //Segunda Página

    //navigator.findElement(By.id("municipio")).click();
    WebElement municipio = navigator
        .findElement(By.xpath("//*[contains(text(), 'SAO BERNARDO DO CAMPO')]"));
    municipio.click();

    WebElement logradouro = navigator.findElement(By.id("logradouro"));

    logradouro.sendKeys(logradouroCasa);
    logradouro.sendKeys(Keys.TAB);

    navigator.findElement(By.xpath("//*[@id=\"tabelaLogradouro\"]/tbody/tr/td[2]")).click();

    navigator.findElement(By.id("numero")).sendKeys(numero);

    navigator.findElement(By.id("complemento")).sendKeys("Casa");
    WebElement cep = navigator.findElement(By.id("cep"));
    cep.click();
    cep.sendKeys("09820140");

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[3]/label")).click();

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_7\"]/div[4]/label")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));
    caixadeTexto.click();
    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.xpath("//*[@id=\"radioContatoNao\"]")).click();

    navigator.findElement(By.id("checkDeclaracao")).click();

  }

  @org.junit.Test
  public void viaPublicaBailePancadao() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    WebDriver navigator = new ChromeDriver();
    navigator.manage().window().maximize();
    navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys("Cicero Oliverio");
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys("33874389820");
    navigator.findElement(By.id("rg")).sendKeys("420308696");
    navigator.findElement(By.id("email")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("emailVerifique")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("ddd")).sendKeys("11");
    navigator.findElement(By.id("telefone")).sendKeys("975697393");
    navigator.findElement(By.id("botaoCadastroProximo")).click();

    //Segunda Página

    //navigator.findElement(By.id("municipio")).click();
    WebElement municipio = navigator
        .findElement(By.xpath("//*[contains(text(), 'SAO BERNARDO DO CAMPO')]"));
    municipio.click();

    WebElement logradouro = navigator.findElement(By.id("logradouro"));

    logradouro.sendKeys(logradouroCasa);
    logradouro.sendKeys(Keys.TAB);

    navigator.findElement(By.xpath("//*[@id=\"tabelaLogradouro\"]/tbody/tr/td[2]")).click();

    navigator.findElement(By.id("numero")).sendKeys(numero);

    navigator.findElement(By.id("complemento")).sendKeys("Casa");
    WebElement cep = navigator.findElement(By.id("cep"));
    cep.click();
    cep.sendKeys("09820140");

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[2]/label")).click();

    navigator.findElement(By.xpath(
        "//*[@id=\"PerguntaRespostaAtendimento_1__AlternativaRespostaAtendimento_CodigoAlternativaResposta\"]"))
        .click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));
    caixadeTexto.click();
    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.xpath("//*[@id=\"radioContatoNao\"]")).click();

    navigator.findElement(By.id("checkDeclaracao")).click();

  }

  @org.junit.Test
  public void residenciaAglomeracaoDePessoas() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    WebDriver navigator = new ChromeDriver();
    navigator.manage().window().maximize();
    navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys("Cicero Oliverio");
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys("33874389820");
    navigator.findElement(By.id("rg")).sendKeys("420308696");
    navigator.findElement(By.id("email")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("emailVerifique")).sendKeys("cicero_oliverio@hotmail.com");
    navigator.findElement(By.id("ddd")).sendKeys("11");
    navigator.findElement(By.id("telefone")).sendKeys("975697393");
    navigator.findElement(By.id("botaoCadastroProximo")).click();

    //Segunda Página

    //navigator.findElement(By.id("municipio")).click();
    WebElement municipio = navigator
        .findElement(By.xpath("//*[contains(text(), 'SAO BERNARDO DO CAMPO')]"));
    municipio.click();

    WebElement logradouro = navigator.findElement(By.id("logradouro"));

    logradouro.sendKeys(logradouroCasa);
    logradouro.sendKeys(Keys.TAB);

    navigator.findElement(By.xpath("//*[@id=\"tabelaLogradouro\"]/tbody/tr/td[2]")).click();

    navigator.findElement(By.id("numero")).sendKeys(numero);

    navigator.findElement(By.id("complemento")).sendKeys("Casa");
    WebElement cep = navigator.findElement(By.id("cep"));
    cep.click();
    cep.sendKeys("09820140");

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[2]/label")).click();

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_2\"]/div[7]/label")).click();

    navigator.findElement(By.xpath("//div[@id='Pergunta_4']//div[2]//label[1]//input[1]")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));
    caixadeTexto.click();
    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.xpath("//*[@id=\"radioContatoNao\"]")).click();

    navigator.findElement(By.id("checkDeclaracao")).click();

  }

}
