public class Duck implements Comparable {
    String name;
    int size;

    public Duck(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Duck name: " + name + " is size of: " + size;
    }

    @Override
    public int compareTo(Object o) {
        Duck nextDuck = (Duck) o;

        if (this.size < nextDuck.size) {
            return -1;
        } else if (this.size == nextDuck.size) {
            return 0;
        } else {
            return 1;
        }
    }
}
