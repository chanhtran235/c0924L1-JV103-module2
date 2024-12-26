package ss11_generic_stack_queue;

import ss8_mvc.model.Student;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        // trong java KDL nào ? mà có thể lưu được
//        // => Object
//        arrayList.add (1);
//        arrayList.add ("Hello");
//        arrayList.add (new Student());
////        ((Student)arrayList.get(0)).getName();
//        if (arrayList.get(2) instanceof Student){
//            ((Student)arrayList.get(2)).setName("fsfs");
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student());
//        System.out.println(students.get(0).getId());
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Box<Integer> box = new Box();

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);
//        System.out.println(integerStack.size());
//        System.out.println(integerStack.pop()); // 30
//        System.out.println(integerStack.pop());//20
//        System.out.println(integerStack.pop());//30
//        System.out.println(integerStack.size());
//        int size = integerStack.size();
//        for (int i = 0; i <size ; i++) {
//            System.out.println(integerStack.pop());
//        }
        //50,40,30
//          while (!integerStack.empty()){
//              System.out.println(integerStack.peek());
//          }

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        System.out.println(queue.poll());


    }



}
