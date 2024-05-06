package Jobsheet9;

public class SingleLinkedList {
    public SingleLinkedList(){
        System.out.println("hello");
        head=null;
        tail=null;
    }


    Node head, tail;
    boolean isEmpty() {
        //return head != null;
        return head == null;
    }


    void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input , null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            //ndInput.next= head;
            //head = ndInput;
        }else {
            //head = ndInput;
            //tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input,null);
        if(isEmpty()){
            //tail.next = ndInput;
            //tail= ndInput;
            head = ndInput;
            tail = ndInput;
        }else {
           // head = ndInput;
            //tail = ndInput;
            tail.next = ndInput;
            tail= ndInput;
        }
    }

    void insertAfter (int key, int input){
        Node ndInput = new Node(input,null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next=temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){//ganti dengan == 
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        }while(temp != null);//ganti dengan != 
        
    }

    void insertAt(int index, int input) {
      
        //Node ndInput = new Node(input, null);//tidak usah dipakai
        if (index < 0) {
          System.out.println("Perbaiki Logikanya!!"
          + "kalau indexnya -1 bagaimana???");
        }else if (index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next==null){
                tail=temp.next;
            }
        }
    }

      
}


