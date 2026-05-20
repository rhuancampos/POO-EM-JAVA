package com.example.dao;

import java.util.List;

import com.example.model.Aluno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class AlunoDAO {
  private EntityManagerFactory emf;

  public AlunoDAO(EntityManagerFactory emf) {
    this.emf = emf;
  }

  private EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  public void incluir(Aluno aluno){
    try(EntityManager em = getEntityManager()){
        em.getTransaction().begin();
        try{
          em.persist(aluno);
          em.getTransaction().commit();
        } catch (Exception e) {
          if (em.getTransaction().isActive()) em.getTransaction().rollback();
          throw new RuntimeException("Falha ao inserir aluno.", e);
        }
    } catch(Exception e) {
      throw new RuntimeException("Erro ao inserir aluno no banco de dados.", e);
    }
  }

  public List<Aluno> obterTodos(){
    try(EntityManager em = getEntityManager()){
      TypedQuery<Aluno> query = em.createQuery("SELECT a FROM Aluno a", Aluno.class);
      return query.getResultList();
    } catch(Exception e) {
      throw new RuntimeException("Erro ao listar todos os alunos.", e);
    }
  }

  public void excluir(Integer matricula){
   try(EntityManager em = getEntityManager()){
        em.getTransaction().begin();
        try{
          Aluno aluno = em.find(Aluno.class, matricula);
          if(aluno != null){
            em.remove(aluno);
          }
          em.getTransaction().commit();
        } catch(Exception e) {
          if (em.getTransaction().isActive()) em.getTransaction().rollback();
          throw new RuntimeException("Falha ao remover aluno.", e);
        }
    } catch(Exception e) {
      throw new RuntimeException("Erro ao exluir o aluno.", e);
    }
  }
}
