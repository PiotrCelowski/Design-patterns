import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandlerOwner implements InvocationHandler {
    PersonComponent person;

    public InvocationHandlerOwner(PersonComponent person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("setBeautyRanking")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
