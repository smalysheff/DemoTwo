package ru.sapteh;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgramConsole {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

    }
}
