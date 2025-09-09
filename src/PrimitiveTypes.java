public class PrimitiveTypes {   
   
    public static void main(String[] args) {
         // Tipo Booleano -> Consome 1 bit de memória.
         // Ou recebe true ou false -> 0 ou 1. Sinais binários
         boolean isStudent = true;
        
        // O tipo char -> Character consome 8 bits ou 1 byte de memória.
        // Suporta apenas 1 caracter do tipo texto
         char letter = 'Z';

         // Tipos de dados primitivos inteiross...
         // byte -> Ocupa 8 bits ou 1 byte de memória
         // como ocupa 8 bits de memoria -> Suporta numero inteiros apenas até o 127 positivo e 17 negativo
         // 2 elevado a 8 -> 256 números disponiveis
         byte numByte = 127;

         // short -> Ocupa 2 bytes de memória 
         // Logo suporta uma quantidade maior de números inteiros
         short numShort = 1200;
         // short -> Ocupa 4 bytes de memória 
         // Logo suporta uma quantidade maior de números inteiros
         int numInt = 32000;
         // short -> Ocupa 8 bytes de memória 
         // Logo suporta uma quantidade maior de números inteiros
         long numLog = 100000;


         // Numero Reais -> Ponto Flutuante
         float numFloat = 1000.00f;
        double numDouble = 100000.00;
    }
}
