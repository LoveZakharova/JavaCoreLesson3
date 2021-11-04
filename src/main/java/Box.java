import java.util.ArrayList;

public class Box <T extends Fruit> {

   ArrayList<T> containers;

   public Box() {
       containers = new ArrayList<>();
   }

    public double getWeightOfBox() {
       if (containers.isEmpty())
           return 0;
       else
       return containers.get(0).getWeight() * containers.size();
    }

    public void addContainerToBox(T t) {
            containers.add(t);
    }

    public boolean compare(Box<?> box) {
       if (this.getWeightOfBox() > box.getWeightOfBox()) {
           return true;
       } else {
           return false;
       }
    }

    //метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    public void pourOver(Box<T> box) {
        box.containers.addAll(containers);
        containers.clear();
    }

}
