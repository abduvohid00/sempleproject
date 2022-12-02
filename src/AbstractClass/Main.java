package AbstractClass;

public class Main {


        public static void main(String[] args) {

            MyLinkedList myList = new MyLinkedList();

            String testData = "2 3 1 2 5 6 7 4 9 8 7 4";
            String[] dataArray =  testData.split(" ");
            for (String data : dataArray) {
                myList.addItem(new Node(data));
            }

            myList.traverse(myList.getRoot());

            myList.removeItem(new Node("7"));
            myList.traverse(myList.getRoot());
            myList.removeItem(new Node("7"));
            myList.traverse(myList.getRoot());
            myList.removeItem(new Node("9"));
            myList.traverse(myList.getRoot());
            myList.removeItem(new Node("5"));
            myList.traverse(myList.getRoot());
            myList.removeItem(myList.getRoot());
            myList.traverse(myList.getRoot());
            myList.removeItem(myList.getRoot());
            myList.traverse(myList.getRoot());
            myList.removeItem(myList.getRoot());
            myList.traverse(myList.getRoot());
            myList.removeItem(myList.getRoot());
            myList.traverse(myList.getRoot());


            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            MyLinkedList myTree = new MyLinkedList();

            String testingData = "2 3 1 2 5 6 7 4 9 8 7 4";
            String[] dataArrays =  testingData.split(" ");
            for (String data : dataArrays) {
                myTree.addItem(new Node(data));
            }

            myTree.traverse(myTree.getRoot());

            myTree.removeItem(new Node("7"));
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(new Node("7"));
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(new Node("9"));
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(new Node("5"));
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(myTree.getRoot());
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(myTree.getRoot());
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(myTree.getRoot());
            myTree.traverse(myTree.getRoot());
            myTree.removeItem(myTree.getRoot());
            myTree.traverse(myTree.getRoot());
        }


}
