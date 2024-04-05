package de.ait.spring_app.repositories;

import de.ait.spring_app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account,Long> {
    //JpaRepository<Account, Long> является интерфейсом в Spring Data JPA,
    // который предоставляет базовые методы для работы с сущностями базы данных.

    //Методы JpaRepository:
    //JpaRepository предоставляет множество методов для работы с данными:
    //
    //save(entity): сохраняет сущность в базе данных.
    //findById(id): находит сущность по ее идентификатору.
    //findAll(): возвращает все сущности данного типа.
    //delete(entity): удаляет сущность из базы данных.
    //и многие другие.
}
