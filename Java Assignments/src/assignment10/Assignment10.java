package assignment10;

public class Assignment10 {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SListIterator<String> sListIterator = sList.iterator();
        sListIterator.insert(sList, "Sample Data 1");
        sListIterator.insert(sList, "Sample Data 2");

        sListIterator.deleteFromBegining(sList);
        Node node = sList.head;
        while (node != null) {
            System.out.println("Data left in list iterator = " + node.getData());
            node = node.getNext();
        }
    }
}
