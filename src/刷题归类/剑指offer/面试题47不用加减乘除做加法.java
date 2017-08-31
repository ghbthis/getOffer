package 刷题归类.剑指offer;

/**
 * 解题思路

 　　5 的二进制是101, 17 的二进制是10001 。还是试着把计算分成三步：第一步各位相加但不计进位， 得到的结果是10100 （ 最后一位两个数都是1,相加的结果是二进制的10 。这一步不计进位， 因此结果仍然是0 。第二步记下进位。在这个例子中只在最后一位相加时产生一个进位，结果是二进制的10 。 第三步把前两步的结果相加，得到的结果是10110 ， 转换成十进制正好是22。由此可见三步走的策略对二进制也是适用的。
 　　接下来我们试着把二进制的加法用位运算来替代。第一步不考虑进位对每一位相加。0加0 、1加1的结果都0。 0加1 、1 加0的结果都是1 。我们注意到，这和异或的结果是一样的。对异或而言， 0和0、1和1异或的结果是0， 而0和1 、1和0的异或结果是1 。接着考虑第二步进位，对加0 、0 加1 、1加0而言， 都不会产生进位，只有1加1 时，会向前产生一个进位。此时我们可以想象成是两个数先做位与运算，然后再向左移动一位。只有两个数都是1的时候，位与得到的结果是1，其余都是0。第三步把前两个步骤的结果相加。第三步相加的过程依然是重复前面两步， 直到不产生进位为止。
 */
public class 面试题47不用加减乘除做加法 {
    public static int add(int x, int y) {
        int sum;
        int carry;

        do {
            sum = x ^ y;
            // x&y的某一位是1说明，它是它的前一位的进位，所以向左移动一位
            carry = (x & y) << 1;

            x = sum;
            y = carry;
        } while (y != 0);

        return x;
    }
}
