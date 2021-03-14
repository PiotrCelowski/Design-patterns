public abstract class CaffeineDrink {
    void recipe() {
        boilingWater();
        breweing();
        pouringToGlass();
        if (wantsExtras()) {
            addingExtras();
        }
    }

    void boilingWater() {
        System.out.println("Boiling water.");
    }

    abstract void breweing();

    void pouringToGlass() {
        System.out.println("Pouring to the glass.");
    }

    boolean wantsExtras() {
        return true;
    }

    abstract void addingExtras();
}
