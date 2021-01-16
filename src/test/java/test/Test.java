package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CreateChrome;

public class Test {

  CreateChrome createChrome = new CreateChrome();
  private final WebDriver navigator = createChrome.createChrome();

  public boolean possuiCrianca = false;
//  public  String nome = "Jair Henrique Melo";
//  public String numerocpf = "04863841876";
//  public String rg = "176744009";
//  public String baseUrl = "http://www2.policiamilitar.sp.gov.br/ocorrenciaweb";
//  public String logradouroCasa = "Estrada Brasílio de Lima";
//  public String numero = "225";
//  public String numerocep = "09822020";
//  public String contato = "radioContatoNao";
////  public String contato = "radioContatoSim";
//  public String acompanhar = "radioAcompanharSim";
////  public String acompanhar = "radioAcompanharNao";

  public String nome = "Cicero Oliverio";
  public String numerocpf = "33874389820";
  public String rg = "420308696";
  public String baseUrl = "http://www2.policiamilitar.sp.gov.br/ocorrenciaweb";
  public String logradouroCasa = "Miro Vetorazzo";
  public String numero = "1197";
  public String numerocep = "09820135";
  public String contato = "radioContatoNao";
  //  public String contato = "radioContatoSim";
// public String acompanhar = "radioAcompanharSim";
  public String acompanhar = "radioAcompanharNao";

//  public String reclamacao =
//      "Desde cedo com uma máquina ligada serrando alguma coisa, já são 21:30 e nada de parar."
//          + "Barulho muito alto, não tem acordo o vizinho disse que não vai parar, trabalho amanha e preciso dormir. Pelo amor de Deus nos ajudem!";

  /* public String reclamacao = "Festa de aniversário a essa hora com a maior barulheira, gritaria, bebidas drogas impossível dormir com essa zona.Vizinhos alterados e agressivos, nos ajudem pelo amor de Deus!";
   */

//  public String reclamacao = "Em plena sexta-feira a essa hora com som alto, vizinho encrenqueiro e agressivo.\n"
//      + "Estou com criança pequena em casa e tentando trabalhar mas não dá.\n"
//      + "Ele ameaça os vizinhos e disse que a polícia nada pode fazer, pelo amor de Deus nos ajudem!";

//  public String reclamacao = "Em pleno domingo em pandemia e acabaram de começar uma festinha em casa.\n"
//      + "Falando alto na garagem, fumando maconha e muita barulheira, muitos gritos e som bem alto.\n"
//      + "Todos estão sem máscara e completamente bêbados. Pelo amor de Deus que nos ajude!";

//  public String reclamacao = "Em plena pandemia e a vizinha fazendo uma festinha em casa.\n"
//      + "Muita barulheira, pessoas falando muito alto e completamente bêbados.\n"
//      + "Todos estão sem máscara e acham que podem fazer o que querem a essa hora de domingo.\n"
//      + "Pelo amor de Deus que nos ajude!";

  public String reclamacao = "Festa em plena pandemia com som muito alto e gritaria no condomínio.Entro em contato com o síndico e nada, não resolvem nada.\n"
      + "Tenho uma bebê de 5 meses e não dá pra ela dormir não dá pra ficar no quarto da minha casa!\n"
      + "Pelo amor de Deus me ajudem!";

  @org.junit.Test
  public void residenciasFestas() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[3]/label")).click();

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_7\"]/div[4]/label")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));
    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void residenciasOutros() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[3]/label")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[6]/div[6]/label/input")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void residenciasObras() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[3]/label")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[6]/div[2]/label/input")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void residenciasMusicas() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[3]/label")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[6]/div[3]/label/input")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void viaPublicaBailePancadao() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

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

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void viaPublicaAglomeracaoDePessoas() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

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

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void viaPublicaAparelhodeSom() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[2]/label")).click();

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_2\"]/div[7]/label")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[2]/div[3]/label/input")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void viaPublicaObras() throws InterruptedException {

    navigator.get(baseUrl);

    //Primeira Página

    navigator.findElement(By.id("nome")).sendKeys(nome);
    Thread.sleep(1000);
    WebElement cpf = navigator.findElement(By.id("cpf"));
    cpf.click();
    cpf.sendKeys(numerocpf);
    navigator.findElement(By.id("rg")).sendKeys(rg);
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
    cep.sendKeys(numerocep);

    navigator.findElement(By.id("botaoEnderecoProximo")).click();

    // Terceira Página

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[2]/label")).click();

    navigator.findElement(By.xpath("//*[@id=\"Pergunta_2\"]/div[7]/label")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[2]/div[5]/label/input")).click();

    navigator.findElement(
        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[3]/div[3]/label/input")).click();

    navigator.findElement(By.id("botaoOrigemProximo")).click();

    // Última Página

    WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

    caixadeTexto.click();

    caixadeTexto.sendKeys(reclamacao);

    navigator.findElement(By.id(contato)).click();

    if (contato.equals("radioContatoSim")) {

      navigator.findElement(By.id(acompanhar)).click();

    }

    navigator.findElement(By.id("checkDeclaracao")).click();

    navigator.findElement(By.id("CaptchaInputText")).click();

  }

  @org.junit.Test
  public void viaPublicaCriancas() throws InterruptedException {

    if (possuiCrianca = true) {
      navigator.get(baseUrl);

      //Primeira Página

      navigator.findElement(By.id("nome")).sendKeys(nome);
      Thread.sleep(1000);
      WebElement cpf = navigator.findElement(By.id("cpf"));
      cpf.click();
      cpf.sendKeys(numerocpf);
      navigator.findElement(By.id("rg")).sendKeys(rg);
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
      cep.sendKeys(numerocep);

      navigator.findElement(By.id("botaoEnderecoProximo")).click();

      // Terceira Página

      navigator.findElement(By.xpath("//*[@id=\"Pergunta_1\"]/div[2]/label")).click();

      navigator.findElement(By.xpath("//*[@id=\"Pergunta_2\"]/div[8]/label")).click();

//    navigator.findElement(
//        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[2]/div[5]/label/input")).click();
//
//    navigator.findElement(
//        By.xpath("/html/body/div[1]/form/div[3]/div/div[3]/div/div[3]/div[8]/label/input")).click();

      navigator.findElement(By.id("botaoOrigemProximo")).click();

      // Última Página

      WebElement caixadeTexto = navigator.findElement(By.id("textoComplemento"));

      caixadeTexto.click();

      caixadeTexto.sendKeys(reclamacao);

      navigator.findElement(By.id(contato)).click();

      if (contato.equals("radioContatoSim")) {

        navigator.findElement(By.id(acompanhar)).click();

      }

      navigator.findElement(By.id("checkDeclaracao")).click();

      navigator.findElement(By.id("CaptchaInputText")).click();

    }
  }
}