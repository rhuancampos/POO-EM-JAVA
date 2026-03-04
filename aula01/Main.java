// O package define o "endereço" da classe no projeto. Ajuda na organização.
package aula01;

// Importações: O Java é modular. Precisamos "trazer" as ferramentas externas.
import java.util.ArrayList; // Estrutura de lista dinâmica
import java.util.List;      // Interface que define o comportamento de listas
import java.util.Scanner;   // Ferramenta para ler o que o usuário digita

public class Main {
    
    // O método main é o ponto de entrada. Sem ele, o programa não "starta".
    public static void main(String[] args) {
        
        // --- 1. PREPARAÇÃO DO SCANNER ---
        // Criamos um objeto 'leitor' para capturar dados do System.in (teclado).
        Scanner leitor = new Scanner(System.in);

        // --- 2. DECLARAÇÃO DE VARIÁVEIS (Tipos Primitivos e Objetos) ---
        // Diferente do PHP/Python, aqui o tipo vem ANTES do nome.
        
        String tipoTexto = "Frase Texto de exemplo"; // Cadeia de caracteres (Objeto)
        char tipoLetra = 'a';                        // Único caractere (aspas simples)
        int tipoNumero = 123;                        // Inteiro padrão (32 bits)
        Integer tipoNumeroObjeto = 456;              // Wrapper: permite valores nulos e métodos
        double tipoDecimal = 3.14;                   // Decimal de alta precisão (padrão)
        boolean tipoBooleano = true;                 // Verdadeiro ou Falso
        float tipoDecimalMenor = 2.71f;              // Decimal simples (o 'f' é obrigatório)
        long tipoNumeroGrande = 123456789L;          // Inteiro longo (o 'L' é obrigatório)
        short tipoNumeroPequeno = 32767;             // Inteiro curto
        byte tipoNumeroMuitoPequeno = 127;           // Inteiro minúsculo (8 bits)

        // --- 3. OPERAÇÕES MATEMÁTICAS E FORMATAÇÃO ---
        float resultado = 4.0f / 3.4f;
        // String.format funciona de forma similar ao printf do C ou format do Python.
        System.out.println("Resultado da divisão: " + String.format("%.2f", resultado));

        // --- 4. ENTRADA DE DADOS COM SCANNER ---
        System.out.println("\n--- Interação com o Usuário ---");
        System.out.print("Digite uma frase para a lista: ");
        
        // Lemos a linha inteira digitada pelo aluno
        String entradaUsuario = leitor.nextLine();

        // --- 5. COLEÇÕES (Lists e ArrayLists) ---
        // 'List' é a interface (o contrato), 'ArrayList' é a implementação (a ferramenta).
        List<String> lista = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        
        // Adicionando elementos fixos e o elemento digitado
        lista.add("Elemento fixo 1");
        lista.add(entradaUsuario); // Adiciona o que o aluno digitou
        arrayList.add("Elemento fixo 2");

        // --- 6. ESTRUTURAS DE REPETIÇÃO (Loops) ---
        
        // Foreach: "Para cada elemento do tipo String dentro da lista..."
        // Ideal para quando queremos apenas ler os dados.
        for (String elemento : lista) {
            System.out.println("Item na Lista: " + elemento);
        }

        System.out.println("--------------------------------");

        // For Tradicional: Usa um contador (i). 
        // Ideal quando precisamos saber a posição (índice) de cada item.
        for(int i = 0; i < arrayList.size(); i++) {
            // .get(i) busca o elemento na posição i do array
            System.out.println("ArrayList posição [" + i + "]: " + arrayList.get(i));
        }
        
        // --- 7. FINALIZAÇÃO ---
        // Sempre feche o scanner ao final para não "vazar" memória.
        leitor.close();
    }
}