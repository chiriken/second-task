public class Main {
    public static void main(String[] args) {
     System.out.println("Task 1");
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Task 6");
        var numberOneBoxer = 78.2;
        var numberTwoBoxer = 82.7;
        System.out.println("Вес первого боксера " + numberOneBoxer + " кг!");
        System.out.println("Вес второго боксера " + numberTwoBoxer + " кг!");
        var totalWeight = numberTwoBoxer + numberOneBoxer;
        System.out.println("Общий вес " + totalWeight + " кг!");
        var differenceBoxer = numberTwoBoxer - numberOneBoxer;
        System.out.println("Разница между бойцами  " + differenceBoxer + " кг!");
        System.out.println("Task 6");
        var boxerResidue = numberTwoBoxer % numberOneBoxer;
        System.out.println("Остаток от деления " + boxerResidue + " кг!");
        System.out.println("Task 8");
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек.");
        totalEmployees = totalEmployees + 94;
        System.out.println("Всего " + totalEmployees + " сотрудников в компании.");
        var timeDilation = (double) totalHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + timeDilation + " чассов работы может быть поделено между сотрудниками!");


    }

}