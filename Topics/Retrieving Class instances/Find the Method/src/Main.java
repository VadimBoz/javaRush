import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        Class clazz;
        String res;
        for (String item: classNames) {
            clazz = Class.forName(item);
            Method[] methods = clazz.getMethods();
            for (Method m : methods) {
                if (m.getName().equals(methodName)) {
                    res =  clazz.getName();
                    return res;
                }
            }
        }
        return  null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String[] str  = new String[] {"java.lang.String", "java.lang.StringBuffer", "java.lang.Math"};
        System.out.println(findMethod("abs", str));

    }
}