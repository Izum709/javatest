package ProjectLaptop;
import java.util.*;
public class ConsoleWork {
    Map<Integer, Laptop> listOfAvailableLaptops = new TreeMap<>();

    int key = 1;

    Laptop laptop1 = new Laptop("huawei", "matebook","black",
            "windows", "15.6", "4", "8" , "256", "4");
    Laptop laptop2 = new Laptop("asus","vivoBook", "white",
            "linux","15.6","8", "16", "512", "4");
    Laptop laptop3 = new Laptop("hp","pavilion","silver",
            "windows", "15.0", "4", "16", "512","8" );
    Laptop laptop4 = new Laptop("lenovo", "yoga", "silver",
            "na", "16.1", "4", "8", "1024", "4");
    Laptop laptop5 = new Laptop("asus", "vivoBook", "white",
            "windows","17.0", "8", "16", "512", "4");
    Laptop laptop6 = new Laptop("msi", "katana", "black",
            "windows", "16.1", "6", "4", "512", "4");
    Laptop laptop7 = new Laptop("hp", "laptop", "silver",
            "Linux", "15.6", "4", "8", "256", "4");
    Laptop laptop8 = new Laptop("hp", "victus","Black",
            "windows", "16.1", "8", "16", "1024","6");
    Laptop laptop9 = new Laptop("msi","alpha", "silver",
            "Windows", "15.6", "6", "8", "512", "8");
    Laptop laptop10 = new Laptop("hp", "omen", "gray",
            "windows", "16.1", "6", "16", "512", "8");

    public void consoleStartMenu() {

        String helloUser = "\n\t\tДобро пожаловать в программу по подбору ноутбука поп параметрам\n";
        String info  = "Варианты команд:\n" +
                "1 - подбор ноутбука\n2 - Печать всех имеющихся ноутбуков\n3 - Выход из программы";
        System.out.println(helloUser);
        boolean work = true;
        while (work){

            System.out.println(info);
            System.out.println("Введите команду");
            String command = new Scanner(System.in).nextLine().toLowerCase().trim();
            switch (command){
                case "1":
                    filterByParameter();
                    break;
                case "2":
                    printListOfAvailableLaptops(listOfAvailableLaptops);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Программа по подбору ноутбука закрыта");
                    work = false;
                    break;
                default:
                    System.out.println("Ошибка ввода введите цифру из перечисленных");
                    System.out.println(info);
                    break;
            }

        }

    }

    private void filterByParameter() {

        boolean work = true;
        while (work){
            String info = "Укажите параметры выбора\n";
            String parameter = "1"+" - Выход в предыдущее меню\n"+
                    "2" +" - Печать ноутбуков подходящих по параметрам\n"+"3"+" - Бренд\n"+"4 - Название\n" +
                    "5 - Цвет\n"+"6 - Операционная система\n"+"7 - Диагональ Монитора\n"+"8 - Количество ядер\n"+
                    "9 - Оперативная память\n"+"10 - Встроенная память\n"+"11 - Объем видеопамяти\n";
            System.out.println(info+parameter);
            String command = new Scanner(System.in).nextLine();
           switch (command){
               case "1":
                   work = false;
                   break;
               case "2":
                   printListOfAvailableLaptops(listOfAvailableLaptops);
                   break;
               case "3":
                   System.out.println("\tПоиск по параметру бренд\n");
                   filterByBrand();
                   break;
               case "4":
                   System.out.println("\tПоиск по параметру имя\n");
                   filterByName();
                   break;
               case "5":
                   System.out.println("\tПоиск по параметру цвет\n");
                   filterByColor();
                   break;
               case "6":
                   System.out.println("\tПоиск по параметру операционная система\n");
                   filterByOperationSystem();
                   break;
               case "7":
                   System.out.println("\tПоиск по параметру диагональ монитора\n");
                   filterByMonitorDiagonal();
                   break;
               case "8":
                   System.out.println("\tПоиск по параметру количество ядер\n");
                   filterByCores();
                   break;
               case "9":
                   System.out.println("\tПоиск по параметру оперативная память\n");
                   filterByRamMemory();
                   break;
               case "10":
                   System.out.println("\tПоиск по параметру встроенная память\n");
                   filterBySsdMemory();
                   break;
               case "11":
                   System.out.println("\tПоиск по параметру объем видеопамяти\n");
                   filterByVideoRam();
                   break;
               default:
                   System.out.println(info+parameter);
                   break;
           }
        }
    }

    void addAvailableLaptops( Laptop laptop) {


        if (listOfAvailableLaptops.containsKey(key)){
            key++;
        }
        listOfAvailableLaptops.put(key, laptop);

    }
    public void printListOfAvailableLaptops(Map<Integer, Laptop> map){
        if (listOfAvailableLaptops.isEmpty()){
            System.out.println("\tНет ноутбуков с такими параметрами\n");
        }
        for (Map.Entry<Integer, Laptop> mapListOfAvailableLaptops : listOfAvailableLaptops.entrySet()){
            System.out.println(mapListOfAvailableLaptops.getKey()+" - "+mapListOfAvailableLaptops.getValue());


        }
    }

    public void filterByBrand() {
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getBrand().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }

    public void filterByName(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getName().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }
    public void filterByColor(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getColor().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }
    public  void filterByOperationSystem(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getOperationSystem().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }
    public void filterByMonitorDiagonal(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();

        Iterator<Map.Entry<Integer,Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();
        if(parameter.matches("[A-z]+")) {
            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getMonitorDiagonal().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }

    public void filterByCores(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();

        Iterator<Map.Entry<Integer,Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();
        if(parameter.matches("[A-z]+")) {
            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getCores().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }
    public void filterByRamMemory(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getRamMemory().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }

    public void filterBySsdMemory(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getSsdMemory().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }

    public void filterByVideoRam(){
        String parameter = new Scanner(System.in).nextLine().toLowerCase();
        if(parameter.matches("[A-z]+")) {
            Iterator<Map.Entry<Integer, Laptop>> iterator = listOfAvailableLaptops.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Laptop> entry = iterator.next();
                if (!entry.getValue().getVideoRam().contains(parameter)) {
                    iterator.remove();
                }
            }
        }
        else {
            System.out.println("\tВводите на латыни\n");
        }
    }
}
