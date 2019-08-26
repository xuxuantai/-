package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 通过继承LinkedHashMap并重写removeEldestEntry方法，实现LRU缓存机制
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static int MAX_CACHE_SIZE;

    /**
     * 由于Map扩容机制的影响，需要将链表长度设为Math.ceil(maxInitialSize / 0.75) + 1
     * 防止快要溢出时触发扩容机制
     * @param maxInitialSize
     */
    public LRUCache(int maxInitialSize) {
        //设置accessloader为true，可以使linkedhashmap按读取顺序排序，
        // 每次读取数据后将该数据重新回到链表尾部
        super((int) Math.ceil(maxInitialSize / 0.75) + 1, 0.75f, true);
        this.MAX_CACHE_SIZE = maxInitialSize;
    }

    /**
     * 重写该方法，可以使链表长度大于MAX_CACHE_SIZE时删除链表尾部元素，即LRU元素
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > MAX_CACHE_SIZE;
    }

}
