package jp.aohno;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMap {
    public final List<KeyVal> keyValList = List.of(
        new KeyVal("key1", "val1")
        , new KeyVal("key2", "val2")
        , new KeyVal("key3", "val3")
        , new KeyVal("key4", "val4")
        , new KeyVal("key5", "val5")
        , new KeyVal("key6", "val6")
        , new KeyVal("key7", "val7")
        , new KeyVal("key8", "val8")
    );

    public Map<String, String> withoutArgs() {
        return keyValList.stream().collect(Collectors.toMap(kv -> kv.key, kv -> kv.val));
    }

    public Map<String, String> withArgs() {
        return keyValList.stream().collect(Collectors.toMap(kv -> kv.key, kv -> kv.val, (uru, sai) -> uru, LinkedHashMap::new));
    }

}