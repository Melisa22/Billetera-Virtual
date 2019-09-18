package ar.com.ada.billeteravirtual.abmpersona;

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class MovimientoManager {
    protected SessionFactory sessionFactory;

    protected void setup() {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
                                                                                                  // from
                                                                                                  // hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }
        
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(movimiento);
  
        session.getTransaction().commit();
        session.close();
    }

    public Persona read(int personaId) {
        Session session = sessionFactory.openSession();

        Persona persona = session.get(Persona.class, personaId);

        session.close();

        return persona;
    }

    protected Persona readByDNI(String dni) {
        Session session = sessionFactory.openSession();

        Persona persona = session.get(Persona.class, dni);

        session.close();

        return persona;
    }

    protected void update(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(movimiento);

        session.getTransaction().commit();
        session.close();
    }

    protected void delete(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(movimiento);

        session.getTransaction().commit();
        session.close();
    }

    }


