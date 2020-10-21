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
    );

    public Map<String, String> withoutArgs() {
        return keyValList.stream().unordered().collect(Collectors.toMap(kv -> kv.key, kv -> kv.val));
    }

    public Map<String, String> withArgs() {
        return keyValList.stream().unordered().collect(Collectors.toMap(kv -> kv.key, kv -> kv.val, (uru, sai) -> uru, LinkedHashMap::new));
    }

}