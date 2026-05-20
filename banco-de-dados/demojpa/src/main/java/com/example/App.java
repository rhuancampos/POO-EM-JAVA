package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.dao.AlunoDAO;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * para compilar execute: mvn clean compile
 * para executar, use: mvn exec:java -Dexec.mainClass="com.example.App"
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJavaDB01PU");
        AlunoDAO alunoDAO = new AlunoDAO(emf);
        SistemaEscola sistema = new SistemaEscola(alunoDAO);
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            System.out.println("\n1-Listar\t2-Inserir\t3-Excluir\t0-Sair");
            try {
                int opcao = Integer.parseInt(entrada.readLine());
                
                if (opcao == 0) {
                    break; 
                }
                
                switch (opcao) {
                    case 1:
                        sistema.exibirTodos();
                        break;
                    case 2:
                        sistema.inserirAluno();
                        break;
                    case 3:
                        sistema.excluirAluno();
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: Por favor, digite um número como opção.");
            }
        }
        
        System.out.println("Encerrando a aplicação...");
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
