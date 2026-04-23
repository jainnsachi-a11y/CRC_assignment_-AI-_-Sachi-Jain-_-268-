public class QueueArray {
    int front = 0, rear = -1;
    int[] queue = new int[5];
    void enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("Overflow");
            return;
        }
        queue[++rear] = x;
    }
    void dequeue() {
        if (front > rear) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
    }
    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10); q.enqueue(20); q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}