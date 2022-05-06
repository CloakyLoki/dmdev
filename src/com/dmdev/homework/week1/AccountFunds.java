package com.dmdev.homework.week1;

/*
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.

Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.

Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class AccountFunds {
    final static private int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        int years = 3;
        int months = 2;
        int salary = 600;
        double accountVanya = 0;
        double accountBroker = 0;
        double percentForBroker = 10;
        double percentOnShares = 2;

        for (int i = 1; i <= years * MONTHS_IN_YEAR + months; i++) {
            if (i % 6 == 0) {
                salary += 400;
            }
            accountBroker += (accountBroker + (salary * (percentForBroker / 100))) * (percentOnShares / 100); //скобки добавлены для лучшей читаемости
            accountVanya += (salary - 300) - (salary * (percentForBroker / 100));
        }
        System.out.println("Собственный счет: $" + accountVanya);
        System.out.println("Счет брокера: $" + accountBroker);
    }
}
