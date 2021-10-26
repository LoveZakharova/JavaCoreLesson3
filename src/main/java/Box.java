import java.util.ArrayList;

public class Box <T extends Fruit, S> {

   ArrayList<T> containers;
   S name;

   public Box(S name) {
       containers = new ArrayList<>();
       this.name = name;
   }

    public S getName() {
        return name;
    }

    public double getWeight() {
       return containers.get(0).getWeight() * containers.size();
    }

    public void addContainerToBox(T t) {
            containers.add(t);
    }

    public boolean compare(Box<T, S> anotherBox) {
       if (this.getWeight() > anotherBox.getWeight()) {
           return true;
       } else {
           return false;
       }
    }

    //метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    public void pourOver(Box<T, S> anotherBox) {
        anotherBox.containers.addAll(containers);
        containers.clear();
    }

}
