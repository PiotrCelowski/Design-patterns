import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        PersonComponent Piotr = new PersonComponenentImpl("Piotr", "male", "motorcycles" );
        PersonComponent Jyoti = new PersonComponenentImpl("Jyoti", "female", "physics");
        Piotr.setBeautyRanking(5);
        Jyoti.setBeautyRanking(20);

        PersonComponent proxyOwner = getProxyForPersonComponentOwner(Piotr);
        proxyOwner.setInterests("sailing");
        try{
            proxyOwner.setBeautyRanking(20);
        } catch (Exception ex) {
            System.out.println("You can't evaluate yourself.");
        }

        PersonComponent proxyNotOwner = getProxyForPersonComponentNotOwner(Jyoti);
        proxyNotOwner.setBeautyRanking(40);
        try {
            proxyNotOwner.setGeneder("male");
        } catch (Exception ex) {
            System.out.println("You can't set gender of another user.");
        }

        System.out.println("User: " + Piotr.getName() + ", " + Piotr.getGender() + ", " + Piotr.getInterests() + ", " + Piotr.getBeautyRanking());
        System.out.println("User: " + Jyoti.getName() + ", " + Jyoti.getGender() + ", " + Jyoti.getInterests() + ", " + Jyoti.getBeautyRanking());
    }

    public static PersonComponent getProxyForPersonComponentOwner(PersonComponent person) {
        return (PersonComponent) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new InvocationHandlerOwner(person));
    }

    public static PersonComponent getProxyForPersonComponentNotOwner(PersonComponent person) {
        return (PersonComponent) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new InvocationHandlerNotOwner(person));
    }
}
