public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box();
        Box<Apple> box3 = new Box();
        Box<Orange> box2 = new Box();

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

        System.out.println(box1.getWeightOfBox());
        System.out.println(box2.getWeightOfBox());
        System.out.println(box3.getWeightOfBox());

        System.out.println(box1.compare(box3));
        System.out.println(box1.compare(box2));

        //вызов метода пересыпания
        box1.pourOver(box3);

        //вес после пересыпки
        System.out.println(box1.getWeightOfBox());
        System.out.println(box3.getWeightOfBox());
    }


}
