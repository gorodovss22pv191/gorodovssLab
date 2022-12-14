package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.entity.User;

public interface UserService {
    /**
     * Создание объекта класса User
     **/
    public User create(String firstName, String secondName, String surname, int id, String workplace);

    /**
     * Вывод данных объекта класса User
     **/
    public void read(User user);

    /**
     * Обновление полей класса User
     **/
    public void updateId(User user, int id);

    public void updateWorkplace(User user, String workplace);

    public void updateCreditAccount(User user, CreditAccount creditAccount);

    public void updatePaymentAccount(User user, PaymentAccount paymentAccount);

    public void updateCreditRating(User user, double creditRating);

    public void updateSalary(User user, double salary);

    public void updateBank(User user, Bank bank);

    /**
     * Увеличение значения счетчика клиентов банка клиента
     **/
    public void addClient(User user);

    /**
     * Уменьшение значения счетчика клиентов банка клиента
     **/
    public Boolean subClient(User user);

    /**
     * Удаление объекта класса клиент
     **/
    public void delClient(User user);
}
