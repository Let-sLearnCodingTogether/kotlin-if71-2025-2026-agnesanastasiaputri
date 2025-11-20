package interoperability;

public class CallKotlinCodeFromJava {
    public static void main(String[] args){
        System.out.println("Hello from java");

        //TYPE_DATA NAMA_vARIABLE = NEW NAMA_CLASS
        CounterExampleKotlin counter1 = new CounterExampleKotlin();

        System.out.println(counter1.getNumber());
        counter1.increment();
        System.out.println(counter1.getNumber());

        System.out.println(StringUtilsKt.isEmail("test@mail.com"));

        Logger logger = new Logger();
        logger.log("Aplikasi dimulai");
        logger.log("Aplikasi dimulai", "DEBUG");

        String dbUrl = Database.Companion.getConnectionUrl();
        String dbUrl2 = Database.getConnectionUrl();
        System.out.println(dbUrl);
    }
}
