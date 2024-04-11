package study.kuy6;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map <Character, Long> map = new HashMap<>();
        var a = 0;
        for(Character item:text.toLowerCase().toCharArray()){
            map.put(item, text.toLowerCase().chars().filter(ch->ch == item).count());
        }
        for(Character item : map.keySet()){
            if(map.get(item)>1) a++;
        }
        return a;
    }
}
