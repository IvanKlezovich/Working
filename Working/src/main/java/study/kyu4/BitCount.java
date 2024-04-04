package study.kyu4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BitCount {
    private static BigInteger onespower(long number){
        long sum = 0, remaining = number, one = 0;
        String bin = Long.toBinaryString(number);
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1'){
                one++;
                remaining = (long) (remaining - Math.pow(2, 32 - i - 1) + remaining);
                sum = (long) (sum + Math.pow(2, 32 - i - 1) * (32-i-1) + remaining);
            }
        }
        return new BigInteger(String.valueOf(sum)).add(BigInteger.valueOf(one));
    }
    public static BigInteger countOnes(long left, long right) {
        return  onespower(right).add(onespower(left - 1).multiply(new BigInteger(String.valueOf(-1))));
    }
    @Test
    public void sampleTests() {
        assertEquals(new BigInteger("7"), BitCount.countOnes(5,7));
        assertEquals(new BigInteger("51"), BitCount.countOnes(12,29));
    }
}
