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
        double personalAccount = 0;
        double brokerAccount = 0;
        double percentForBroker = 0.1;
        double percentOnShares = 0.02;

        for (int i = 1; i <= years * MONTHS_IN_YEAR + months; i++) {
            if (i % 6 == 0) {
                salary += 400;
            }
            personalAccount += (salary - 300) - salary * percentForBroker;
            brokerAccount += salary * percentForBroker;
            brokerAccount += brokerAccount * percentOnShares;
        }
        System.out.println("Собственный счет: $" + personalAccount);
        System.out.println("Счет брокера: $" + brokerAccount);
    }
}
