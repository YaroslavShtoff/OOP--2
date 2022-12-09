import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(LocalDate.now().getYear() - 35, " Максим ", " Минск",
                "бренд-менеджера ");
        maxim.life();

        Human anny = new Human(LocalDate.now().getYear() - 29, " Аня ", " Москва",
                "методиста образовательных программ");
        anny.life();

        Human katy = new Human(LocalDate.now().getYear() - 28, " Катя ", " Калиниград",
                "продакт-менеджера ");
        katy.life();

        Human anton = new Human(LocalDate.now().getYear() - 27, " Антон ", " Москва",
                " директора по развитию бизнеса ");
        anton.life();

        Human vladimir = new Human(LocalDate.now().getYear() - 21, " Владимир ", " Казань ",
                " не работаю ");
        vladimir.life();


        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015,
                "Россия", null, 0,null,null,true);
        lada.carID();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия",null,0,null,null,true);
        audi.carID();

        Car bmw = new Car("BMW ", "Z8", 3.0, "черный", 2021,
                "Германия",null,0,null,null,true);
        bmw.carID();

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный",
                2018, "Южная Корея",null,0,null,null,true);
        kia.carID();

        Car hyndai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея",null,0,null,null,true);
        hyndai.carID();


        Flower rose = new Flower("", "Голландия", 35.39, 0);
        Flower chrysanthemum = new Flower("", null, 15, 5);
        Flower peony = new Flower("", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("", "Турция ", 19.5, 10);


        Bouquet bouquet = new Bouquet(
                new Flower[]{
                       rose,rose,rose,
                        chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                        gypsophila,
                }
        );
        bouquet.printInfo();





    }


    }


