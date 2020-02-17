package oracle;

public class Oracle {

    private static Oracle instance = new Oracle();
    private ServiceA serviceA;
    private ServiceB serviceB;

    private Oracle() {

        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }

    public static Oracle getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("publicPrint : " + m);
    }

    public ServiceAInterface getServiceAInterface() {

        return (ServiceAInterface)serviceA;
    }

    public ServiceBInterface getServiceBInterface() {

        return (ServiceBInterface)serviceB;
    }

    ServiceA getServiceA() {

        return serviceA;
    }
}