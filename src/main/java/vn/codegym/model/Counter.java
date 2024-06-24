package vn.codegym.model;

public class Counter {
    private int count;

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
/*TODO:  Trong lớp Counter chúng ta khai báo một
   biến count để tăng lượt view sau mỗi lần người dùng
   truy cập trang và một phương thức increment() để thi
    hành việc tăng giá trị cho biến count.*/
    public void increment() {
        count++;
    }
}
