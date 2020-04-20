package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CreateChrome;

public class Test {

  CreateChrome createChrome = new CreateChrome();
  private WebDriver navigator = createChrome.createChrome();

  public String baseUrl = "http://www2.policiamilitar.sp.gov.br/ocorrenciaweb";
  public String logradouroCasa = "Rua Felipe Camarão";
  public String numero = "198";
  public String reclamacao = "Todos os dias acordando cedo os vizinhos com barulho.\n"
      + "Bate-bate, barulho de furadeira, serra, tudo sem a menor preocupação com barulho e com os vizinhos.\n"
      + "Impossível trabalhar e estudar desse jeito.\n"
      + "Pelo amor de Deus mandem alguém que possa me ajudar!"; //Descrever a reclamação aqui

  @org.junit.Test
  public void residenciasFestas() throws InterruptedException {

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
  public void residenciasOutros() throws InterruptedException {

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

    navigator.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[6]/div[6]/label/input")).click();

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
