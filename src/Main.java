public class Main {
    public static void main(String[] args) {
        var dog = 8.0; //8
        var cat = 3.6; //3.6
        var paper = 763789; //763789
        System.out.println(); //Задача 1
        System.out.println("Задача 1:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); //Задача 2
        System.out.println("Задача 2:");
        System.out.println(dog + 4); //12
        System.out.println(cat + 4); //7.6
        System.out.println(paper + 4); //763793
        System.out.println(); //Задача 3
        System.out.println("Задача 3:");
        System.out.println(dog - 3.5); //4.5
        System.out.println(cat - 1.6); //2.0
        System.out.println(paper - 7639); //756150
        var friend = 19; // 19
        System.out.println(); //Задача 4
        System.out.println("Задача 4:");
        System.out.println(friend); //19
        System.out.println(friend + 2); //21
        System.out.println((friend + 2) / 7); //3
        var frog = 3.5; //3.5
        System.out.println(); //Задача 5
        System.out.println("Задача 5:");
        System.out.println(frog * 10); //35.0
        System.out.println((frog * 10) / 3.5); //10.0
        System.out.println((frog * 10) / 3.5 + 4); //14.0
        var boxerWeight1 = 78.2; //78.2
        var boxerWeight2 = 82.7; //82.7
        System.out.println(); //Задача 6
        System.out.println("Задача 6:");
        System.out.println("Общая масса: " + (boxerWeight1 + boxerWeight2) + " кг"); //160.9
        System.out.println("Разница масс: " + (boxerWeight2 - boxerWeight1) + " кг"); //4.5
        System.out.println(); //Задача 7
        System.out.println("Задача 7:");
        System.out.println("Остаток от деления масс: " + (boxerWeight2 % boxerWeight1) + " кг"); //4.5
        var jobTime = 640; //640
        var workerTime = 8; //8
        System.out.println(); //Задача 8
        System.out.println("Задача 8:");
        System.out.println("Всего сотрудников в компании - " + (jobTime / workerTime) + " человек"); //80
        System.out.println("Если в компании работает - " + (jobTime / workerTime + 94) + " человека," + " то всего " + (jobTime / (jobTime / workerTime + 94)) + " часа работы может быть поделено между сотрудниками"); //174 и 3
    }
}
