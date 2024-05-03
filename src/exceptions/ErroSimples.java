package exceptions;

//criação da classe de erro personalizado, que irá herdar a Exception, do java
public class ErroSimples extends Exception {

	/**
	 * essa linha do serialVersionUID é uma especificidade do Java, que garante que a versão deste
	 * código esteja sincronizada com a versão da Exception
	 */
	private static final long serialVersionUID = 1L;
	
	//construtor vazio da classe
	public ErroSimples() {}
	
	//método que irá jogar o nosso erro, recebendo um atributo de mensagem personalizada
	public ErroSimples(String mensagem) {
		super(mensagem);
	}

}
