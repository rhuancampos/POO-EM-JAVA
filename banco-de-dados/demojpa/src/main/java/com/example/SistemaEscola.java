package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import com.example.dao.AlunoDAO;
import com.example.model.Aluno;

public class SistemaEscola {
  private AlunoDAO dao;
  private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

  public SistemaEscola(AlunoDAO dao) {
    this.dao = dao;
  }

  private void exibir(Aluno aluno) {
    System.out.println("Aluno: " + aluno.getNome() +
        "\nMatricula: " + aluno.getMatricula() +
        "\tEntrada: " + aluno.getAno() +
        "\n==========================");
  }

  public void exibirTodos() {
    try {
      dao.obterTodos().forEach(this::exibir);
    } catch (Exception e) {
      System.err.println("ERRO: Não foi possível listar os alunos. Causa: " + e.getMessage());
    }
  }

  public void inserirAluno() throws IOException {
    try {
      Aluno aluno = new Aluno();
      System.out.println("Nome:");
      aluno.setNome(entrada.readLine());

      System.out.println("Entrada:");
      aluno.setAno(Integer.parseInt(entrada.readLine()));;

      dao.incluir(aluno);
      System.out.println("Aluno inserido com sucesso!");
    } catch (Exception e) {
      System.err.println("\n[ERRO] Não foi possível concluir a operação. Verifique os dados.");
    }
  }

  public void excluirAluno() throws IOException {
    try {
      System.out.println("Matricula do aluno a ser excluído:");
      Integer matricula = Integer.parseInt(entrada.readLine());

      dao.excluir(matricula);
      System.out.println("Operação de exclusão enviada com sucesso.");
    } catch (Exception e) {
      System.err.println("\n[ERRO] Não foi possível concluir a operação.");
    }
  }
}
