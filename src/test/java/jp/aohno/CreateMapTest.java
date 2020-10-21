package jp.aohno;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.LinkedHashMap;

@RunWith(JUnit4.class)
public class CreateMapTest {
    @Test
    public void hash() {
        var createMap = new CreateMap();
        var successMap = new LinkedHashMap<String, String>();
        for (KeyVal keyVal : createMap.keyValList) {
            successMap.put(keyVal.key, keyVal.val);
        }

        System.out.println("createMap.withArgs() = " + createMap.withArgs());
        Assert.assertEquals(createMap.withArgs().entrySet(), successMap.entrySet());
        Assert.assertNotEquals(createMap.withoutArgs().entrySet(), successMap.entrySet()); // 普通にやったら順序正常になってしまっているー　・。・??
    }
}
