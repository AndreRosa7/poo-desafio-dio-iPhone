package iPhone;

public  class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main (String[]args) {
	iPhone meuIphone = new iPhone();
	
	// Testando Reprodutor Musical
	System.out.println(" REPRODUTOR MÚSICAL");
	
	meuIphone.tocarMusica();
	meuIphone.pausarMusica();
	meuIphone.selecionarMusica(" Música Exemplo");
	
    // Testando Aparelho Telefônico
	System.out.println(" APARELHO TELEFÔNICO");
   
	meuIphone.ligar("(73)98112-2702"); 
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();
    
    // Testando Navegador na Internet
    System.out.println("NAVEGADOR INTERNET");
    
    meuIphone.exibirPagina();
    meuIphone.atualizarPagina();
    meuIphone.adicionarNovaAba(" https://www.example.com");
    
	 
	 
}
	 
	 
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página");
		
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando Nova Aba" + url);
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando Para: " + numero);		
	}
 
	@Override
	public void atender() {
		System.out.println("Atendendo Ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Vóz");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando Música");		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando Música");			
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Música:" + musica);	
	}
}
	


