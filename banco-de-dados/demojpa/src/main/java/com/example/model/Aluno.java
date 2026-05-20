package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUNO")
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MATRICULA")
  private int matricula;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "ENTRADA")
  private int ano;


  public Aluno(){};
  public Aluno(int matricula, String nome, int ano){
    this.matricula = matricula;
    this.nome = nome;
    this.ano = ano;
  }

  public int getMatricula() {return this.matricula;}
  public String getNome() {return this.nome;}
  public int getAno() {return this.ano;}

  public void setMatricula(int matricula) {this.matricula = matricula;}
  public void setNome(String nome) {this.nome = nome;}
  public void setAno(int entrada) {this.ano = entrada;}
}
