public class Program {
    static class Node {
        String data;
        Node next = null;
        Node head = null;

        public Node(String data) {
            this.data = data;
        }

        public void display() {
            System.out.print(this.data + "");
        }

        public void insert(String data) {
            Node a = new Node(data);
            if (head.next != null) {
                a.next = head.next;
            }
            head.next = a;
        }

        public boolean delete(Node delete) {
            if (delete == null || delete.next == null)
                return false;
            delete = delete.next;
            return true;
        }

        public int find(String data) {
            int a = 0;
            Node b = head;
            while (b.next != null) {
                if (b.data == data)
                    return a;
                else {
                    b = b.next;
                    a++;
                }
            }
            return 0;
        }

        public boolean rewrite(int a, String rewritable_data) {
            int num = 0;
            Node b = head;
            while (b.next != null) {
                if (num == a) {
                    b.data = rewritable_data;
                    return true;
                } else {
                    num++;
                    b = b.next;
                }
            }
            return false;
        }

        public boolean find2(String data) {
            Node b = head;
            while (b.next != null) {
                if (b.data == data)
                    return true;
                else
                    b = b.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {

    }
}