package org.useJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class AuthorService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

public void createBook(){
    Author author =new Author("Author First", "Author last", LocalDate.of(2022, 4, 20));
    tx.begin();
    em.persist(author);
    tx.commit();
}

public void  removeAuthor(Long id){
        Author author = em.find(Author.class, id);
        if(author!=null){
            em.remove(author);
        }
}
}
