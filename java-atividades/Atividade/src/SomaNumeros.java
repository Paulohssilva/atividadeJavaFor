public class SomaNumeros {
    public static void main(String[] args)  {
       int soma = 0;   // variavel para armazenar a soma
       //Loop FOR de 1 a 50
       for (int i = 1; i <= 50; i++){
        soma += i; // acumula o valor de i na variavel soma 
       }
       System.out.println("A somados numeros de 1 a 50 e: " + soma);
    }
}
