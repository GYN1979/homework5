public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1.1
        System.out.println(" Задача 1.1");
        int age = 25;
        if (age >= 18) {
            System.out.println(" Поздравляем с совершенолетием!!!");
        }
        if (age <= 18) {
            System.out.println(" Возраст совершенолетия не наступил, нужно немного подождать");
        }
        // Задача 1.2
        System.out.println(" Задача 1.2");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println(" Закончил школу, можно отправляться в университет");
        }
        if (age >= 24) {
            System.out.println(" Пора на работу");
        }

        // Задача 1.3
        System.out.println(" Задача 1.3");
        int capacity = 102;
        int seats = 60;
        int standingPlaces = capacity - seats;
        int peopleSeats = 38;
        int pepeopleStanding = 40;
        if (seats > peopleSeats) {
            System.out.println(" В вагоне есть еще " + (seats - peopleSeats) + " сидячих мест");
        }
        if (seats == peopleSeats) {
            System.out.println(" В вагоне нет сидячих мест");
        }
        if (standingPlaces > pepeopleStanding) {
            System.out.println(" В вагоне есть еще " + (standingPlaces - pepeopleStanding) + " стоячих мест");
        }
        if (standingPlaces == pepeopleStanding) {
            System.out.println(" В вагоне нет стоячих мест");
        }

        // Задача 2.1
        System.out.println(" Задача 2.1");
        int numberOfYears = 20;
        if (numberOfYears >= 18) {
            System.out.println(" Поздравляем с совершенолетием!!!");
        } else {
        System.out.println(" Возраст совершенолетия не наступил, нужно немного подождать");
        }
        // Задача 2.2
        System.out.println(" Задача 2.2");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println(" Закончил школу, можно отправляться в университет");
        } else if (age > 24){
            System.out.println(" Пора на работу");
        }
        // Задача 2.3
        System.out.println(" Задача 2.3");
        int capacity2 = 102;
        int seats2 = 60;
        int standingPlaces2 = capacity2 - seats2;
        int peopleSeats2 = 60;
        int pepeopleStanding2 = 42;
        if (seats2 > peopleSeats2) {
            System.out.println(" В вагоне есть еще " + (seats2 - peopleSeats2) + " сидячих мест");
        } else {
            System.out.println(" В вагоне нет сидячих мест");
        }
        if (standingPlaces2 > pepeopleStanding2) {
            System.out.println(" В вагоне есть еще " + (standingPlaces2 - pepeopleStanding2) + " стоячих мест");
        } else {
            System.out.println(" В вагоне нет стоячих мест");
        }
        // Задача 3.1
        System.out.println(" Задача 3.1");
        int age3 = 35;
        if (age3 >= 2 && age3<= 6) {
            System.out.println(" Если возраст равен " + age3 + " годам, то ему нужно ходить в детский сад");
        } else if (age3 > 7 && age3<= 18) {
            System.out.println(" Если возраст равен " + age3 + " годам, то ему нужно ходить в школу");
        } else if (age3 > 18 && age3<= 24) {
            System.out.println(" Если возраст равен " + age3 + " годам, то ему нужно ходить в университет");
        } else if (age3 > 25) {
            System.out.println(" Если возраст равен " + age3 + " годам, то ему нужно ходить на работу");
    }
        // Задача 3.2
        System.out.println(" Задача 3.2");
        int age4 = 15;
        if (age4 < 5) {
            System.out.println(" Если возраст равен " + age4 + " годам, то он не может кататься " +
                    "на аттракционе");
        } else if (age4 < 14) {
            System.out.println(" Если возраст равен " + age4 + " годам, то он может кататься только " +
                    "в сопровождением взрослого. Если взрослого нет, кататься нельзя");
        } else {
            System.out.println(" Если возраст равен " + age4 + " годам, то он может кататься без " +
                    "сопровождения взрослого ");
        }
        // Задача 3.3
        System.out.println(" Задача 3.3");
        int one = 12;
        int two = 22;
        int fhree = 52;
        if (one > two && one > fhree) {
            System.out.println(" one большее число");
        } else if (two > one && two > fhree) {
            System.out.println(" Two большее число");
        } else if (fhree > one && fhree > two) {
            System.out.println(" Fhree большее число");
        } else if (one == two && one == fhree) {
            System.out.println(" Числа равны");

        }


    }
}