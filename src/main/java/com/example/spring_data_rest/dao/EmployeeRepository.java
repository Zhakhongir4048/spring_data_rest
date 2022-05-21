package com.example.spring_data_rest.dao;

import com.example.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
/*
Spring Data REST предоставляет механизм автоматического создания REST API на основе типа Entity,
прописанного в репозитории проекта.
Сканирует все Repository, затем посмотрим на generic Employee, потом на его основе, создаст все
необходимые RESP API. Пример employees
Spring Boot Actuator предоставляет готовые конечные точки (endpoints), с помощью которых мониторится приложение
/actuator/health - Информация о статусе приложения
/actuator/info - Информация о приложении
/actuator/beans - Информация о всех бинах, зарегистрированных в Spring Container-е
/actuator/mappings - Информация о всех Mapping-ах
*/