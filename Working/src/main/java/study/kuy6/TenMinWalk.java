package study.kuy6;

import org.junit.Test;
import static org.junit.Assert.*;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length != 10) return false;
        int vertical = 0, horizontal = 0;
        for(Character item: walk){
            if(item == 'w' || item == 'e')
                if (item == 'e') horizontal++;
                else horizontal--;
            else
                if(item == 's') vertical++;
                else vertical--;
        }
        return vertical ==  0 && horizontal == 0;
    }
}