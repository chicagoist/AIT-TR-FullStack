package dec_06_2023;
/*
Создать класс Избиратель(Voter),содержащий данные избирателя(имя,возраст,
        адрес)а также конструктор,геттеры и
        сеттеры. При создании экземпляра класса должно быть учтено,
        что минимальный возраст для участия в выборах в Германии 16лет
        Создать несколько обьектов этого класса и вывести на печать массив этих объектов
        */


public class Main {
    public static void main(String[] args) {
        Voter voter1 = new Voter("Hans", 43, "Frankfurt");
        Voter voter2 = new Voter("Jurgen", 18, "Hamburg");
        Voter voter3 = new Voter("Jorg", 12, "Hanau");

        Voter[] arrayVoters = {voter1, voter2, voter3};
        for (Voter voter: arrayVoters) {
            System.out.println(voter);
        }
    }
}
