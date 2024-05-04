import java.util.LinkedList;
import java.util.Scanner;

/**
 * @project_name: Algorithm-Java
 * @description:
 * @author: HaoLong
 * @data: 2024/5/4 19:17
 */
public class 设计一个有getMin功能的栈 {
    public static LinkedList<Integer> stack = new LinkedList<>();

    public static LinkedList<Integer> stackMin = new LinkedList<>();

    public static void push(Integer num) {
        stack.push(num);
        if (stackMin.isEmpty()) {
            stackMin.push(num);
            return;
        }
        if (stackMin.peek() >= num) {
            stackMin.push(num);
        }
    }

    public static void pop() {
        if (stack.isEmpty()) {
            return;
        }
        Integer pop = stack.pop();
        if (!stackMin.isEmpty() && stackMin.peek() == pop) {
            stackMin.pop();
        }
    }

    public static Integer getMin() {
        if (stackMin.isEmpty()) {
            return -1;
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while(n-- > 0) {
            String option = cin.next();
            if ("push".equals(option)) {
                int num = cin.nextInt();
                push(num);
            } else if ("pop".equals(option)){
                pop();
            } else  if ("getMin".equals(option)) {
                System.out.println(getMin());
            }
        }

    }
}
