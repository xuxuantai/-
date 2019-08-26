package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ͨ���̳�LinkedHashMap����дremoveEldestEntry������ʵ��LRU�������
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static int MAX_CACHE_SIZE;

    /**
     * ����Map���ݻ��Ƶ�Ӱ�죬��Ҫ����������ΪMath.ceil(maxInitialSize / 0.75) + 1
     * ��ֹ��Ҫ���ʱ�������ݻ���
     * @param maxInitialSize
     */
    public LRUCache(int maxInitialSize) {
        //����accessloaderΪtrue������ʹlinkedhashmap����ȡ˳������
        // ÿ�ζ�ȡ���ݺ󽫸��������»ص�����β��
        super((int) Math.ceil(maxInitialSize / 0.75) + 1, 0.75f, true);
        this.MAX_CACHE_SIZE = maxInitialSize;
    }

    /**
     * ��д�÷���������ʹ�����ȴ���MAX_CACHE_SIZEʱɾ������β��Ԫ�أ���LRUԪ��
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > MAX_CACHE_SIZE;
    }

}
