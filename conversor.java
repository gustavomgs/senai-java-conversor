import java.util.Scanner;

class ConversorRD {
  
	public static void main(String args[]){  
   
		Scanner teclado = new Scanner(System.in);
    
    String nomeMoedaX;
    String nomeMoedaY;
    
    double cotacaoMoedaX;
    double quantidadeMoedaY;
    double resultadoFormula;
        
    nomeMoedaX    = teclado.next();
    cotacaoMoedaX = teclado.nextDouble();          

    nomeMoedaY       = teclado.next();
    quantidadeMoedaY = teclado.nextDouble();       
		
    resultadoFormula = quantidadeMoedaY / cotacaoMoedaX;
  
    System.out.printf("%f", resultadoFormula); 

    System.exit(0);
		
	}

}
