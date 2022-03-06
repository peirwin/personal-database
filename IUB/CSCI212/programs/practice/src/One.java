import java.math.*;
public class One {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = new BigDecimal("3");
        BigDecimal d = new BigDecimal("4");
        BigDecimal e = new BigDecimal("5");

        System.out.println("a.add(b).multiply(c).add(d).subtract(e)");
        System.out.println(a.add(b).multiply(c).add(d).subtract(e));
    }    
}
