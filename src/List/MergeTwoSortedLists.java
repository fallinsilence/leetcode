package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 21. Merge Two Sorted Lists
 */

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        one.next = new ListNode(3);
        one.next.next = new ListNode(4);

        ListNode two = new ListNode(1);
        two.next = new ListNode(1);
        two.next.next = new ListNode(4);

        new MergeTwoSortedLists().mergeTwoLists(one, two);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //存储两个列表中所有的数字
        List<Integer> allNode = new ArrayList();
        //最终返回的ListNode
        ListNode mergedList = null;
        //在mergedList后不断追加的ListNode
        ListNode appendNode = null;

        //遍历l1, l2所有结点的值，排序后将其加入allNode列表
        while (l1 != null) {
            allNode.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            allNode.add(l2.val);
            l2 = l2.next;
        }

        allNode.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


        //遍历allNode所有结点，将其转换为ListNode
        Iterator<Integer> iterator = allNode.iterator();
        while (iterator.hasNext()) {

            if (mergedList == null) {
                mergedList = new ListNode(iterator.next());
                appendNode = mergedList;

            } else {
                appendNode.next = new ListNode(iterator.next());
                appendNode = appendNode.next;

            }
        }
        return mergedList;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


