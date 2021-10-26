public class Main {
    public static void main(String[] args) {
        Box<Apple, String> box1 = new Box("Самые вкусные");
        Box<Apple, String> box3 = new Box("Земляничка");
        Box<Orange, String> box2 = new Box("Турция");

        System.out.println(box1.getName());
        System.out.println(box2.getName());

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        box1.addContainerToBox(apple1);
        box1.addContainerToBox(apple2);
        box1.addContainerToBox(apple3);

        box2.addContainerToBox(orange1);
        box2.addContainerToBox(orange2);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

        System.out.println(box1.compare(box3));

        //вызов метода пересыпания
        System.out.println(box1.pourOver(box3));

        //вес после пересыпки
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());
    }


}
