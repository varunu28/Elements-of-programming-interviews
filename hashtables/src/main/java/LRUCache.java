import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    /*
    13.3
    */

  Map<Integer, Node> map;
  Node head;
  Node tail;
  private int capacity;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    map = new HashMap<>();
    head = new Node(-1, -1);
    tail = new Node(-1, -1);
    head.next = tail;
    tail.prev = head;
  }

  public Integer lookup(Integer key) {
    if (!map.containsKey(key)) {
      return null;
    }
    int val = map.get(key).val;
    removeNode(map.get(key));
    pushToHead(map.get(key));
    return val;
  }

  private void pushToHead(Node node) {
    node.next = head.next;
    node.prev = head;
    head.next.prev = node;
    head.next = node;
  }

  private void removeNode(Node node) {
    Node prev = node.prev;
    node.next.prev = prev;
    prev.next = node.next;
  }

  public Integer insert(Integer key, Integer value) {
    if (map.containsKey(key)) {
      removeNode(map.get(key));
      pushToHead(map.get(key));
    } else {
      if (map.size() == this.capacity) {
        removeTail();
      }
      Node newNode = new Node(value, key);
      map.put(key, newNode);
      pushToHead(newNode);
    }
    return 0;
  }

  private void removeTail() {
    Integer key = tail.prev.key;
    Node node = map.get(key);
    removeNode(node);
    map.remove(key);
  }

  public Integer remove(Integer key) {
    if (!map.containsKey(key)) {
      return 0;
    }
    Node node = map.get(key);
    map.remove(key);
    removeNode(node);
    return 0;
  }
}

class Node {

  int val;
  int key;
  Node next;
  Node prev;

  public Node(int val, int key) {
    this.key = key;
    this.val = val;
  }
}