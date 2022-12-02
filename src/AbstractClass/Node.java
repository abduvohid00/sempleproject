package AbstractClass;

public class Node extends ListItem {



    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightLink=listItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return lefttLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        lefttLink=listItem;
        return lefttLink;
    }

    @Override
    int compareTo(ListItem listItem) {
       return this.getValue().toString().compareTo(listItem.getValue().toString());
    }
}
