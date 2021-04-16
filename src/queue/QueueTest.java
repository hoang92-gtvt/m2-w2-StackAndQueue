package queue;


import javafx.scene.Node;

import java.util.Queue;



import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {

        Queue queen2 = new LinkedList<>();

        // thêm một phần tử vào queue;
        queen2.add(1);
        queen2.add(2);
        queen2.add(3);
        queen2.offer(4);
        queen2.add(5);
        System.out.println(queen2);
        System.out.println("------------------");
        // lay ra mot phan tu o hang doi
        System.out.println(queen2.peek());
        System.out.println(queen2.element());
        System.out.println(queen2);
        System.out.println("------------------");

        // xoa bỏ 1phan tu o hang doi
        System.out.println(queen2.poll());
        System.out.println(queen2.remove());
        System.out.println(queen2);
        System.out.println("------------------");
        // kiểm tra trạng thái của hàng dợi
        System.out.println(queen2.contains(10));
        System.out.println(queen2.isEmpty());
        System.out.println(queen2.size());
        //kiểm tra dữ liệu phần tử trong hàm đợi
        if(queen2.peek()instanceof Integer){
            System.out.println("du lieu kieu int");
        }



        // duyejt phan tu trong hang doi ( chỉ ap dụng khi có generic cụ thể đc khai báo);

//        for (String e: queen2) {
//            System.out.println(e + "\t");
//
//        }

        Queue<String>  queen3 =new LinkedList<>();
        queen3.add("1");
        queen3.add("2");
        queen3.add("3");
        for (String e: queen3) {
            System.out.println(e + "\t");
//
        }








    }

}
