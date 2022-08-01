import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.lang.Math;
import java.util.Random;

/**
 * @author lbenb
 * @version 1.0
 */
public class demo {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        int a = -1 ;
        int abs = Math.abs(a);
        System.out.println(abs);
        for(int i = 0; i < 10; i++) {
            System.out.println((int)(2 +  Math.random() * (7 - 2 + 1)));
            //加1的原因，返回的是整数，而不是小数，所以要加1
            // random 返回的是 0 <= x < 1 之间的一个随机小数
        }

    }
    @Test
    public void demo01() {

        System.out.println();
    }
}
