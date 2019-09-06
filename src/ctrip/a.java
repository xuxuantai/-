package ctrip;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class a {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*������������������ʵ����ĿҪ��Ĺ���
     ******************************��ʼд����******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode result = new ListNode(0);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (head != null){
            if(head.val < m){
                list1.add(head.val);
            }else{
                list2.add(head.val);
            }
            head = head.next;
        }

        ListNode node = result;
        for (int i = 0; i < list1.size(); i++) {
            node.next = new ListNode(list1.get(i));
            node = node.next;
        }
        for (int i = 0; i < list2.size(); i++) {
            node = new ListNode(list2.get(i));
            node = node.next;
        }
        return result.next;

    }
    /******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}

