package customers;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private String prefix;
    private String suffix;
    private AtomicInteger lastId = new AtomicInteger();
    private AtomicInteger id;

    public IdGenerator() {
        this.id = new AtomicInteger();
        this.prefix = "";
        this.suffix = "";
    }

    public void init(String prefix, String suffix, int lastId) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.lastId.set(0);
    }

    public String generate() {
        return this.prefix + this.lastId.incrementAndGet() + this.suffix;
    }

    public static void main(String[] args) {
        IdGenerator generator = new IdGenerator();
        generator.init("CS", "2022", 1);

        for (int i = 0; i < 5; i += 1) {
            String id = generator.generate();
            Customer sv = new Customer(id);
            System.out.println(sv.getId());
        }
    }
}