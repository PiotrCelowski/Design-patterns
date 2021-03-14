import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandlerNotOwner implements InvocationHandler {
    PersonComponent person;

    public InvocationHandlerNotOwner(PersonComponent person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("setBeautyRanking")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
